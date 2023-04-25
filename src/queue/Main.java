package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        String name;

        Queue<String> clientes = new LinkedList<>();
        int op = 1;
        do {
            menu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Digite o nome: ");
                    name = sc.nextLine();
                    clientes.add(name);
                    clientes.forEach(System.out::println);
                    System.out.println("Cliente adicionado!");
                }
                case 2 -> {
                    if (clientes.isEmpty()) System.out.println("A Fila está vazia!");
                    else {
                        System.out.println("Lista de clientes na fila: ");
                        clientes.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    if (clientes.isEmpty()) System.out.println("A Fila está vazia!");
                    else {
                        clientes.remove();
                        System.out.println("Fila: ");
                        clientes.forEach(System.out::println);
                        System.out.println("Cliente foi chamado! ");
                    }
                }
                case 0 -> finalMenu();
                default -> System.out.println("Opção invalida!!");
            }

        } while (op != 0);

        sc.nextLine();
    }

    public static void menu() {
        System.out.print("""
                \n ________________________________________________
                |                                               |
                |                                               |
                |        1 - Adicionar Cliente Na Fila          |
                |        2 - Listar Todos Clientes              |
                |        3 - Retirar Cliente da Fila            |
                |        0 - Sair                               |
                |                                               |
                |_______________________________________________|
                Entre com a opção desejada: """);
    }

    public static void finalMenu() {
        System.out.println("""
                ________________________________________________
                |                                               |
                |                                               |
                |                                               |
                |             Obrigado por utilizar!            |
                |                 Volte Sempre                  |
                |                                               |
                |                                               |
                |_______________________________________________|""");
    }
}