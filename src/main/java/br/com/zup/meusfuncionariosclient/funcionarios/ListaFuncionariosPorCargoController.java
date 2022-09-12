package br.com.zup.meusfuncionariosclient.funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ListaFuncionariosPorCargoController {

    @Autowired
    private FuncionarioClient client;

    @GetMapping("/api/contatos-por-empresa")
    public ResponseEntity<?> listaPorCargo(@RequestParam CargoResponse cargo){


        List<FuncionarioDaEmpresaResponse> funcionariosDaEmpresa =
                client.listaPorCargo()

                        .stream()
                        .filter(funcionarioResponse -> cargo.equals(funcionarioResponse.getCargo()))
                        .map(FuncionarioDaEmpresaResponse::new).collect(Collectors.toList());
    return ResponseEntity
            .ok(funcionariosDaEmpresa);

    }
}
