angular.module(`colaborador`, ['ngRoute']).config(function ($routeProvider) {

    $routeProvider
        .when('/pesquisa/aeronave',{
            templateUrl: "partials/pesquisa_aeronave.html",
            controller: "PesquisaAeronaveController",
            resolve: {
                routeName: function () {
                    return "Pesquisa Aeronave";
                }
            }
        })
        .when('/cadastro/aeronave', {
            templateUrl: "partials/cadastro_aeronave.html",
            controller: "CadastroAeronaveController",
            resolve: {
                routeName: function () {
                    return "Cadastro Aeronave";
                }
            }
        })
        .when('/', {
            templateUrl: 'partials/main.html',
            controller: 'MainColaboradorController'
        });

});
