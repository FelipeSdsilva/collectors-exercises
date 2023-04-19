package application;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         ArrayList<String> cores = new ArrayList<>();

        System.out.println("Digite 5 cores: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            cores.add(sc.nextLine());
        }
        System.out.println("Listar todas as cores: ");
        cores.forEach(System.out::println);

        Collections.sort(cores);
        System.out.println("Ordenar as cores: ");
        cores.forEach(System.out::println);

        sc.close();

    }

 

    public static void acharUmNumeroEmUmArrayList(Scanner sc) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(6);

        System.out.print("Digite o número que você deseja encontrar: ");
        int num = sc.nextInt();

        System.out.println((arrayList.contains(num)) ? "O número " + num + " está localizado na posição: " + arrayList.indexOf(num) : "O número " + num + " não foi encontrado!");
    }


}
