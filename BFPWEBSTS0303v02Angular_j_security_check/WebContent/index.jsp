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
		<p>Tiene tiene que pulsar clic para ingresar</p>

		Sesión inicial : <%=request.getSession()%>
		<br>
		Invalidando sesión : <%request.getSession().invalidate();%>
 		<br>

		<a href="jsp0101v01AccesoLogin.jsp">Clic aquí</a>
	</body>
</html>	
