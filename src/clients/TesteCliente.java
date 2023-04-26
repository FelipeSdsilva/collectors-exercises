package clients;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[4];

        clientes[0] = new PessoaFisica("Felipe Sousa", 28, "Felipe.fps09@hotmail.com", "Travessa Herique Alvin Correia", "442.559.770-09");
        clientes[1] = new PessoaFisica("Roger Guedes", 22, "rg10@hotmail.com", "R itaquera", "455.555.222-20");
        clientes[2] = new PessoaJuridica("Samuel Sousa", 40, "samuca.souls@hotmail.com", "R Tim Maia", "11.590.018.0001-22");
        clientes[3] = new PessoaJuridica("Pereira Silva", 18, "ps@hotmail.com", "R do leme ao pontal", "43.552.000.0002-22");


        for (Cliente client : clientes) {
           client.vizualizar();
        }
    }
}
