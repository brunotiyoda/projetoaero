angular.module('cliente').controller('PesquisaPassagemController', function ($scope, routeName, $http) {

    $scope.rota = routeName;

    $scope.passagens = [];

    console.log("PesquisaPassagemController");

    /*Inicia a pagina*/
    function init() {
        $http.get('/passageiro/listaTodos')
            .then(function (resposta) {
                $scope.passagens = resposta.data;
            })
            .catch(function (erro) {
                console.log(erro);
            });
    };


    init();
});