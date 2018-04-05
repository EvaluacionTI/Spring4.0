<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" href="hojaEstilo/css0101v01PageWebRest.css" rel="stylesheet">
		
		<title>.....[Spring 4.3.13].....</title>
	</head>
	<body>
		<h1>Banco Continental - PAAS - Servicios RestFul</h1>
		<p>Redireccionando por media del URL = /hello.ea
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
		<co:redirect url="mostrarMensaje.ea"></co:redirect>


	</body>
</html>


