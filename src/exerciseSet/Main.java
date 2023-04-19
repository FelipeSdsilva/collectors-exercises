package exerciseSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           Set<Integer> setList = new HashSet<>();
        setList.add(2);
        setList.add(5);
        setList.add(1);
        setList.add(3);
        setList.add(4);
        setList.add(9);
        setList.add(7);
        setList.add(8);
        setList.add(10);
        setList.add(6);

        System.out.print("Digite o número que você deseja encontrar: ");
        int num = sc.nextInt();

        String result = (setList.contains(num)) ? "O número " + num + " foi encontrado " : "O número " + num + " não foi encontrado!";

        System.out.println(result);

        sc.close();
    }

    public static void dig10NumEmListSet(Scanner sc) {
        Set<Integer> setCom10 = new HashSet<>();

        Iterator<Integer> iteCom10 = setCom10.iterator();
        int i = 0;
        while (i < 10) {
            System.out.print("Digite o " + (i + 1) + " valor: ");
            setCom10.add(sc.nextInt());
            i++;
        }

        System.out.println("Lista dados do Set: ");
        while (iteCom10.hasNext()) {
            System.out.println(setCom10);
            iteCom10.next();
        }
    }
}
