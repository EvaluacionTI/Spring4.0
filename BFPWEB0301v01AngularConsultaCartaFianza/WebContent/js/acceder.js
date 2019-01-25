/**
 * 
 */
// var acceder = angular.module('acceder', ['ui.bootstrap','coreComun']);
var acceder = angular.module('acceder', ['ui.bootstrap','coreComun']);

//acceder.controller('Logeo', function($scope, $modal, cargador){
//acceder.controller('Logeo', function($scope, cargador){
acceder.controller('Logeo', function($scope){
	$scope.mensaje = "Angular";
	
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
		
/*		cargador.mostrarAcceder();
		if($("#acceder").data('esDetenido')=='1'){
			return ;
		} else {
			$("#acceder").data('esDetenido','1');
			$("#clave").val($.trim($("#clave").val()));
			logeo_acceder("false");
		}*/
	};	
});


$(document).ready(function(){
	
	if(esVersionSoportada()){
		
		$("#usuario").keypress(function(event){ // Filtrar x buscar
			if (event.keyCode == 10 || event.keyCode == 13){
				if($.trim($(this).val())==""){
					$(this).val("");
					$("#usuario").focus();
				} else {
					$(this).val($.trim($(this).val()));
					$("#clave").focus();
				}
				return false;
			}
		});
		
		$("#clave").keypress(function(event){ // Filtrar x buscar
			if (event.keyCode == 10 || event.keyCode == 13){
				if($.trim($(this).val())==""){
					$(this).val("");
					$("#clave").focus();
				} else {
					$(this).val($.trim($(this).val()));
					$("#acceder").click();
				}
				return false;
			}
		});
		
		$("#acceder").data('esDetenido','0');
		$("#usuario").focus();
	
	} else {
		location.href = "errorNavegador.html";
	}
	
	var centrar = function(){
		var objLog = $("#LogeoContenido");
		objLog.css("left",Math.floor(($(window).width()-objLog.width())/2)+"px");
		objLog.css("top",(Math.floor(($(window).height()-objLog.height())/2)+23)+"px");
	};
	
	$(window).resize(function() {
		centrar();
	});
	
	centrar();
	
});