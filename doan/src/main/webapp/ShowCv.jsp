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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style> @import url('https://fonts.googleapis.com/css2?family=Playfair+Display:ital@1&display=swap'); </style>
<%@include file="css/head.css" %>
<link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Playfair+Display:ital@1&display=swap" rel="stylesheet">
</head>
<body>
<%@include file="css/navbar.css" %>
<div class="container" style="padding-left: 0px;
    padding-right: 0px;"
    
>
  <div class="uiright" >
  <div class="right" >
  <div class="avatar" >
  </div>
  <div class = "aboutme" >
  <span></span>
  <h1>VỀ TÔI</h1>
  <p>Ngày tháng năm sinh: ${cv.dob}</p>
  <p>Tuổi: ${cv.old} </p>
  <p>Giới tính : ${cv.gender}</p>
  </div>
  <div class="contact" >
  <h1>LIÊN HỆ</h1>
  <span></span>
  <p>ĐỊA CHỈ: ${cv.adress }</p>
  <p>SỐ ĐIỆN THOẠI: ${cv.phone} </p>
  <p>EMAIL: ${cv.email} </p>
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
  <h1>${cv.name}</h1>
  <div class="element" >
  <p>${cv.job}</p>
  <span></span>
  </div>
  </div>
  
  <div class="career" >
   <h1>MỤC TIÊU</h1>
   <span></span>
   <p>${cv.career}</p>
  
  </div>
  <div class="leftbody">
  <div class="education">
  <h1>GIÁO DỤC</h1>
  <p>.....</p>
  </div>
  <div class="technical">
  <h1>KỸ NĂNG</h1>
  <p>${cv.technical}</p>
  </div>
  
  </div>
  
  <div class="kinhnghiem" >
  
  <h1>KINH NGHIỆM</h1>
  <a href="InsertKn.jsp?idcv=${cv.idcv}">Insert Kinh Nghiệm</a>
  <c:forEach items="${listkn}" var="x" >
  <h1>Tên Dự Án:${x.nameda}</h1>
  <p>Kỹ Thuật:${x.kythuat}</p>
  <p>Năm Kinh Nghiệm : ${x.namkn}</p>
  <p>Mô Tả:${x.mota}</p>
  </c:forEach>
  </div>
  </div>



</div>
<div class="a">
  <a href="update?idcv=${cv.idcv}">Update</a>
  <a  href="#" onclick="myFunction(${cv.idcv},${sessionScope.user.idu})" >delete</a>
  </div>
   <script>
function myFunction(idcv,idu) {
	var result = confirm("Bạn có muốn xóa ?");
    if (result === true) {
        window.location.href = 'DeleteCvServlet?idcv='+idcv+'&idu='+idu;
    }
}
</script>
</body>
</html>