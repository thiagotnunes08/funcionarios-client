package br.com.zup.meusfuncionariosclient.funcionarios;

public class FuncionarioResponse {

    private Long id;
    private String nome;
    private String cpf;
    private CargoResponse cargo;

    public FuncionarioResponse(Long id, String nome, String cpf, CargoResponse cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public CargoResponse getCargo() {
        return cargo;
    }
}
