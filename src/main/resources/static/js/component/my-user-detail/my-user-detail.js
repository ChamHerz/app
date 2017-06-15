/**
 * 
 */
angular
  .module('myUserDetail',[])
  .component("myUserDetail", {
  	bindings: {
  		oneUser: "<"
  	},
  	templateUrl: "js/component/my-user-detail/my-user-detail.html",
    controller: function(){
    	var vm  = this;
    	vm.variable = 'variable';
    	
    }
  });