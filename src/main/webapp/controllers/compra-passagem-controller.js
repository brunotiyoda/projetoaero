angular.module('cliente').controller('ComprarPassagemController', function ($scope, routeName, $http) {

    console.log("ComprarPassagemController");

    $scope.rota = routeName;

    /*Objeto Voo*/
    $scope.passageiro = {};

    /*Ação de Salvar*/
    $scope.salvar = function () {

        /*Monta o objeto responsável para persistir no backend*/
        var objSave = {
            cidadeDePartida: $scope.voo.cidadeDePartida,
            cidadeDeDestino: $scope.voo.cidadeDeDestino,
            dataEHora: $scope.voo.dataEHora,
            aeronave: {
                id: $scope.aeronaveId
            }
        }

        $http.post('/voo/salvar', objSave)
            .then(function (value) {
                console.log(value);
            })
            .catch(function (reason) {
                console.log(reason);
            })
    };

    function isConexao($scope) {

    }

    /*Inicia Página*/
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