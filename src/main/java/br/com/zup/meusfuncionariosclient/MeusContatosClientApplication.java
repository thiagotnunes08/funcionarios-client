package br.com.zup.meusfuncionariosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MeusContatosClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeusContatosClientApplication.class, args);
    }

}
