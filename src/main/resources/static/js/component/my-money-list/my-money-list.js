/**
 * 
 */
angular
  .module('myMoneyList',['myMoneyDetail'])
  .factory('myMoneyListService', function(){
    var descargasRealizadas = ["OK"];
    
    var interfaz = {
        nombre: "Manolo",
        getDescargas: function(){
            return descargasRealizadas;
        },
        nuevaDescarga: function(descarga){
            descargasRealizadas.push(descarga);
        }
    }
    return interfaz;
  })
  .component("myMoneyList", {
  	bindings: {
  		moneyList: "="
  	},
  	templateUrl: "js/component/my-money-list/my-money-list.html",
    controller: function(myMoneyListService){
    	
    	function increment() {
    		myMoneyListService.nuevaDescarga("nada");
        this.moneyList = myMoneyListService.getDescargas();
      }
    	this.increment = increment;
    }
  });