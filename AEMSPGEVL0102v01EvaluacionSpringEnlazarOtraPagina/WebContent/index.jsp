<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Evaluacion Spring 4.3.8].....</title>
	</head>

	<body>
		<h4>Redireccionar la página</h4>
		<br>
		Archivo: descargaSpring.jsp
		<br>
		<%
			out.println(request.getContextPath());
			// 1.0 Ejecución correcta bajo las formas
			// response.sendRedirect("descargaSpring.jsp");
			// response.sendRedirect(request.getContextPath()+"/descargaSpring.jsp");
			
		
			// 2.0 Creando a nivel de webapp o WebContent la carpeta de contenidode los jsp no en WEB-INF 
			response.sendRedirect(request.getContextPath()+"/jsp/descargaSpring.jsp");
			
		%>
	</body>
</html>