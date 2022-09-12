package br.com.zup.meusfuncionariosclient.funcionarios;

public class FuncionarioDaEmpresaResponse {

    private Long id;
    private String nome;
    private String cpf;

    private CargoResponse cargo;

    public FuncionarioDaEmpresaResponse(FuncionarioResponse funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.cargo = funcionario.getCargo();
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
