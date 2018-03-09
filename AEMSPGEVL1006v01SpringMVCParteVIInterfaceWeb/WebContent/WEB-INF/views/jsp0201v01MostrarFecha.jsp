<!-- 
	Proyecto		:	Evaluación Spring
	Prefijo			:	SPGmmNNvnn
	Fecha			:	03/05/2017
	Descripción		:	Mostrar la fecha y hora actual
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/jsp0101v01cabecera.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" href="../css/css0101v01PageWeb.css" rel="stylesheet"/>
		<fm:bundle basename="tata.bfp.propiedad.mesaje_es_EN">
			<title><fm:message key="msgTitulo"></fm:message></title>
		</fm:bundle>
		
	</head>

	<body>
		<h1><fm:bundle basename="tata.bfp.propiedad.mesaje_es_EN">
				<fm:message key="msgCabeceraFecha"></fm:message>
			</fm:bundle>
		</h1>
		
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