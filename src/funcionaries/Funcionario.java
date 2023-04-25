package funcionaries;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String nome;
    private String email;
    private double salario;
    private String cargo;
    private LocalDate dataDeAdmissao;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, double salario, String cargo, LocalDate dataDeAdmissao) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cargo = cargo;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String vizualizar() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", dataDeAdmissao=" + formatter.format(dataDeAdmissao) +
                '}';
    }
}
