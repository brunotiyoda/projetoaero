angular.module('colaborador').controller('CadastroVooController', function ($scope, routeName, $http) {

    console.log("CadastroVooController");

    $scope.rota = routeName;

    /*objeto Aeronave*/
    $scope.voo = {};

    /*Ação de Salvar*/
    $scope.salvar = function () {
        $http.post('aeronave/salvar', $scope.voo)
            .then(function (value) {
                console.log(value);
            })
            .catch(function (reason) {
                console.log(reason);
            })

        console.log("Click");

    };

});