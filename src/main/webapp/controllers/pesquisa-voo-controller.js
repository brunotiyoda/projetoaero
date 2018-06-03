angular.module('colaborador').controller('PesquisaVooController', function ($scope, routeName, $http) {

    $scope.rota = routeName;

    console.log("PesquisaVooController");

    $scope.aeronaves = [];

    function init() {

    }

    init();
});