angular.module('cliente').controller('PesquisaPassagemController',function ($scope, routeName, $http) {

    $scope.rota = routeName;

    $scope.passagem = {};

    console.log("PesquisaPassagemController");

    /*Inicia a pagina*/
    function init() {

    };


    init();
});