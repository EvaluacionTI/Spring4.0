<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="../js/js0101v01funcionDocumento.js"></script>
		
		<title>[Aplicación CTS]</title>
	</head>
	<body>
		<h1 align="center">Depósito CTS en ventanilla</h1>
		<table>
			<tr><td>Ruc</td>
				<td><input id="idNroRuc" type="text" name="txtNroRuc" maxlength="20" placeholder="N° de RUC"></td>
				<td>Correo</td>
				<td><input id="idEmail" type="email" name="vCorreo" maxlength="100" placeholder="ejemplo@gmail.com"></td>
			</tr>
			<tr><td>Modalidad</td>
				<td><select><option>En Línea</option>
					</select>
				</td>
				<td>Período/Año</td>
				<td><select><option>Mayo</option>
							<option>Noviembre</option>
					</select>
					<input type="text" name="vAaaa" maxlength="4" placeholder="YYYY">
				</td>
			</tr>
			<tr><td>Moneda</td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td>Monto</td>
				<td><input type="text" name="vMontoDeposito" maxlength="18"></td>
			</tr>
			<tr><td>Forma Pago</td>
				<td><select><option>Efectivo</option>
							<option>Cargo en cuenta</option>
							<option>Cheque</option>
					</select>
				</td>
				<td>N° Trabajadores</td>
				<td><input type="text" name="vNroTrabajadores" maxlength="2"></td>
			</tr>
			<tr><td>T.C. CTS</td>
				<td><input type="text" name="vTipoCambioCTS" value="3.4568" maxlength="18" readonly="readonly"></td>
			</tr>
			<tr><td>N°</td>
				<td>N° Cuenta</td>
				<td>Moneda Abono</td>
				<td>Importe Abono</td>
				<td>Moneda Intangible</td>
				<td>Importe Intangible</td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=1 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=2 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=3 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=4 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=5 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=6 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=7 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=8 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=9 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="text" name="vNroItem" value=10 min="2"></td>
				<td><input type="text" name="vNroCuenta" maxlength="20"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoAbono" maxlength="18"></td>
				<td><select><option>S/</option>
							<option>US$</option>
					</select>
				</td>
				<td><input type="text" name="vMontoIntangible" maxlength="18"></td>
			</tr>
			<tr><td><input type="button" name="btnCargarIntangible" value="Cargar Intangible"></td>
				<td></td>
				<td><input type="button" name="btnAceptar" value="Aceptar"></td>
				<td><input type="button" name="btnCancelar" value="Cancelar"></td>
			</tr>

		</table>	
	</body>
</html>