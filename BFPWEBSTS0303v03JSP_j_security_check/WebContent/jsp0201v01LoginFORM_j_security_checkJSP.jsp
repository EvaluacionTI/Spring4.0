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
		<div class="panel-footer"><img alt="" src="imagenes/logo_financiero_1.png"/></div>

		<div>
			<!-- No considera la validación correcta cuando el usuario y clave son correctos. -->
			<%
				if (request.getParameter("j_username")==null){
			 %>
			<form method=post action="j_security_check" >
				<table>
					<tr><td>Usuario :</td>
						<td><input type="text"  name= "j_username" size=25></td>
					</tr>
			    	<tr><td>Clave :</td>
			    		<td><input type="password"  name= "j_password" size=25></td>
			    	</tr>
			    	<tr><td>Iniciar Acceso</td>
			    		<td><input class="btn" type="reset" value="Limpia">
			    			<input class="btn" type="submit" name="procesar" value="Iniciar Sesión">
			    		</td>
			    	<tr>
				</table>
			</form>	
			<%}else{
				String sUsuario = (String) request.getAttribute("j_username");			
				String sClave = (String) request.getAttribute("j_password");
				String url = "j_security_check?j_username=" + sUsuario + "&j_password=" + sClave;
				String redirectUrl = response.encodeRedirectURL(url);
				response.sendRedirect(redirectUrl);
			%>
				<br>Usuario : <p><%=sUsuario%></p>
			<%} %>
		</div>
	</body>
	
</html>