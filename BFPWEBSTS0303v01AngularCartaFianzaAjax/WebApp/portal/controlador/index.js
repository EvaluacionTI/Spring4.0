/**
 * 
 */

var vPortal = angular.module('portal', []);

vPortal.controller('vPrincipal', function($scope){
    var vDato = "CFZ";
    
    alert($scope);
    $scope.datos = {};
    $scope.compatibilidad = false;
        
    $scope.anho = new Date().getFullYear();
    $scope.haCargado = false;	
});