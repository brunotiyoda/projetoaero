angular.module('colaborador', ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'colaborador/dashboardtest.html',
                controller: 'DashboardTest'
            })
            .when('/pesquisa/aeronave', {
                templateUrl: '/colaborador/pesquisa_aeronave.html',
                controller: 'PesquisaAeronaveController'
            })
            .when('/cadastro/aeronave', {
                templateUrl: '/colaborador/cadastro_aeronave.html',
                controller: 'CadastroAeronaveController'
            });

        $routeProvider.otherwise({redirectTo: '/fotos'});
    });