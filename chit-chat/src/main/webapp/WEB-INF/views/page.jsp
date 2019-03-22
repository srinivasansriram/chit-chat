<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>CHIT-CHAT-${title}</title>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
 <%@include file="./shared/navbar.jsp" %>
  <!-- Page Content -->
 <!-- loading the home page -->
 
 <%@include file="home.jsp" %>

  <!-- Footer -->
  <%@include file="./shared/footer.jsp" %>

 <!-- jquery -->
  <script src="${js}jquery.js"></script>
  
   <!-- Bootstrap core JavaScript -->
  <script src="${js}/bootstrap.min.js"></script>

</body>

</html>

