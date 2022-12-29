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
<%@include file="css/head.css" %>
</head>
<body>
<%@include file="css/navbar.css" %>
 <div class="container">
   <div class="ui" >
    
   <div class="body">
   <form action="InsertNameCvServlet" method="get">
    <div class="txt" >
      <input type="text"  name="namecv" required >
      <span></span>
       <label>name</label>
     </div>
     <div  >
      <input type="hidden"  name="idu"  value="${sessionScope.user.idu}"  >
     </div>
     <input type="submit" >
   
   </form>
   </div>
   
   </div>
 </div>
 
 
 <%@include file="css/footer.css" %>
</body>
</html>