<%@page import="org.eclipse.jdt.internal.compiler.apt.model.TypeParameterElementImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/test.css" >
<%@include file="css/head.css" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="css/navbar.css" %>
<form action="UpdateCv" method="get">
 <div class="container" style="padding-left: 0px;
    padding-right: 0px;"
    
>

  <div class="uiright" >
  <div class="right" >
  <div class="avatar" >
  </div>
  <div >
  <input type="hidden"  name="idcv"  value="${cv.idcv}"  >
      <input type="hidden"  name="idkn"  value="${kn.idkn}"  >
      <input type="hidden" name="idu" value="${sessionScope.user.idu }" >
     </div>
  <div class = "aboutme" >
  <span></span>
  <h1>VỀ TÔI</h1>
  <p>Ngày tháng năm sinh:</p> <input type="text" name="dob" value="${cv.dob}" >
  <p>Tuổi: </p><input type="text" name="old" value="${cv.old}">
  <p>Giới tính :</p><input type="text" name="gender" value="${cv.gender}">
  </div>
  <div class="contact" >
  <h1>LIÊN HỆ</h1>
  <span></span>
  <p>ĐỊA CHỈ:</p><input type="text" name="adrees" value="${cv.adress}">
  <p>SỐ ĐIỆN THOẠI: </p><input type="text" name="phone" value="${cv.phone}">
  <p>EMAIL:  </p><input type="text" name="email" value="${cv.email}">
  </div>
  <div class="interest" >
  
  <h1>SỞ THÍCH</h1>
  <span></span>
  <p>Online Games</p>
  <p>Problem Solving</p>
  <p>Physical Activities</p>
  </div>
  </div>
  </div>
  <div class="left" >
  
  <div class="name" >
  <h1>Họ Tên:</h1><input type="text" name="name" value="${cv.name}">
  <div class="element" >
  <p>job:</p><input type="text" name="job" value="${cv.job}">
  <span></span>
  </div>
  </div>
  
  <div class="career" >
   <h1>MỤC TIÊU</h1>
   <span></span>
   <p></p><input type="text" name="career" value="${cv.career}">
  
  </div>
  <div class="leftbody">
  <div class="education">
  <h1>GIÁO DỤC</h1>
  <p>.....</p>
  </div>
  <div class="technical">
  <h1>KỸ NĂNG</h1>
  <p></p><input type="text" name="technical" value="${cv.technical}">
  </div>
  
  </div>
  
  <div class="kinhnghiem" >
  <div class="h1">
  
  <h1>KINH NGHIỆM</h1> <a href="InsertKn.jsp?idcv=${cv.idcv}">Insert Kinh Nghiệm</a>
  </div>
  <c:forEach items="${listkn}" var="x" >
  <p>Tên Dự Án : </p> <input type="text" name="nameda" value="${x.nameda}">
  <p>Kỹ Thuật : </p> <input type="text" name="kythuat" value="${x.kythuat}">
  <p>Năm Kinh Nghiệm : </p> <input type="text" name="namkn" value="${x.namkn}">
  <p>Mô Tả : </p> <input type="text" name="mota" value="${x.mota}">
  </c:forEach>
  </div>
  </div>



</div>
<input type="submit" >
 </form>
 
 <%@include file="css/footer.css" %>
</body>
</html>