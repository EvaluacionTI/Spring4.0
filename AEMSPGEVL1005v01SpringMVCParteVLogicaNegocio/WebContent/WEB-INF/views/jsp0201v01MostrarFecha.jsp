<!-- 
	Proyecto		:	Evaluación Spring
	Prefijo			:	SPGmmNNvnn
	Fecha			:	03/05/2017
	Descripción		:	Mostrar la fecha y hora actual
 -->
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
		<h1 style = "background-color: orange; text-align: center">PAAS : Distribuido - Host</h1>
		<h6>Mostrar fecha</h6>
		<br>
		<p>Revisando en Controlador </p>
		<p>
		Fecha del Sistema : <co:out value="${vFechaActual}"></co:out>
		
		<%
			out.println(request.getContextPath());
	
		%>
		<br>
		<p>Páginas con Url</p>
		<br>
		http://localhost:8085/SpringMVCParteV<br>
		http://localhost:8085/SpringMVCParteV/hello.ea<br>
		http://localhost:8085/SpringMVCParteV/listado.ea<br>
	</body>
</html>