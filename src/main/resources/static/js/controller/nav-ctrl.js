/**
 * 
 */
angular
  .module('app')
  .controller("navCtrl", function($location){
    var map = this;
    map.estoy = function(ruta){
        return $location.path() == ruta;
    }
  });