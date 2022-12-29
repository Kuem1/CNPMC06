<%@page import="org.eclipse.jdt.internal.compiler.apt.model.TypeParameterElementImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/container.css" >
<%@include file="css/head.css" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="css/navbar.css" %>
<% String idcv = request.getParameter("idcv"); %>
 <div class="container">
   <div class="ui" >
   <div class="body">
   <form action="InsetKnServlet" method="get">
    <div class="txt" >
      <input type="text"  name="nameda" required  >
      <span></span>
       <label>Tên Dự Án</label>
     </div>
     <div class="txt" >
      <input type="text"  name="kythuat" required  >
      <span></span>
       <label>Kỹ Thuật Làm Dự Án</label>
     </div>
     <div class="txt" >
      <input type="text"  name="namkn" required  >
      <span></span>
       <label>Năm Kinh Nghiệm</label>
     </div>
     <div class="txt" >
      <input type="text"  name="mota" required  >
      <span></span>
       <label>Mô Tả Dự Án</label>
     </div>
     <div  >
      <input type="hidden"  name="idcv"  value="<%= idcv %>" >
      
     </div>
     
     <input type="submit" >
   
   </form>
   </div>
   
   </div>
 </div>
 
 
 <%@include file="css/footer.css" %>
</body>
</html>