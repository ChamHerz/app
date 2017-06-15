/**
 * 
 */
angular
  .module('myMoneyDetail',[])
  .component("myMoneyDetail", {
  	bindings: {
  		oneMoney: "<"
  	},
    templateUrl: "js/component/my-money-detail/my-money-detail.html",
    controller: function($timeout){
    	var vm  = this;
    	
    	var presentarFecha = function(segundos){
    		if (segundos <= 60){
    			return 'hace ' + segundos + ' segundos';
    		}
    		if (segundos <= 3600) {
    			return 'hace ' + Math.trunc(segundos / 60) + ' minutos';
    		}
    		if (segundos <= 216000) {
    			return 'hace ' + Math.trunc(segundos / 3600) + ' horas';
    		}
    		return 'ahora';
    	}
    	
    	$timeout(function() {
    		var ahora = moment();
    		var actual =  moment(vm.oneMoney.time);
    		vm.tiempo = presentarFecha(ahora.diff(actual,"seconds"));
    		//vm.tiempo = moment(vm.oneMoney.time).startOf('second').fromNow();
      });
    	//vm.convertirFecha = function(unaFecha){
    	//	return unaFecha.startOf('second').fromNow();
    	//}
    }
   });