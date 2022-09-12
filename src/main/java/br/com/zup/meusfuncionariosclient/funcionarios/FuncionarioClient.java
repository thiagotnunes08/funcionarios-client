package br.com.zup.meusfuncionariosclient.funcionarios;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "funcionariosClient",  //to do : usar variaveis
        url = "http://localhost:8080/oauth2-resourceserver-gestao-funcionarios" )

public interface FuncionarioClient {

    @GetMapping("api/funcionarios")
    public List<FuncionarioResponse> listaPorCargo();
}
