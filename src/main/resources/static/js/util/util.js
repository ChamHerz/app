/**
 * 
 */
angular
  .module('app')
  .factory('utilService', function($http){
   
    var interfaz = {
        hace: function(unaFecha){
        	var ahora = Date.now();
        	
        	var diferencia = ahora - unaFecha;
        	         	
        	return diferencia;
        },
    }
    return interfaz;
  });