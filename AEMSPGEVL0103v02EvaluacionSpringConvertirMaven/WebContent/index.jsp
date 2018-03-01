<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>.....[Evaluacion Spring 4.3.8].....</title>
</head>
<body>
	<h4>Convertir un Proyecto Dinamico en Maven</h4>
	<br>
	Lista no ordenada
	<br>
	Click derecho en el proyecto (SPG01v02ConvertirProyectoMaven)
	<ul>
		<li>1: El proyecto generado tiene que generar un archivo web.xml en WEB-INF</li>
		<li>2: Convert to Maven Project: clic derecho / Configure / Convert to Maven Project</li>
		<li>3: Ventana Maven: Cambiar los datos: Dice y debe decir
			<ul><li>3.1. Group Id : SPG02v01ConvertirProyectoMaven ---> tata.bfp.inventario</li>
				<li>3.2. Artifact Id : SPG02v01ConvertirProyectoMaven ---> Tata_Inventario</li>
				<li>3.3. Version : 0.0.1-SNAPSHOT ---> : 0.0.1-SNAPSHOT</li>
				<li>3.4. Packaging : war ---> war</li>
				<li>3.5. Name : Web Inventario Spring</li>
				<li>3.6. Description : Evaluación de Spring con Maven</li>
			</ul>
		</li>
		<li>4: Pulsar clic en el boton Finish</li>
	</ul>
	<br>
	<p>Revisar el archivo POM.XML que se ha generado.
	Observar que el proyecto ahora tiene un simbolo M que referencia a Maven
</body>
</html>