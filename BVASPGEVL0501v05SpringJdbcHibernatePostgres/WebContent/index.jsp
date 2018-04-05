<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/jsp0101v01cabecera.jsp" %>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" href="02Css/css0101v01PageWeb.css" rel="stylesheet">
		
		<title>.....[Spring 4.3.14].....</title>
	</head>
	<body>
		<h3>Banco Continental | Spring JDBC - Hibernate | Paas Arquitectura Engineering</h3>
		<%-- Redirected because we can't set the welcome page to a virtual URL. 
			ruta de verificación sin spring:	<co:redirect url="/views/jsp0201v01MostrarFecha.jsp"></co:redirect>
			<co:redirect url="/hello.ea"></co:redirect>
		--%>
		<br>
		<%
			out.println(request.getContextPath());
			String sContext = request.getContextPath();
		%>
		<br>
	</body>
</html>


