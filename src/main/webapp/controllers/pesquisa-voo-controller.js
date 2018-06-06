angular.module('colaborador').controller('PesquisaVooController', function ($scope, routeName, $http) {

    console.log("PesquisaVooController");
    $scope.rota = routeName;

    $scope.voos = [];

    function init() {
        $http.get('/voo/listaTodos')
            .then(function (resposta) {
                $scope.voos = resposta.data;
            })
            .catch(function (erro) {
                console.log(erro);
            });
    }

    init();
});
