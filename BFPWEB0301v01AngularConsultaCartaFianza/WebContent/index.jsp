<%
	if(session!=null && session.getAttribute("SESSION_USUARIO_WEB_BPM")!=null){
  		response.sendRedirect("portal/index.html");
  	} else {
  		response.sendRedirect("portal/postAutenticacion.html?txt_log_acceder=chezz");
  	}
%>
