<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="img" value="/resources/img"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<!DOCTYPE html>
<!--Code by Divinector (www.divinectorweb.com)-->
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>TRAVEL AND TOURISM --${title}</title>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;900&display=swap"
	rel="stylesheet">
	<link rel="stylesheet" href="${css}/jquery.dataTables.css">
	<link rel="stylesheet" href="${css}/bootstrap.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.6.2/animate.min.css"
	rel="stylesheet">
	
	<!-- fa fa icon link -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<!-- fas fa icon link -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.12.1/css/all.css" crossorigin="anonymous">


<link rel="stylesheet" href="${css}/style.css">
<link rel="stylesheet" href="${css}/about.css">
<link rel="stylesheet" href="${css}/service.css">
<link rel="stylesheet" href="${css}/login.css">
<link rel="stylesheet" href="${css}/myapp.css">
<link rel="stylesheet" href="${css}/switch.css">





<script>
    window.menu="${title}";
	window.contextRoot = "${contextRoot}";
</script>




</head>

<body>


	<!-- ======= header ======= -->
	<%@include file="./shared/header.jsp"%>


	<!-- ======= navbar ======= -->
	<%@include file="./shared/navbar.jsp"%>
	<!-- .nav-menu -->
	
	
    <c:if test="${userClickLogin==true}">
		<%@include file="login.jsp"%>
	</c:if>




	<c:if test="${userClickHome==true}">
		<%@include file="home.jsp"%>
	</c:if>



	<c:if test="${userClickAbout==true}">
		<%@include file="about.jsp"%>
	</c:if>
	
	<c:if test="${userClickServices==true}">
		<%@include file="services.jsp"%>
	</c:if>
	
	<c:if test="${userClickContact==true}">
		<%@include file="contact.jsp"%>
	</c:if>

	<c:if test="${userClickProduct==true || userClickCategoryProduct==true}">
		<%@include file="product.jsp"%>
	</c:if>


    <c:if test="${userClickSingleProduct==true}">
		<%@include file="singleProduct.jsp"%>
	</c:if>
	
	<c:if test="${userClickManageProducts==true}">
		<%@include file="manageproduct.jsp"%>
	</c:if>


	<!-- ======= Footer ======= -->
	<%@include file="./shared/footer.jsp"%>
	<!-- End Footer -->
 


    <!-- JavaScript -->
    
    <script src="${js}/jquery.min.js"></script>   
	<script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/jquery.dataTables.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/5.5.2/bootbox.min.js"></script>
    <script src="${js}/login.js"></script>	
    <script src="${js}/myapp.js"></script>	
    
   
	
	



</body>


</html>