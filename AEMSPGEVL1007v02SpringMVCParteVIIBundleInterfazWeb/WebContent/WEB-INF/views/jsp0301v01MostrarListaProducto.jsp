<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/jsp0101v01cabecera.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" href="../css/css0101v01PageWeb.css" rel="stylesheet">
		<title><fm:message key="msgTitulo"></fm:message></title>
	</head>
	
	<body>
		<h1><fm:message key="paas.distribuido"></fm:message>
		</h1>
		<br>
		<br>
		<p>Páginas con Url</p>
		<br>
		http://localhost:8085/SpringMVCParteVII<br>
		http://localhost:8085/SpringMVCParteVII/hello.ea<br>
		http://localhost:8085/SpringMVCParteVII/listado.ea<br>
		<br>
		<br>		
		<h5>Listado de Información</h5>
		<p>
		Fecha del Sistema: <co:out value="${vModeloInventario.vFechaActual}"></co:out>
		<br>
		<co:forEach items="${vModeloInventario.vListaProducto}" var="vProducto">		
		<table>
			<thead>
				<tr><td>Identificador<td>
					<td>Descripción</td>
					<td>Precio</td>
				<tr>
			</thead>
			<tbody>
				<tr><td><co:out value="${vProducto.identificador}"></co:out></td>
					<td><co:out value="${vProducto.descripcion}"></co:out></td>
					<td><co:out value="${vProducto.precio}"></co:out></td>
				</tr>			
			</tbody>
		</table>
		</co:forEach>

		<%
			out.println(request.getContextPath());
		%>

	</body>
</html>