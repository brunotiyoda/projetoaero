angular.module('colaborador').controller('PesquisaVooController', function ($scope, routeName, $http) {

    $scope.rota = routeName;

    console.log("PesquisaVooController");

    $scope.aeronaves = [];

    function init() {
        $http.get('/aeronave/listaTodos')
            .then(function (resposta) {
                $scope.aeronaves = resposta.data;
            })
            .catch(function (erro) {
                console.log(erro);
            });
    }

    init();
});