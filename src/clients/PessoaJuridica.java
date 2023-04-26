package clients;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String name, int idade, String emil, String endereco, String cnpj) {
        super(name, idade, emil, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void vizualizar() {
        System.out.println("Cliente{" +
                "name='" + getName() + '\'' +
                ", idade=" + getIdade() +
                ", emil='" + getEmail() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cnpj= '" + cnpj +
                '}');
    }
}
