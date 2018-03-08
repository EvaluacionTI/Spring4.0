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
		<%
			String sUsuario = "";
			String sClave = "";
			Boolean sRol = true;
			String sRuta = "";
			
			if(request.getAttribute("j_username")!= null){
		 %>
		<div>
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
			    			<input class="btn" type="submit" value="Iniciar Sesión">
			    		</td>
			    	<tr>
				</table>
			</form>	
		</div>
			<br>
			<%}else{
				sUsuario = (String) request.getAttribute("j_username");
				sClave = (String) request.getAttribute("j_password");
				sRol = (Boolean) request.isUserInRole("tata");
				sRuta ="portal/jsp0203v01BienvenidaFORM_j_security_checkJSP.jsp";
				}
			%> 
		<br>
		<%=sUsuario%>
		<%=sClave%>
		<%=sRol%>
		<a href='<%=sRuta%>'>Bienvenida</a> 

			
	</body>
	
</html>