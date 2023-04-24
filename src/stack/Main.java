package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        Stack<String> livros = new Stack<>();
        int op = 1;
        do {
            menu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Digite o nome: ");
                    name = sc.nextLine();
                    livros.push(name);
                    livros.forEach(System.out::println);
                    System.out.println("Livro adicionado!");
                }
                case 2 -> {
                    if (livros.isEmpty()) System.out.println("A Pilha está vazia!");
                    else {
                        System.out.println("Lista de livros na pilha: ");
                        livros.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    livros.pop();
                    System.out.println("Pilha: ");
                    livros.forEach(System.out::println);
                    System.out.println((livros.isEmpty()) ? "A pilha está vazia!" : "Um livro foi removido da pilha!");
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
                |        1 - Adicionar Livro Na pilha           |
                |        2 - Listar Todos os livros             |
                |        3 - Retirar livro da pilha             |
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