import java.util.Scanner;

public class CriarCliente {
    public void criarCliente(Cliente cliente){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nomeCliente = entrada.nextLine();
        cliente.setNomeCliente(nomeCliente);
        System.out.println("Digite seu telefone");
        var telefone = entrada.nextLine();
        cliente.setTelefone(telefone);
    }
}
