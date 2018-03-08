<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>:.....[Leasing].....:</title>
	</head>

	<body>
		<h4>Redireccionar al Menu Principal</h4>
		<br>
		<br>
		<%
			out.println("Context : " + request.getContextPath());
		
			String lsRuta =  request.getContextPath() + "/jsp01v01MenuPrincipal.jsp";
			response.sendRedirect(lsRuta);
		 %>

		 
	</body>
</html>