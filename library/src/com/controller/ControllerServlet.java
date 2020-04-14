package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import com.dao.BookDao;
import com.dao.BorrowDao;
import com.dao.ReaderDao;
import com.dao.UserDao;
import com.model.Book;
import com.model.Reader;
import com.model.User;
/**
 * servlet 控制层
 * 
 */
public class ControllerServlet extends HttpServlet {
	/**
	 */
	private static final long serialVersionUID = -5535923214854787870L;

	BookDao bookDao = new BookDao();
	UserDao userDao = new UserDao();
	BorrowDao borrowDao = new BorrowDao();
	ReaderDao readerDao = new ReaderDao();

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String oper = request.getParameter("oper");
		if ("delete".equals(oper)) {
		    //删除记录
			delete(request, response);
		} else if ("logout".equals(oper)) {
		     //管理员退出
			logout(request, response);
		} else if ("logout2".equals(oper)) {
		  //读者退出
		    logout2(request, response);
		} else if ("borrow".equals(oper)) {
		    //借阅
		    borrow(request, response);
		} else if ("returnBook".equals(oper)) {
		    //还书
		    returnBook(request, response);
		} else if ("bookForm".equals(oper)) {
			//图片管理
		    bookForm(request, response);
		} else if ("userForm".equals(oper)) {
		    //读者管理
			userForm(request, response);
		} else if ("adminLogin".equals(oper)) {
		    //管理员登录
		    adminLogin(request, response);
		} else if ("login".equals(oper)) {
		    //读者登录
            login(request, response);
        } else if ("register".equals(oper)) {
            //读者注册
            register(request, response);
        }
	}
	
	
	private void register(HttpServletRequest request,
        HttpServletResponse response) throws IOException {
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        JSONObject json = new JSONObject();
        
        String username =  request.getParameter("username");
        String password =   request.getParameter("password");
        String name =   request.getParameter("name");
        String num =  request.getParameter("num");
        
        Reader model = new Reader();
        model.setName(name);
        model.setPassword(password);
        model.setNum(num);
        model.setUsername(username);
        
        if (readerDao.getByUsername(username) != null) {
            json.put("code", 1);
            json.put("msg", "用户名称已存在");
            writer.write(json.toString());
            return;
        }
        
        
        if (!readerDao.add(model)) {
            json.put("code", 1);
            json.put("msg", "注册失败,请稍后重试。");
            writer.write(json.toString());
            return;
        }
        
        request.getSession().setAttribute("reader", readerDao.getByUsername(username));
        json.put("code", 0);
        writer.write(json.toString());
        
    }
	
	
	private void adminLogin(HttpServletRequest request,
	    HttpServletResponse response) throws IOException {
	    response.setHeader("Cache-Control", "no-cache");
	    response.setContentType("text/plain;charset=UTF-8");
	    PrintWriter writer = response.getWriter();
	    JSONObject json = new JSONObject();
	    
	    
	    String username =request.getParameter("username");
	    String password =request.getParameter("password");
	    if (username != null) {
	        User model = userDao.getUserByUsername(username);
	        if (model != null&&model.getPassword().equals(password)) {
	            request.getSession().setAttribute("user", model);
	            json.put("code", 0);
	        } else {
	            json.put("code", 1);
	            json.put("msg", "用户名或密码不正确");
	        }
	    }else{
	        json.put("code", 1);
	        json.put("msg", "请输入用户名");
	    }
	    
	    writer.write(json.toString());
	    
	}
	
	private void login(HttpServletRequest request,
        HttpServletResponse response) throws IOException {
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        JSONObject json = new JSONObject();
        
        
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        if (username != null) {
            Reader model = readerDao.getByUsername(username);
            if (model != null&&model.getPassword().equals(password)) {
                request.getSession().setAttribute("reader", model);
                json.put("code", 0);
            } else {
                json.put("code", 1);
                json.put("msg", "用户名或密码不正确");
            }
        }else{
            json.put("code", 1);
            json.put("msg", "请输入用户名");
        }
        
        writer.write(json.toString());
        
    }
	

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void forward(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HttpSession session = request.getSession();
		// String username = request.getParameter("username");
		// String password = request.getParameter("password");

		response.sendRedirect("index.jsp");

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void bookForm(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		JSONObject json = new JSONObject();

		String id = request.getParameter("id");
		String code = request.getParameter("code");
		String author = request.getParameter("author");
		String name = request.getParameter("name");
		String page = request.getParameter("page");
		String press = request.getParameter("press");
		String price = request.getParameter("price");
		String type = request.getParameter("type");
		Book book = new Book();

		book.setAuthor(author);
		book.setCode(code);
		book.setName(name);
		book.setPage(page);
		book.setPress(press);
		book.setPrice(price);
		book.setType(type);

		if ("".equals(id)) { // add
			if (!bookDao.add(book)) {
				json.put("code", 1);
				json.put("msg", "新增失败");
				writer.write(json.toString());
				return;
			}
		} else { // update
			book.setId(id);
			if (!bookDao.update(book)) {
				json.put("code", 1);
				json.put("msg", "更新失败");
				return;
			}
		}

		json.put("code", 0);
		writer.write(json.toString());

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void userForm(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		JSONObject json = new JSONObject();

		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		User user = new User();
		user.setType(type);
		user.setUsername(username);
		user.setPassword(password);

		if ("".equals(id)) { // add
			if (userDao.getUserByUsername(username) != null) {
				json.put("code", 1);
				json.put("msg", "用户名称已存在");
				writer.write(json.toString());
				return;
			}

			if (!userDao.add(user)) {
				json.put("code", 1);
				json.put("msg", "新增失败");
				writer.write(json.toString());
				return;
			}
		} else { // update
			user.setId(id);
			if (!userDao.update(password, id)) {
				json.put("code", 1);
				json.put("msg", "更新失败");
				return;
			}
		}

		json.put("code", 0);
		writer.write(json.toString());

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void delete(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		JSONObject json = new JSONObject();

		String id = request.getParameter("id");
		String type = request.getParameter("type");
		boolean result = false;

		if ("book".equals(type)) {
			result = bookDao.deleteById(id);
		} else if ("user".equals(type)) {
		    result = userDao.deleteById(id);
		}
		
		if (result) {
			json.put("code", 0);
		} else {
			json.put("code", 1);
			json.put("msg", "删除失败");
		}

		writer.write(json.toString());

	}

	private void borrow(HttpServletRequest request, HttpServletResponse response)
	    throws IOException {
	    response.setHeader("Cache-Control", "no-cache");
	    response.setContentType("text/plain;charset=UTF-8");
	    PrintWriter writer = response.getWriter();
	    JSONObject json = new JSONObject();
	    
	    String readerId = request.getParameter("readerId");
	    String bookId = request.getParameter("bookId");
	    boolean result = false;
	    
	    result =borrowDao.add(readerId, bookId);
	    
	    if (result) {
	        bookDao.updateBook(bookId,"-");
	        json.put("code", 0);
	    } else {
	        json.put("code", 1);
	        json.put("msg", "借阅失败，请稍后重试。");
	    }
	    
	    writer.write(json.toString());
	    
	}

	private void returnBook(HttpServletRequest request, HttpServletResponse response)
	    throws IOException {
	    response.setHeader("Cache-Control", "no-cache");
	    response.setContentType("text/plain;charset=UTF-8");
	    PrintWriter writer = response.getWriter();
	    JSONObject json = new JSONObject();
	    
	    String borrowId = request.getParameter("borrowId");
	    String bookId = request.getParameter("bookId");
	    boolean result = false;
	   
	    
	    result =borrowDao.deleteById(borrowId);
	    
	    if (result) {
	        bookDao.updateBook(bookId,"+");
	        json.put("code", 0);
	        
	    } else {
	        json.put("code", 1);
	        json.put("msg", "归还失败，请稍后重试。");
	    }
	    
	    writer.write(json.toString());
	    
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void logout(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		JSONObject json = null;

		HttpSession session = request.getSession();
		Object object = session.getAttribute("user");
		if (object != null) {
			session.removeAttribute("user");
			json = new JSONObject();
			json.put("code", 0);
			writer.write(json.toString());
			return;
		}
		String msg = "没登录！";
		json = new JSONObject();
		json.put("code", 1);
		json.put("msg", msg);

		writer.write(json.toString());
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void logout2(HttpServletRequest request, HttpServletResponse response)
	    throws IOException {
	    response.setHeader("Cache-Control", "no-cache");
	    response.setContentType("text/plain;charset=UTF-8");
	    PrintWriter writer = response.getWriter();
	    JSONObject json = null;
	    
	    HttpSession session = request.getSession();
	    Object object = session.getAttribute("reader");
	    if (object != null) {
	        session.removeAttribute("reader");
	        json = new JSONObject();
	        json.put("code", 0);
	        writer.write(json.toString());
	        return;
	    }
	    String msg = "没登录！";
	    json = new JSONObject();
	    json.put("code", 1);
	    json.put("msg", msg);
	    
	    writer.write(json.toString());
	}

}
