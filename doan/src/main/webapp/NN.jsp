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
   <c:forEach items="${listnn}" var="x" >
    <h1>Ngành : ${x.namenn}</h1>
    <a href="GetCvByNNServlet?idnn=${x.idnn}&idu=${sessionScope.user.idu}" >Show</a>
    </c:forEach>
    
   </div>
   
   </div>
 </div>
 
 
 <%@include file="css/footer.css" %>
</body>
</html>