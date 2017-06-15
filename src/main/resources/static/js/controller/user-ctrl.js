/**
 * 
 */
angular
  .module('app')
  .controller("userCtrl", function(userService){
  	var vm = this;
  	//vm.listaUsuarios = userService.getUserList();
  	
    getUsers();

    function getUsers() {
    	userService.getUserList()
            .then(function (response) {
            	vm.listaUsuarios = response.data;
            }, function (error) {
            	vm.status = 'Se produjo un error: ' + error.message;
            });
    }
  	
	});