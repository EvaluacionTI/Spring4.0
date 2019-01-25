<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.util.List" %>
<%@ page import = "java.util.LinkedList" %>
<%@ page import = "java.util.Iterator" %>

<%@ page import = "pe.tata.bfp.ibs.tarjeta.entidad.CETarjetaCredito" %>
<%@ page import = "pe.tata.bfp.ibs.tarjeta.controladora.CCTarjetaCredito" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>:....[ TATA - BFP - Tarjeta Crédito]....:</title>
	</head>
	<body style="background-color:olive;">
		<h3 style="background-color: orange; text-align: center">Consulta de Saldo de Tarjeta de Crédito</h3>
		<hr style="background-color: blue; width: 100%;height: 3px">
<!--
	1. Declaración de variables 
 -->		
		<%!
			private List<CETarjetaCredito> moLista = null;
			private CETarjetaCredito moCETarjetaCredito;
			int index = 0;
		%>

<!--
	2. Inicializar de objetos del programa 
 -->		

		<%
			CCTarjetaCredito moCCTarjetaCredito = new CCTarjetaCredito();

			moLista = new LinkedList<CETarjetaCredito>();
			moLista = moCCTarjetaCredito.listaTotalSaldoTarjetaCredito();
			
			moCETarjetaCredito = new CETarjetaCredito();
			Iterator<CETarjetaCredito> oIt = moLista.iterator();
		 %>
		
		<table style="color: yellow;font-style:italic;">
			<thead><tr><th>Código Empresa</th>
					   <th>Nombre Empresa</th>
					   <th>N° Pan</th>
					   <th>N° Tarjeta Titular</th>
					   <th>Nombre Tarjeta Titutlar</th>
					   <th>Código Estado Tarjeta</th>
					   <th>Estado Tarjeta</th>
					   <th>Código Vinculado</th>
					   <th>Nombre Titula Habiente</th>
					   <th>Ciclo Facturación</th>
					   <th>Línea Crédito</th>
					   <th>Disponible Consumo</th>
					   <th>Línea Disposición Efectivo</th>
					   <th>Disponible Disposición Efectivo</th>
					   <th>Fecha Facturación</th>
					   <th>Fecha Pago</th>
					   <th>Pago Mínimo MN</th>
					   <th>Pago Total MN</th>
					   <th>Pago Mínimo ME</th>
					   <th>Pago Total ME</th>
				</tr>
			</thead>
<!--
	3. Detalle de información a mostrar 
 -->			
			<%
				while (oIt.hasNext()){
			
				moCETarjetaCredito = (CETarjetaCredito) moLista.get(index);
			 %>
			<tbody><tr><td><%=moCETarjetaCredito.getCodigoEmpresa()%></td>
					<td><%=moCETarjetaCredito.getNombreEmpresa()%></td>
					<td><%=moCETarjetaCredito.getNumeroPan()%></td>
					<td><%=moCETarjetaCredito.getNumeroTarjetaHabiente()%></td>
					<td><%=moCETarjetaCredito.getNombreTarjeta()%></td>
					<td><%=moCETarjetaCredito.getCodigoEstadoTarjeta()%></td>
					<td><%=moCETarjetaCredito.getEstadoTarjeta()%></td>
					<td><%=moCETarjetaCredito.getCodigoVinculado()%></td>
					<td><%=moCETarjetaCredito.getNombreCliente()%></td>
					<td><%=moCETarjetaCredito.getCicloFacturacion()%></td>
					<td><%=moCETarjetaCredito.getLineaCredito()%></td>
					<td><%=moCETarjetaCredito.getSaldoLineaCredito()%></td>
					<td><%=moCETarjetaCredito.getLineaDisposicionEfectivo()%></td>
					<td><%=moCETarjetaCredito.getSaldoDisposicionEfectivo()%></td>
					<td><%=moCETarjetaCredito.getDdmmyyyyFacturacion()%></td>
					<td><%=moCETarjetaCredito.getDdmmyyyyPago()%></td>
					<td><%=moCETarjetaCredito.getPagoMinimoMN()%></td>
					<td><%=moCETarjetaCredito.getPagoTotalMN()%></td>
					<td><%=moCETarjetaCredito.getPagoMinimoME()%></td>
					<td><%=moCETarjetaCredito.getPagoTotalME()%></td>			
				</tr>
			</tbody>
			<%
					oIt.next();
					index ++;
				}
			 %>
		</table>
	</body>
</html>