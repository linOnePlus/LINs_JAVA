package com.lin.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lin.exception.MyException;
import com.lin.pojo.Items;
import com.lin.pojo.QueryVo;
import com.lin.service.ItemService;

/**
 * 商品管理
 * 
 * @author lin
 *
 */
@Controller
//@RequestMapping("/item")//item/item/itemlist.action才能访问到主页
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "index")
	public ModelAndView itemList() throws MyException{
		/*
		 * //测试异常
		 *  if(true) { throw new MyException("自定义异常"); }
		 *  int a= 1/0;
		 */
		//从Mysql中查询
		List<Items> list = itemService.selectItemsList();
		
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}

	//day02:高级参数绑定之数组
	@RequestMapping("/delete.action")
public ModelAndView delete(Integer [] ids) {
		
		
		ModelAndView modelAndView = new  ModelAndView();
		modelAndView.setViewName("success");
		System.out.println(ids.length);
		return modelAndView;
	}
	
	//高级参数绑定之list集合
	@RequestMapping("/testlist")
	public String testList(QueryVo queryVo) {
		System.out.println(queryVo.getItemList());
		return "success";
	}
	//@requestmapping多个值绑定同一个方法的时候只能用value数组
	@RequestMapping(value= {"/testlist","/wtf"})
	public String testRequstMapping01(QueryVo queryVo) {
		System.out.println(queryVo.getItemList());
		return "success";
	}
	//@requestmapping绑定了method属性之后只有post请求能触发该控制器
	@RequestMapping(value= {"/testlist","/wtf"},method = RequestMethod.POST)
	public String testRequstMapping02(QueryVo queryVo) {
		System.out.println(queryVo.getItemList());
		return "success";
	}
	//测试返回值为void时的请求转发
	@RequestMapping("testcontroller01")
	public void testVoidController(HttpServletRequest request, HttpServletResponse response) {
		try {
			//注意路径的写法
			request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	 //测试返回值为void时的重定向以及发数据
		@RequestMapping(value = "testcontroller02")
		public void testVoidController02(HttpServletRequest request, HttpServletResponse response) {
			try {
				response.getWriter().print("hellospringmvc");
//				response.sendRedirect("/WEB-INF/jsp/success.jsp");不能重定向到web-inf文件夹下的文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//测试字符串返回式重定向
		@RequestMapping("testcontroller03")
		public String testStringController03() {
			// 重定向后浏览器地址栏变更为重定向的地址，
			// 重定向相当于执行了新的request和response，所以之前的请求参数都会丢失
			// 如果要指定请求参数，需要在重定向的url后面添加 ?itemId=1 这样的请求参数
			return "redirect:/testcontroller02.action";
		}
		
		//测试字符串返回式请求转发
		@RequestMapping("testcontroller04")
		public String testStringController04() {
			// 重定向后浏览器地址栏变更为重定向的地址，
			// 重定向相当于执行了新的request和response，所以之前的请求参数都会丢失
			// 如果要指定请求参数，需要在重定向的url后面添加 ?itemId=1 这样的请求参数
			return "forward:/testcontroller02.action";
		}
		
		//修改信息显示页面信息
		@RequestMapping(value = "/itemEdit.action")
		public ModelAndView toEdit(Integer id,
				HttpServletRequest request,HttpServletResponse response
				,HttpSession session,Model model){
			
			Items items = itemService.selectItemsById(id);
			ModelAndView mav = new ModelAndView();
			//数据
			mav.addObject("item", items);
			mav.setViewName("editItem");
			return mav;
		}
		
		//上传修改信息（省略）以及上传图片
		@RequestMapping(value="updateitem.action")
		public String updatePic(Items items,@RequestParam(value="pictureFile",required = false) MultipartFile  multipartFile) throws IllegalStateException, IOException {
			//设置图片保存到服务器时候的名字
			String picName =  UUID.randomUUID().toString();
			//获取文件上传时的名字
			String originalPicName=multipartFile.getOriginalFilename();
			//获取文件后缀名
			String extName = originalPicName.substring(originalPicName.lastIndexOf("."));
			// 开始上传	
			multipartFile.transferTo(new File("E:/pic/"+picName+extName));
			// 设置图片名到商品中
			items.setPic(picName + extName);
			// 更新商品
		     itemService.updateItemsById(items);

			return "success";
		}
		
		//测试json数据交互
		@RequestMapping(value="json.action")
		public @ResponseBody Items jsonTest(@RequestBody Items items) {
			System.out.println(items);//测试requestbody将json转换成pojo
			return items;
		}
}
