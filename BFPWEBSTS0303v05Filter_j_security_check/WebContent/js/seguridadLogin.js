function iniciarLogin(){
//	alert($.document);
	alert($('#idUsuario').val());
	alert($('#idClave').val());
	
	$.ajax({
		url : "j_security_check",
		data: {
			j_username: $('#idUsuario').val(),
			j_password: $('#idClave').val(),
		},
		success: function(data, textStatus, xhr){
			console.log("data : ", data);
			console.log("textStatus : ", textStatus);
			console.log("xhr : " + xhr.status);
			window.location = "/portal/jsp0203v01OkFORM_j_security_checkJSP.jsp";
		}
		//,
		//error: function(jqXHR, textStatus, errorThrown){
		//	console.log(textStatus, errorThrown);
		//	window.location = "/index.jsp";
		//	alert(" Error ..!" + textStatus);
		//}
	});
}

/*
$.ajax({
    type: "POST",
    contentType: "application/text",
    url: "j_security_check",
    // This is the type what you are waiting back from the server
    dataType: "text",
    async: false,
    crossDomain: false,
    data: {
        j_username: "admin",
        j_password: "paSSWORD"
    },
    success: function(data, textStatus, xhr) {
        alert('Thanks for your signin in! ' + xhr.status);
        window.location = "/SesamaMaven/protected/adminWelcome.html";
    },
    error: function(jqXHR, textStatus, errorThrown) {
        console.log(textStatus, errorThrown);
        window.location = "/SesamaMaven/index.html";
        alert(' Error in signIn-process!! ' + textStatus);
    }


});*/