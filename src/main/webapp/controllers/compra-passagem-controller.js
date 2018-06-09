angular.module('cliente').controller('ComprarPassagemController', function ($scope, routeName, $http) {

    console.log("ComprarPassagemController");

    $scope.rota = routeName;

    /*Objetos*/
    $scope.passageiro = {};

    $scope.voos = [];

    /*Ação de Salvar*/
    $scope.salvar = function () {

        /*Monta o objeto responsável para persistir no backend*/
        var objSave = {
            nome: $scope.passageiro.nome,
            documento: $scope.passageiro.documento,
            email: $scope.passageiro.email,
            telefone: $scope.passageiro.telefone,
            voo: {
                id: $scope.vooId
            }
        }

        $http.post('/passageiro/salvar', objSave)
            .then(function (value) {
                console.log(value);
            })
            .catch(function (reason) {
                console.log(reason);
            })
    };

    /*Inicia Página*/
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