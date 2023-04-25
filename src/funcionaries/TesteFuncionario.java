package funcionaries;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TesteFuncionario {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Ronaldo Nazario", "r9@gmail.com", 10000.00, "Dev Fullstack JR", LocalDate.parse("25/04/2023", formatter)));
        funcionarios.add(new Funcionario("Romario De Souza", "romario10@gmail.com", 11000.00, "Dev Backend JR", LocalDate.parse("25/07/2021", formatter)));

        funcionarios.forEach(funcionario -> System.out.println(funcionario.vizualizar()));
    }
}
