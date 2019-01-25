<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Banco Financiero - Módulo CTS</title>
	</head>
	<body>
		<%
			String oSesion = session.getId();
			String sContext = request.getContextPath();
			String sPagina = "/01Transaccion/jsp0101v01DepositoVentanilla.jsp";
			String sURL = sContext + sPagina;
		 %>
		<p>Datos generales, pulsar clic para ingresar</p><br>
		<p>ID Sesión : <%=oSesion%></p><br>
		<p>Context : <%=sContext%></p>
		<p>Sesión inicial : <%=request.getSession()%></p>
		<p>URL : <%=sURL%></p>
		<br>
		
 		<br>
	
		<a href=<%=sURL%>>Clic aquí</a>
	</body>
</html>	
