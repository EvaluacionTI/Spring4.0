<%  
    if(request.getParameter("prueba")!=null){
    	//System.out.println("[ACCESO]1. llega el parametro Prueba se muestra");
    	out.print(request.getParameter("prueba"));
    } else { // Esta nulo y envia a 
    	//System.out.println("[ACCESO]2.  No llega el parametro Prueba asi que se manda a 'acceder.jsp'");
    	response.sendRedirect("acceder.jsp");
    }
%>