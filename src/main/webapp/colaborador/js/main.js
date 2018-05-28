'use strict';

angular.module('bisc', ['ngRoute', 'ngAnimate'])
    .config(function ($routeProvider, $locationProvider) {
        $routeProvider
            .when('/pesquisa/aeronave', {
                templateUrl: '/colaborador/pesquisar_aeronave.html',
                controller: 'PesquisaAeronaveController'
            })
            .when('/cadastro/aeronave', {
                templateUrl: '/colaborador/cadastro_aeronave.html',
                controller: 'CadastroAeronaveController'
            });

        //$locationProvider.html5Mode(true);
    });