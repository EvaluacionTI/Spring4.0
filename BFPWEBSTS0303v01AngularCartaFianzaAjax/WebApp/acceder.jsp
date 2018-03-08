<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=11;IE=10;IE=9" >
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="msapplication-TileColor" content="#2b5797">
	<meta name="msapplication-TileImage" content="/mstile-144x144.png">
	<meta name="theme-color" content="#ffffff">
	<title>BANCO FINANCIERO - NEXO FINANCIERO</title>
	<link rel="stylesheet" type="text/css" href="js/ui-bootstrap/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/portal.css" />
	<link rel="apple-touch-icon" sizes="57x57" href="imagenes/icono/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="imagenes/icono/apple-touch-icon-60x60.png">
	<link rel="apple-touch-icon" sizes="72x72" href="imagenes/icono/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="imagenes/icono/apple-touch-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="imagenes/icono/apple-touch-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="imagenes/icono/apple-touch-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="imagenes/icono/apple-touch-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="imagenes/icono/apple-touch-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="imagenes/icono/apple-touch-icon-180x180.png">
	<link rel="icon" type="image/png" href="imagenes/icono/favicon-32x32.png" sizes="32x32">
	<link rel="icon" type="image/png" href="imagenes/icono/favicon-194x194.png" sizes="194x194">
	<link rel="icon" type="image/png" href="imagenes/icono/favicon-96x96.png" sizes="96x96">
	<link rel="icon" type="image/png" href="imagenes/icono/android-chrome-192x192.png" sizes="192x192">
	<link rel="icon" type="image/png" href="imagenes/icono/favicon-16x16.png" sizes="16x16">
	<link rel="manifest" href="imagenes/icono/manifest.json">
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/angular.min.js"></script>
	<script type="text/javascript" src="js/ui-bootstrap/ui-bootstrap-tpls-0.13.0.js"></script>
        <script type="text/javascript" src="js/browser.js"></script>
	<script type="text/javascript" src="js/coreComun-2.js"></script>
	<script type="text/javascript" src="js/acceder.js"></script>
</head>
<!--  <body class="POR_FONDO" ng-app="acceder" ng-controller="Logeo" oncontextmenu="return false" onkeydown="return false">-->
<body class="POR_FONDO" ng-app="acceder" ng-controller="Logeo" >
<cargas-de></cargas-de>
<script type="text/ng-template" id="confirmaracceso.html">
	<div class="modal-header">
		<h3 class="modal-title">Confirma Logeo</h3>
	</div>
	<div class="modal-body">
		<p><i class="glyphicon glyphicon-info-sign"></i> Ya se encuentra logueado en otro dispositivo o navegador.<br><br>Desea acceder desde aquí?</p>
	</div>
	<div class="modal-footer">
		<button class="btn btn-primary" ng-click="Si()">SI</button>
		<button class="btn btn-warning" ng-click="Cancelar()">Cancelar</button>
	</div>
</script>
<div id="div_loge_avisos"></div>
<form id="frm_log_acceso" name="frm_log_acceso" method="post" action="j_security_check">
<div class="fondoTop LOGEO_TOP"><img alt="" src="imagenes/logo_financiero_1.png" /></div>
<div id="LogeoContenido" style="position:fixed">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td align="center">
			<table width="40%" border="0" cellspacing="0" cellpadding="0">
			  <tr>
				<td align="center" class="LOGEO_CENTRO_1">
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
							<td colspan="2" align="right"><a class="btn btn-primary" ng-click="acceder()" id="acceder"><i class="glyphicon glyphicon-off"></i> INICIAR SESIÓN</a></td>
						  </tr>
						</tbody>
					  </table>
					</div>
				  </td>
			  </tr>
			  <tr ng-show="mensaje.length>0">
				<td height="44" class="LOGEO_CENTRO_3"><alert type="danger">{{mensaje}}</alert></td>
			  </tr>
			</table>
		</td>
	  </tr>
	</table>
</div>
</form>
<div ng-include="'piepagina.html'"></div>
</body>
</html>