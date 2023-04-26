package clients;

public class PessoaFisica extends Cliente {
    String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, int idade, String emil, String endereco, String cpf) {
        super(name, idade, emil, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void vizualizar() {
        System.out.println( "Cliente{" +
                "name='" + getName() + '\'' +
                ", idade=" + getIdade() +
                ", emil='" + getEmail() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cpf= '" + cpf +
                '}');
    }
}
