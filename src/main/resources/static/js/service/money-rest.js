/**
 * 
 */
angular
  .module('app')
  .factory('moneyRest', function($http){
  	var serviceRestMoney = {};
  	
  	serviceRestMoney.getMoney = function(unaMoneda){
  		return $http.get("/app/api/Cotizacion/" + unaMoneda)
  	};
 	
  	return serviceRestMoney;
  });