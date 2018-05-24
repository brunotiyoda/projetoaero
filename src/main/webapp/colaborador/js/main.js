angular.module('colapp', ['ngRoute', 'ngAnimate'])
    .config(function ($routeProvider, $locationProvider) {
            $routeProvider
                .when('/', {
                    templateUrl: 'cadastro_aeronave.html',
                    controller: 'AeronaveController'
                });

            //$locationProvider.html5Mode(true);
        });