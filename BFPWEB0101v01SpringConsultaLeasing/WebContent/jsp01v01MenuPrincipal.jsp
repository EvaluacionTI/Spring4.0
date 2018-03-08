
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>.....[Evaluacion Spring].....</title>
</head>
<body>
	<h4>Menu de Consultas</h4>
	<br>
	<%
		String lsConsultaFox, lsConsultaIbs, lsConsultaWin, lsSimulador;
		
		lsConsultaFox =  request.getContextPath() + "/Fox/fox01v01MenuFoxLeasing.jsp";
		lsConsultaWin =  request.getContextPath() + "/Win/win01v01MenuWinLeasing.jsp";		
		lsConsultaIbs =  request.getContextPath() + "/Ibs/ibs01v01MenuIBS.jsp";
		lsSimulador =  request.getContextPath() + "/Simulador/sim01v01MenuSimulador.jsp";
		
	%>
	<br>
	<table>
		<thead><tr><td>N°</td>
			<td>Título</td>
			<td>Enlace</td>
		</tr>
		</thead>
		<tbody><tr><td>1</td>
			<td>Consultas Fox Leasing</td>
			<td><a href=<%=lsConsultaFox%>>F</a></td>
			</tr>
			<tr><td>2</td>
			<td>Consultas Win Leasing</td>
			<td><a href=<%=lsConsultaWin%>>W</a></td>
			</tr>
			<tr><td>3</td>
			<td>Consultas Ibs Leasing</td>
			<td><a href=<%=lsConsultaIbs%>>I</a></td>
			</tr>
			<tr><td>4</td>
			<td>Simulador</td>
			<td><a href=<%=lsSimulador%>>S</a></td>
			</tr>			
		</tbody>
	</table>
	
	<br>
	
	<br>
	
	<br>
</body>
</html>