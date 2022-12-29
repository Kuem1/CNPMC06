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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<%@include file="css/navbar.css" %>
 <div class="container">
 <div class="search" >
   <form action="SearchServlet" id="search-box">
      <input type="text" id="search-text" name="name" required >
      <input name="idu" type="hidden" value="${sessionScope.user.idu}" >
      <button id="search-btn" ><i class="fa-solid fa-magnifying-glass"></i></button>
   </form>
   </div>
   <div class="ui" >
   <div class="body">
   
   
	  <c:forEach items="${cv}" var="x">
    <h1>Cv: ${x.namecv}</h1>
    <%if(request.getAttribute("choose") == null)
    	{%>
    <a href="getidcv?idcv=${x.idcv}" >show</a> 
   <a  href="#" onclick="myFunction(${x.idcv},${x.idu})" >delete</a>
   <%} else { %>
    <a href="ChooseCvServlet?idcv=${x.idcv}&idu=${sessionScope.user.idu}&idnn=${idnn}" >${choose}</a>
   <%} %>
   </c:forEach>
  
   
   </div>
   <a href="Insert.jsp?idu=${sessionScope.user.idu}" >Insert CV</a>
   </div>
 </div>
 
 <script>
function myFunction(idcv,idu) {
	var result = confirm("Bạn có muốn xóa ?");
    if (result === true) {
        window.location.href = 'DeleteCvServlet?idcv='+idcv+'&idu='+idu;
    }
}
</script>
 <%@include file="css/footer.css" %>
</body>
</html>