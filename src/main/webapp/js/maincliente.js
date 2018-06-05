angular.module('cliente', ['ngRoute']).config(function ($routeProvider) {
    $routeProvider
        .when('/pesquisa/passagem', {
            templateUrl: 'partials/pesquisa-passagem.html',
            controller: 'PesquisaPassagemController',
            resolve: {
                routeName: function () {
                    return "Pesquisa Passagem";
                }
            }
        })
        .when('/', {
            templateUrl: 'partials/main.html',
            controller: 'MainColaboradorController'
        });
});