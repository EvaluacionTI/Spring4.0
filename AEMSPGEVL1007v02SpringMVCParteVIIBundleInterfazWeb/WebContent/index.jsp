<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/WEB-INF/views/jsp0101v01cabecera.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Spring 4.3.9].....</title>
	</head>
	<body>
		<h3 style = "background-color: orange; text-align: center">Inventario Bienes Leasing</h3>

		<p>Redireccionando por media del URL = /hello.ea
		<%-- Redirected because we can't set the welcome page to a virtual URL. 
			ruta de verificación sin spring:	<co:redirect url="/views/jsp0201v01MostrarFecha.jsp"></co:redirect>
			<co:redirect url="/hello.ea"></co:redirect>
		--%>
		<%
			out.println(request.getContextPath());
	
		%>
		<co:redirect url="/hello.ea"></co:redirect>

	</body>
</html>


