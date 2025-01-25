import java.util.Scanner;

public class CriarCliente {
    public void criarCliente(Cliente cliente){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nomeCliente = entrada.nextLine();
        cliente.setNomeCliente(nomeCliente);
        System.out.println("Digite seu endereço");
        Endereco endereco = new Endereco();
        System.out.println("Rua: ");
        var rua = entrada.nextLine();
        endereco.setRua(rua);
        System.out.println("Bairro: ");
        var bairro = entrada.nextLine();
        endereco.setBairro(bairro);
        System.out.println("Número: ");
        var numero= entrada.nextLine();
        endereco.setNumero(numero);
        System.out.println("Complemento: ");
        var complemento = entrada.nextLine();
        endereco.setComplemento(complemento);
        System.out.println("CEP: ");
        var cep = entrada.nextLine();
        endereco.setCep(cep);
        System.out.println("Digite seu telefone");
        var telefone = entrada.nextLine();
        cliente.setTelefone(telefone);
    }
}
