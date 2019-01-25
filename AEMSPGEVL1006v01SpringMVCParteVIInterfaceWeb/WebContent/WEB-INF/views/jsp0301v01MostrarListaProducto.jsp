<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/jsp0101v01cabecera.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" href="../css/css0101v01PageWeb.css" rel="stylesheet">
		<fm:bundle basename="pe.tata.bfp.propiedad.mesaje_es_EN">
			<title><fm:message key="msgTitulo"></fm:message></title>
		</fm:bundle>
	</head>
	
	<body>
		<h1><fm:bundle basename="pe.tata.bfp.propiedad.mesaje_es_EN">
				<fm:message key="msgCabeceraListado"></fm:message>
			</fm:bundle>		
		</h1>
		<br>
		<br>
		<p>Páginas con Url</p>
		<br>
		http://localhost:8085/SpringMVCParteV<br>
		http://localhost:8085/SpringMVCParteV/hello.ea<br>
		http://localhost:8085/SpringMVCParteV/listado.ea<br>
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