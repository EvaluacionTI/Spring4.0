<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="css/bootstrap3.3.7.css"/>
		<title>Banco Financiero - Nexo Financiero</title>
	</head>
	<body>
		<%
			String oSesion = session.getId();
			request.setAttribute(oSesion, "SESION_CHECK");
		 %>
		<p>Tiene tiene que pulsar clic para ingresar</p><br>
		<p>ID Secion : <%=oSesion%></p><br>
		<p>Sesión inicial : <%=request.getSession()%></p><br>
		<p>Cookies : <%request.getCookies();%></p>
		<p>Context Path : <%request.getContextPath();%></p>
		<p>Path Info : <%request.getPathInfo();%></p>		
		<p>URI : <%request.getReader();%></p>
 		<br>
	
		<a href="jsp0201v01LoginFORM_j_security_checkJSP.jsp">Clic aquí</a>
	</body>
</html>	
