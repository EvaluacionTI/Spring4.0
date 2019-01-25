<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=11;IE=10;IE=9"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

		<title>Banco Financiero - Nexo Financiero</title>
		<link type="text/css" rel="stylesheet" href="css/bootstrap3.3.7.css"/>
		
	</head>
	<body>
		<%
			String sUrl = request.getContextPath().toString() + "/index.jsp";
		 %>

		<div class="panel">
			<div class="panel-footer"><img alt="" src="imagenes/logo_financiero_1.png"/></div>
			<p>Inválido el usuao o su clave</p>
			<br>
			<br>
			<p>
				Por favor ingrese su usuario o contraseña autorizados para la aplicación.
				<br>
				Los permisos tiene que solicitarlos previsamente o contactarse con el administrador	
			</p>
			<p>
				Pulse clic <a href=<%=sUrl%>>aquí</a>
			</p>
		</div>
	</body>
</html>