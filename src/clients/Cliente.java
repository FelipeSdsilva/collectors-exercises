package clients;

public class Cliente {

    private String name;
    private int idade;
    private String email;

    private String endereco;

    public Cliente() {
    }

    public Cliente(String name, int idade, String email, String endereco) {
        this.name = name;
        this.idade = idade;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void vizualizar() {
    }
}
