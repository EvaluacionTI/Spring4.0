<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Evaluación Spring 4.3.8].....</title>
	</head>

	<body>
		<h4>Proyecto Dinamico Spring 4.3.8</h4>
		<br>
		<br>
		<p>Estructura de un Proyecto Dinámico y mostrar en context de la Página. 
		<%
			out.println("Context : " + request.getContextPath());
			//response.sendRedirect(request.getContextPath()+"/descargaSpring.jsp");
		 %>
	</body>
</html>