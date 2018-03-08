<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Banco Financiero - Nexo Financiero</title>
		
		<link type="text/css" rel="stylesheet" href="../css/bootstrap3.3.7.css"/>
	</head>
	<body>
		<div class="panel-footer"><img alt="" src="../imagenes/logo_financiero_1.png"/></div>
		<div>
			Bienvenido a la Aplicación Carta Fianza - BPM
		</div>
		<h5> Usuario : <%=request.getRemoteUser()%></h5>
		<h5> Mecanismo Autenticación : <%=request.getAuthType()%></h5>
		<h5> Usuario en rol : <%=request.isUserInRole("tata") %></h5>
	</body>
</html>