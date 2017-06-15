/**
 * 
 */
angular
  .module('app')
  .factory('moneyService', function($http,utilService,localStorageService,appConfig){
  	var monedas = ["PESOS","REAL","DOLAR"];
  	var idMonedas = -1;
   
    var interfaz = {
    		getListadoPesos: function(){
    			return JSON.parse( localStorageService.get('PESOS') );
    		},
    		getListadoReal: function(){
    			return JSON.parse( localStorageService.get('REAL') );
    		},
    		getListadoDolar: function(){
    			return JSON.parse( localStorageService.get('DOLAR') );
    		},
    		iniciarLocalStorage: function(){
    	  	for (i = 0; i < monedas.length;i++){
    	  		if (localStorageService.get(monedas[i]) == null){  	
    	        localStorageService.set(monedas[i],angular.toJson([]));
    	    	}	
    	  	}
    		},
    		getMonedas: function(){
    			return monedas;
    		},
        consumirMoneda: function(unaMoneda){
        	idMonedas++;
        	
    			var monedaConsumida = new Object();
    			monedaConsumida.idMoneda = idMonedas;
    			monedaConsumida.tipoMoneda = unaMoneda;
    			monedaConsumida.time = moment().format();
        	
      		$http.get("/app/api/Cotizacion/" + unaMoneda)
          .then(function(respuesta){
          	monedaConsumida.compra = (respuesta.data.compra + (appConfig.getOscilacion())).toFixed(4);
          	monedaConsumida.venta = (respuesta.data.venta + (appConfig.getOscilacion())).toFixed(4);
          })
          .catch(function (data) {
          	
          });
      		return monedaConsumida;
        }
    }
    return interfaz;
  });