<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="img" value="/resources/img"></spring:url>
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
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.6.2/animate.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="${css}/style.css">

</head>

<body>
	<!-- ======= header ======= -->
	<%@include file="./shared/header.jsp"%>

	
	<!-- ======= navbar ======= -->
	<%@include file="./shared/navbar.jsp"%>
	<!-- .nav-menu -->


	
	<c:if test="${userClickHome==true}">
		<%@include file="home.jsp"%>
	</c:if>


	
	<c:if test="${userClickAbout==true}">
		<%@include file="about.jsp"%>
	</c:if>

	
	<!-- ======= Footer ======= -->
	<%@include file="./shared/footer.jsp"%>
	<!-- End Footer -->

</body>

</html>