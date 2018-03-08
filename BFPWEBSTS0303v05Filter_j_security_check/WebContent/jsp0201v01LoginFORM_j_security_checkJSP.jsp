<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="css/bootstrap3.3.7.css"/>
		<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
		
		<script type="text/javascript" src="js/seguridadLogin.js"></script>
		
		<title>Banco Financiero - Nexo Financiero</title>
	</head>
	
	<body>
		<div class="panel-footer"><img alt="" src="imagenes/logo_financiero_1.png"/></div>
		<div>
			<form method=post action="j_security_check" class="navbar-form pull-center" >
				<table>
					<tr><td>Usuario :</td>
						<td><input class="span2" type="text" name= "j_username" id="idUsuario" size=25 placeholder="Usuario"></td>
					</tr>
			    	<tr><td>Clave :</td>
			    		<td><input class="span2" type="password" name= "j_password" id="idClave" size=25 placeholder="Clave"></td>
			    	</tr>
			    	<tr><td>Iniciar Acceso</td>
			    		<td><input class="btn" type="reset" value="Limpia" id="idLimpiaLogin">
			    			<input class="btn" type="submit" value="Iniciar Sesión" id = "idIniciaLogin" onclick="iniciarLogin()">
			    		</td>
			    	<tr>
				</table>
			</form>	
		</div>
	</body>
</html>