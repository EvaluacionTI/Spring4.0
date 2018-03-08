<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=11;IE=10;IE=9"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

		<title>Banco Financiero - Nexo Financiero</title>
		
		<link type="text/css" rel="stylesheet" href="js/ui-bootstrap/bootstrap.min.css" />
		
		<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
		<script type="text/javascript" src="js/angular.min.js"></script>
		<script type="text/javascript" src="js/ui-bootstrap/ui-bootstrap-tpls-0.13.0.js"></script>
	
		<link rel="manifest" href="imagenes/icono/manifest.json">
		<link type="text/css" rel="stylesheet" href="css/portal.css" />
		
        <script type="text/javascript" src="js/browser.js"></script>
		<script type="text/javascript" src="js/coreComun-2.js"></script>
		<script type="text/javascript" src="js/acceder.js"></script>

	</head>
	<body class="POR_FONDO" data-ng-app="acceder" data-ng-controller="Logeo">
		<div id="div_loge_avisos"></div>
		<form id="frm_log_acceso" name="frm_log_acceso" method="post" action="j_security_check">
			<div class="fondoTop LOGEO_TOP"><img alt="" src="imagenes/logo_financiero_1.png" /></div>
			<div id="LogeoContenido" style="position:fixed">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr><td align="center" class="LOGEO_CENTRO_1">
						<div class="panel panel-default" style="box-shadow: 1px 1px 10px rgba(27,27,27,0.2);">
							<div class="panel-heading"><img src="imagenes/logo_portal_2.png" /></div>
							<table class="table">
								<tbody>
								  <tr>
									<td><strong>USUARIO </strong></td>
									<td><input type="text" class="form-control" id="usuario"></td>
								  </tr>
								  <tr>
									<td><strong>CONTRASE&Ntilde;A </strong></td>
									<td><input type="password" class="form-control" id="clave"></td>
								  </tr>
								  <tr>
									<td colspan="2" align="right"><a class="btn btn-primary" data-ng-click="acceder()" id="acceder"><i class="glyphicon glyphicon-off"></i> INICIAR SESIÓN</a></td>
								  </tr>
								</tbody>
							</table>
						</div>
					</td>
					</tr>
					<tr data-ng-show="mensaje.length>0">
						<td height="44" class="LOGEO_CENTRO_3"><alert type="danger">{{mensaje}}</alert></td>
			  		</tr>
				</table>
			</div>
		</form>
		
		<div data-ng-include="'piepagina.html'"></div>
		
	</body>
</html>