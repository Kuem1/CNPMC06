<%@page import="org.eclipse.jdt.internal.compiler.apt.model.TypeParameterElementImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/container.css" >
<%@include file="css/head.css" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<%@include file="css/navbar.css" %>
 <div class="container">
   <div class="ui" >
   <div class="body">
   <div class="search" >
   <form action="SearchServlet" id="search-box">
      <input type="text" id="search-text" name="name" required >
      <input name="idu" type="hidden" value="${sessionScope.user.idu}" >
      <button id="search-btn" ><i class="fa-solid fa-magnifying-glass"></i></button>
   </form>
   </div>
   
	  <c:forEach items="${listcv}" var="x">
    <h1>Cv: ${x.name}</h1>
    
    <a href="getidcv?idcv=${x.idcv}" >show</a> 
   <a  href="DeleteCvInNnServlet?idcv=${x.idcv}&idu=${x.idu}&idnn=${idnn}&namecv=${x.namecv}&name=${x.name}&email=${x.email}&phone=${x.phone}&hobby=${x.hobby}&dob=${x.dob}&old=${x.old}&adress=${x.adress}&job=${x.job}&career=${x.career}&technical=${x.technical}&gender=${x.gender}" >delete</a>
   
   </c:forEach>
  
   
   </div>
   <h1>${err}</h1>
   <a href="getidu?id=${sessionScope.user.idu}&idnn=${idnn}" >Insert CV</a>
   </div>
 </div>
 
 
 <%@include file="css/footer.css" %>
</body>
</html>