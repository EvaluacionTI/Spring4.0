<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/jsp0101v01cabecera.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Spring 4.3.8].....</title>
	</head>
	
	<body>
		<h3 style = "background-color: orange; text-align: center">PAAS : Arquitectura Host</h3>
		<br>
		<p>Mostrando la fecha que proviene del Controlador </p>
		<br>
		Fecha del Sistema : <co:out value="${vFechaActual}"></co:out>
		<br>
		<co:out value="Context : "></co:out>
		<%
			out.println(request.getContextPath());
		%>
		

	
		
	</body>
</html>