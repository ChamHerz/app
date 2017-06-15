/**
 * AUTOR: ADRIEL CHAMBI
 */

angular
  .module('app', [
  	'ngRoute',
  	'LocalStorageModule',
  	'ngMaterial',
  	'myMoneyList',
  	'myUserDetail'])
  .config(function ($routeProvider,$locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider
    .when("/", {
        controller: "moneyCtrl",
        controllerAs: "money_ctrl",
        templateUrl: "js/view/money-view.html"
    })
    .when("/usuarios", {
        controller: "userCtrl",
        controllerAs: "user_ctrl",
        templateUrl: "js/view/user-view.html"
    })
    .when("/configuracion", {
        controller: "configCtrl",
        controllerAs: "config_ctrl",
        templateUrl: "js/view/config-view.html"
    })
    .otherwise({
      redirectTo: '/'
    });
  })
  .run(function(localStorageService) {
  	

  });