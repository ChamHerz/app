/**
 * 
 */
angular
  .module('app')
  .factory('appConfig', function(){
  	var intervaloTiempo = 5000;
  	var oscilacion = 1;
  	
    var interfaz = {
        getIntervaloTiempo: function(){
            return intervaloTiempo;
        },
        setIntervaloTiempo: function(unIntervalo){
        	intervaloTiempo = unIntervalo;
        },
        getOscilacion: function(){
        	var zeroOrOne = Math.round(Math.random());
        	if (zeroOrOne){
        		return oscilacion;
        	}
        	else {
        		return oscilacion * (-1);
        	}
        },
        setOscilacion: function(unaOscilacion){
        	oscilacion = parseFloat(unaOscilacion);
        }
    }
    return interfaz;
  });