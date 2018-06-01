angular.module('colaborador').controller('CadastroAeronaveController', function ($scope, routeName, $http) {

    console.log("CadastroAeronaveController");

    $scope.rota = routeName;

    $scope.aeronave = {};

    $scope.salvar = function () {

        $http.post('aeronave/salvar', $scope.aeronave)
            .then(function (value) {
                console.log(value);
            })
            .catch(function (reason) {
                console.log(reason);
            })

        console.log("Click");

    };

});