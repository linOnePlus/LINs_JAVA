<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*,java.io.*,javax.servlet.*,javax.servlet.http.*,java.lang.*" %>
<%@ page import="com.dao.*,com.model.*" %>
<%

String type = request.getParameter("type")==null?"author":(String) request.getParameter("type");
//其中ISO-8859-1是tomcat默认的编码类型  ,UTF-8为项目编码类型
String value = request.getParameter("value")==null?"":(String) new String(request.getParameter("value").getBytes("ISO-8859-1"), "UTF-8");



BookDao bookDao=new BookDao();
List<Book> list=bookDao.search(type, value);
if(request.getParameter("type")!=null){
    request.setAttribute("list",list);
    request.setAttribute("value",value);
}
 
%>
<%@include file="reader_head.jsp" %>


<div class="span12" id="content">
                   

                     <div class="row-fluid">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">图书搜索</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                   
                                   <div style="text-align: center;">
                                   
                                   
                                   <form class="form-search" method="post">
                                   
                                   <select name="type">
							  <option value="author">按作者查询</option>
							  <option value="name">按书名查询</option>
							  <option value="press">按出版社查询</option>
							</select>

  <input type="text" class="input-medium search-query" name="value" value="${value}"   placeholder="请输入搜索内容">
  <button type="submit" class="btn btn-success">搜索</button>
</form>
                                   
                                   </div>
                                    
                                    
                                    
                                    <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
                                        <thead>
                                            <tr>
                                                <th>图书名称</th>
                                                <th>图书作者</th>
                                                <th>图书类型</th>
                                                <th>出版社</th>
                                                <th>条形码</th>
                                                <th>库存（本）</th>
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                    <c:forEach var="c" items="${list}" varStatus="status">
											  
											   
											   <tr class="odd gradeX">
                                                <td> ${c.name }</td>
                                                <td> ${c.author }</td>
                                                <td> ${c.type }</td>
                                                <td> ${c.press }</td>
                                                <td> ${c.code }</td>
                                                <td> ${c.price }</td>
                                                <td>
                                                <c:if test="${not empty reader}">
											<a class="btn btn-info btn-mini"  onclick="borrow('${c.id }','${reader.id }','${c.price }')" >借阅</a>
												</c:if>

                                                <c:if test="${empty reader}">
											   <a onclick="login()"  class="hand"  > 请登录</a>
												</c:if>
                                                
                                                </td>
                                            </tr>
								   </c:forEach>	 
                                            
                                            
                                             
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!-- /block -->
                    </div>
                </div>





<%@include file="footer.jsp" %>
 <script>
        $(function() {
        	$('#example_filter').hide();
        });
        
        
        function borrow(bookId,readerId,left){
        	
        	if(left<1){
        		layer.alert('库存不足，暂不能借阅。');
        		return;
        	}
        	
        	
        	layer.confirm('确定要借阅吗？', {
				title:'提示',
			  btn: ['确定','取消'] //按钮
			}, function(){
				var url =context+"controller?oper=borrow";
				var param={
					bookId:bookId,
					readerId:readerId
				}
				$.post(url, param, function(data) {
				if (data) {
					data=JSON.parse(data);
					if(data.code==0){
						window.location.reload();
					}else{
						layer.msg(data.msg);
					}
			}  
			});
			   
			}, function(){
			  layer.closeAll();
			});
        	
        	
        	
        }
        
</script>


    </body>

</html>
