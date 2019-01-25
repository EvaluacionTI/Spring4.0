<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.....[Evaluación Spring].....</title>
</head>
<body>
	<h1>Arquitectura Host - Apx</h1>

	<h4>Configurar el Servlet en Spring</h4>
	<br>
	<br>
	<b>A. Revisar el archivo generado pom.xml</b>
	<ol>
		<li>1: Agregar la etiqueta: properties y dependencies </li>
		<li>2: spring-core</li>
		<li>3: spring-webmvc</li>
		<li>4: servlet-api</li>
		<li>5: junit</li>
	</ol>
	<br>
	B. El archivo web.xml se creo en el momento de la creación del proyecto Spring.
	<dl><dt>Configurar el servlet con la clase DispatcherServlet</dt>
		<dd>Se crea el nombre del servlet y se asigna la clase que se referencia a DispatcherServlet</dd>
	</dl>
	<br>
	C. Configuración del SERVLET
	<dl>	
		<dt><b>Archivo apl-spring-servlet.xml</b></dt>
		<dd>En WEB-INF crear este archivo 

			File / New / Other / Spring / Spring Bean Configurarion File (beans y context de la plantilla XSD)
			<br>
			Así mismo se debe configurar la clase InternalResourceViewResolver que resolverá la plantilla de vista
		</dd>
		
		<dt><b>Archivo index.jsp</b></dt>
	</dl>
	<br>
	D. Ejecutar el proyecto
	
	<%
		out.println(request.getContextPath());
	
	%>	
</body>
</html>