/**
 * 
 */

var vAplicacionSeguridad = angular.module('myAppCartaFianza', []);

vAplicacionSeguridad.controller('myCtrlSeguridad', function($scope){
	$scope.mensaje = "";
	
	$scope.anho = new Date().getFullYear();

	$scope.acceder = function(){
		
		if($("#usuario").val().length==0){
			$("#usuario").focus();
			return false;
		}
		
		if($("#clave").val().length==0){
			$("#clave").focus();
			return false;
		}

		logeo_acceder("false");
	};	
});


var logeo_acceder = function(borraSession){
	
//	alert("Ajax");
//	alert($("#usuario").val());
//	alert($("#clave").val());
	$.ajax({
		url: "j_security_check",
		data: {j_username : $("#usuario").val(),j_password : $("#clave").val(),rnd:Math.random()},
		success : function(data, textStatus){
			alert(data);
//			var dataJSON = {"estado" : false};
//			try {
//				dataJSON = jQuery.parseJSON( data );
//			} catch(e){};
//			alert(dataJSON);
//			console.log("Correcto ----->" + data);
			window.location = "portal/jsp0103v01Bienvenida.jsp";
//			location.href = "portal/jsp0102v01Bienvenida.jsp";
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert(jqXHR);
			console.log(textStatus, errorThrown);
			window.location = "jsp0102v01ErrorLogin.jsp";
			alert('Error en el proceso ' + textStatus);
			alert(errorThrown);
		}
	});
	
};