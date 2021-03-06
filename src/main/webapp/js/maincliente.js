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
        .when('/comprar/passagem', {
            templateUrl: 'partials/compra-passagem.html',
            controller: 'ComprarPassagemController',
            resolve: {
                routeName: function () {
                    return "Compra Passagem";
                }
            }
        });
});