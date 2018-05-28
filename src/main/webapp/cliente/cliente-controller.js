angular.module('clienteApp',[]).controller('ClienteController', function ($scope) {


    $scope.acentos = [];
    var linhas = $scope.linhas = [];
    var colunas = $scope.colunas = [];


    var capacidade = 174;

    for (colunas = 0; colunas < 6; colunas++) {
        for (linhas = 0; linhas < capacidade/6; linhas++) {
            console.log($scope.acentos = [linhas][colunas]);
        }
    }



});