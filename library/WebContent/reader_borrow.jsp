<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*,java.io.*,javax.servlet.*,javax.servlet.http.*,java.lang.*" %>
<%@ page import="com.dao.*,com.model.*,com.model.Reader" %>
<%

Object object = request.getSession().getAttribute("reader");
if (null == object) {
	response.sendRedirect("reader_login.jsp");
}else{
    Reader reader=(Reader)object;
    BorrowDao borrowDao=new BorrowDao();
    String readerId=reader.getId();
	List<Borrow> list=borrowDao.getList(readerId); 
	request.setAttribute("list",list);
}

 
%>
<%@include file="reader_head.jsp" %>


<div class="span12" id="content">
                   

                     <div class="row-fluid">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">借阅图书列表</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                    
                                    
                                    <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
                                        <thead>
                                            <tr>
                                                <th>图书名称</th>
                                                <th>图书类型</th>
                                                <th>出版社</th>
                                                <th>条形码</th>
                                                <th>时间</th>
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                    <c:forEach var="c" items="${list}" varStatus="status">
											  
											   
											   <tr class="odd gradeX">
                                                <td> ${c.name }</td>
                                                <td> ${c.type }</td>
                                                <td> ${c.press }</td>
                                                <td> ${c.code }</td>
                                                <td> ${c.time }</td>
                                                <td>
                                                
											<button class="btn btn-danger btn-mini" onclick="returnBook('${c.id }','${c.bookId }')">归还</button>
                                                
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
        
        	
        	function returnBook(borrowId,bookId){
            	
            	 
            	
            	
            	layer.confirm('确定要归还吗？', {
    				title:'提示',
    			  btn: ['确定','取消'] //按钮
    			}, function(){
    				var url =context+"controller?oper=returnBook";
    				var param={
    					bookId:bookId,
    					borrowId:borrowId
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
        	
        	$(function() {
        
        	
        	});
</script>


    </body>

</html>
