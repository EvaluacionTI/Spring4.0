<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html data-ng-app="myAppCartaFianza">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Banco Financiero - Nexo Financiero</title>
		<link type="text/css" rel="stylesheet" href="css/bootstrap3.3.7.css"/>
		
		<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="js/bootstrap3.3.7.js"></script>
		<script type="text/javascript" src="js/angular1.6.4.js"></script>

		<script type="text/javascript" src="js/jSeguridadCheck.js"></script>
	</head>
	
	<body data-ng-controller="myCtrlSeguridad">

		<form id="frm_log_acceso" name="frm_log_acceso" method="post" action="j_security_check">
			<div class="panel-footer"><img alt="" src="imagenes/logo_financiero_1.png"/></div>
			<table class="table">
				<tbody>
					<tr><td><strong>USUARIO </strong></td>
						<td><input type="text" class="form-control" id="usuario"></td>												
					</tr>
					<tr><td><strong>CONTRASE&Ntilde;A </strong></td>
						<td><input type="password" class="form-control" id="clave"></td>
					</tr>
					<tr><td colspan="2" align="right">
							<a class="btn btn-primary" data-ng-click="acceder()" id="acceder">
								<i class="glyphicon glyphicon-off"></i> INICIAR SESIÓN
							</a>
						</td>
					</tr>
				</tbody>
			</table>	
		</form>
	</body>
</html>