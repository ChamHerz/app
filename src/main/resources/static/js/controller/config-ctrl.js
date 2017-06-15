/**
 * 
 */
angular
  .module('app')
  .controller("configCtrl", function(appConfig,){
  	var vm = this;
  	vm.intervaloTiempo = appConfig.getIntervaloTiempo();
  	
  	vm.setTiempo = function(){
  		appConfig.setIntervaloTiempo(vm.intervaloTiempo);
  	}
  	
  	vm.setOscilacion = function(){
  		appConfig.setOscilacion(vm.group);
  	}
	});