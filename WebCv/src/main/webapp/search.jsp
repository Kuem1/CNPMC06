<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/container.css" >
<style type="text/css" ></style>
<title>Insert title here</title>
<%@include file="css/head.css" %>
</head>
<body>

<%@include file="css/navbar.css" %>
 <div class="container" >
  <div class="vstack gap-3">
  <div class="bg-light border"><a href="getidu?idu=${sessionScope.user.idu}" >Cv của bạn</a> </div>
  <div class="bg-light border"><a href="LoadUserServlet?idu=${sessionScope.user.idu}" >Xem Cv Của User Khác</a></div>
  <div class="bg-light border"><a href="ShowNNServlet" >Ngành Nghề </a></div>
</div>
    
   
   
   
   
   </div>
  
 
 
 <%@include file="css/footer.css" %>
</body>
</html>