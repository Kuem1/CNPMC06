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
   
   <div class="vstack gap-3">
    <c:forEach items="${Listu}" var="x">
  <div class="bg-light border"><a href="LoadCvUserServlet?idu=${x.idu}" >Xem Cv của ${x.username} </a> </div>
  </c:forEach>
</div>
  
   
   
    
   </div>
   
   </div>
 </div>
 
 
 <%@include file="css/footer.css" %>
</body>
</html>