<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>[Aplicación Orden de Despacho]</title>
	</head>
	<body>
		<form id="frmComprobanteOrdenDespacho" action="GET">
			<table><tr><td>Número de Comprobante</td>
						<td><input type="text"></td>
				</tr>
				<tr><td>Fecha de Emisión</td>
					<td><input type="date"></td>
					<td>Fecha de Inicio del Traslado</td>
					<td><input type="datetime"></td>
				</tr>
				<tr><td>Punto Partida</td>
					<td><input type="text"></td>
					<td>Punto Llegada</td>
					<td><input type="text"></td>
				</tr>
				
				<tr><td>N° RUC</td>
					<td><input type="text"></td>
					<td>Destinatario:</td>
					<td><input type="text"></td>
				</tr>
				<tr><td>N° Placa</td>
					<td><input type="text"></td>
					<td>N° Licencia de Conductor</td>
					<td><input type="text"></td>
				</tr>
				<tr><td>Código de configuración vehicular</td>
					<td><input type="text"></td>
					<td>N° de Constancia de Inscripción</td>
					<td><input type="text"></td>
				</tr>
			</table>
		</form>
	</body>
</html>