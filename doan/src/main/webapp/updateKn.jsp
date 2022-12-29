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
 <div class="container">
   <div class="ui" >

   <div class="body">
   <form action="UpdateKinhNghiemServlet" method="get">
   <div >
      <input type="hidden"  name="idkn"  value="${kn.idkn}"  >
     </div>
    <div class="txt" >
      <input type="text"  name="nameda" required value="${kn.nameda}" >
      <span></span>
       <label>Tên Dự Án</label>
     </div>
     <div class="txt" >
      <input type="text"  name="kythuat" required value="${kn.kythuat}" >
      <span></span>
       <label>Kỹ Thuật Làm Dự Án</label>
     </div>
     <div class="txt" >
      <input type="text"  name="mota" required value="${kn.mota}" >
      <span></span>
       <label>Mô Tả Dự Án</label>
     </div>
     
     <input type="submit" >
   
   </form>
   </div>
   
   </div>
 </div>
 
 
 <%@include file="css/footer.css" %>
</body>
</html>