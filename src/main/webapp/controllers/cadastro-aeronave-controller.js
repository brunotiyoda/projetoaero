angular.module('colaborador').controller('CadastroAeronaveController', function ($scope, routeName, $http) {

    console.log("CadastroAeronaveController");

    /*Nome da rota*/
    $scope.rota = routeName;

    /*objeto Aeronave*/
    $scope.aeronave = {};

    /*Ação de Salvar*/
    $scope.salvar = function () {
        $http.post('/aeronave/salvar', $scope.aeronave)
            .then(function (value) {
                console.log(value);
            })
            .catch(function (reason) {
                console.log(reason);
            })

        console.log($scope.aeronave)
    };

});