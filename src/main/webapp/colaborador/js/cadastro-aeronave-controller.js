angular.module('colaborador',[]).controller('CadastroAeronaveController', function ($scope, $http) {

    console.log("AeroContro");

    $scope.aeronave = {};

    $cope.salvar = function () {
      console.log("salvar");
    };

});