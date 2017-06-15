/**
 * 
 */
angular
  .module('app')
  .factory('userService', function($http){
  	var serviceRestUser = {};
  	
  	serviceRestUser.getUserList = function(){
  		return $http.get("/app/api/Usuarios");
  	};
 	
  	return serviceRestUser;
  });