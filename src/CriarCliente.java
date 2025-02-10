import java.util.Scanner;

public class CriarCliente { // classe criar cliente
    public void criarCliente(Cliente cliente){ // método criar cliente que recebe como parâmetro o objeto cliente
        Scanner entrada = new Scanner(System.in); // nome para o scanner
        System.out.println("Digite seu nome: ");
        var nomeCliente = entrada.nextLine(); // lê o nome do cliente
        cliente.setNomeCliente(nomeCliente); // define o nome do cliente na variável
        System.out.println("Digite seu telefone");
        var telefone = entrada.nextLine(); // lê o número de telefone do cliente
        cliente.setTelefone(telefone); // define o número de telefone do cliente na variável
    }
}