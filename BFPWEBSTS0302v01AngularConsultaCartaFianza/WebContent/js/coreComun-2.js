/**
 * 
 */
var coreComun = angular.module('coreComun', []);

	coreComun.value('hostname', '/BFPWEBSTS0302v01AngularConsultaCartaFianza')	
	//coreComun.value("hostname","/NexoFinanciero"); // NexoFinanciero PrototipoCFv3
	
	coreComun.directive('cargasDe',function(cargador, hostname) {
		console.info(cargador);
		console.info(hostname);
		return {
			restrict: 'E', //Elementos
			controller : function($scope){
			},
			link: function($scope) {
				cargador.instanciar();
				$scope.haCargado = true;
				$scope.cargador = cargador;
			},
		    templateUrl: hostname+'/cargador.html'
	  	};
	});
	
	coreComun.factory("cargador", function($timeout) {
		
		var config = {
			esVisible : true,
			tipoMensaje : 2,
			mensaje : "En cargador",
			mostrarMensajeError : true,
		};
		
		var autocentrar = function(){
			$(".CARGADOR_MODAL").css("top",Math.ceil(($(window).height()-($(".CARGADOR_MODAL").height()+22))/2)+"px");
			$(".CARGADOR_MODAL").css("left",Math.ceil(($(window).width()-($(".CARGADOR_MODAL").width()+22))/2)+"px");
		};
		
		return {
			data : config,

			mostrarMensaje : function(mensaje,callback){
				this.mostrar(callback);
				this.data.tipoMensaje = 0; 
				this.data.mensaje = mensaje;
			},
			
			mostrarError : function(mensaje,callback){
				this.mostrar(callback);
				this.data.tipoMensaje = 3;
				this.data.mensajeError = mensaje;
			},
			
			ocultar : function(callback){
				alert(callback);
				if(!config.esVisible){
					if(typeof(callback)!="undefined"){
						callback();
					}
				} else {
					$(".CARGADOR").fadeOut("fast",function(){   //llama a la clase CARGADOR
						config.esVisible = false;
						if(typeof(callback)!="undefined"){
							callback();
						}
					});
				}
			},
			
			instanciar : function(){
				$(window).resize(function() {
					autocentrar();
				});
				autocentrar();
				$(".CARGADOR").show();
			}
		};
	});