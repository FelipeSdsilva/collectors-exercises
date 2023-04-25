package clients;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[2];

        clientes[0] = new Cliente("Felipe Sousa", 28, "Felipe.fps09@hotmail.com", "442.559.770-09", "Travessa Herique Alvin Correia");
        clientes[1] = new Cliente("Samuel Sousa", 40, "samuca.souls@hotmail.com", "551.558.771-77", "R Tim Maia");


        for (Cliente client : clientes) {
            System.out.println(client.vizualizar());
        }
    }
}
