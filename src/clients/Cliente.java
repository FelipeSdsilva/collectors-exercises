package clients;

public class Cliente {

    private String name;
    private int idade;

    private String emil;
    private String cpf;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String name, int idade, String emil, String cpf, String endereco) {
        this.name = name;
        this.idade = idade;
        this.emil = emil;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String vizualizar() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", emil='" + emil + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
