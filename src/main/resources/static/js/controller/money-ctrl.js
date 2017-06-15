/**
 * 
 */
angular
  .module('app')
  .controller("moneyCtrl", function(localStorageService,$interval,appConfig,moneyService,moneyRest){
  	var vm = this;
  	//var monedas = ["PESOS","REAL","DOLAR"];
  	var monedas_names = moneyService.getMonedas();
  	
  	moneyService.iniciarLocalStorage();
  	  	  	 	
  	vm.listadoPesos = moneyService.getListadoPesos();
  	vm.listadoReal = moneyService.getListadoReal();
  	vm.listadoDolar = moneyService.getListadoDolar();
  	
  	vm.listadosMonedas = [vm.listadoPesos,vm.listadoReal,vm.listadoDolar];
  		
  	function reset() {
  		alert("storage borrado");
  		localStorageService.clearAll();
    }
  	this.reset = reset;
  	
  	$interval(function() {
  		for (i = 0; i < monedas_names.length;i++){
  			var consumirMoneda = moneyService.consumirMoneda(monedas_names[i]);
  				vm.listadosMonedas[i].push(consumirMoneda);
      		localStorageService.set(monedas_names[i],angular.toJson(vm.listadosMonedas[i]));
      }},appConfig.getIntervaloTiempo());
  	
  });