<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<h1>Tour and Tourism</h1>
				<%@include file="./shared/sidebar.jsp"%>
			</div>
			<div class="col-md-9">
				<c:if test="${userClickProduct==true}">
					<ol class="breadcrumb">
						<li><a href="#">India</a></li>
						<li><a href="#">japan</a></li>
						<li class="active"><a href="#">Russia</a></li>
					</ol>
				</c:if>
				<c:if test="${userCategoryProduct ==true}">
  		  <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
        <li class="breadcrumb-item">Category</li>
    	<li class="breadcrumb-item active"> <a href="#">${category.name}</a>
         </ol>
         </c:if>
			</div>
		</div>

	</div>
</body>
</html>