import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String telefone;
    private Pedido pedido = new Pedido();
    private Endereco endereco;
    Scanner leitura = new Scanner(System.in);

    public Cliente() {
    }

    public Cliente(String nomeCliente, String telefone, Endereco endereco) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.endereco = getEndereco();
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    ---------------------
                    BEM-VINDO(A)! ESCOLHA UMA DAS OPÇÕES
                    1 - Realizar pedido
                    2 - Listar pedido
                    3 - Cancelar prato do pedido
                    4 - Cancelar pedido
                    5 - Alterar endereço
                    
                    0 - Sair
                    Escolha o número de sua opção:
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    realizarPedido();
                    break;
                case 2:
                    listarPedido();
                    break;
                case 3:
                    cancelarPrato();
                    break;
                case 4:
                    cancelarPedido();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void realizarPedido() {
        pedido.setComanda(1);
        System.out.println("Escolha a forma de pagamento: ");
        var formaPagar = leitura.nextLine();
        pedido.setStatus(true);
        pedido.adicionarPrato();
        pedido.calcularTotal();
    }

    private void listarPedido() {
        System.out.println(pedido.getPratos());
    }

    private void cancelarPrato () {
        System.out.println(pedido.getPratos());
        System.out.println("Digite o ID do prato que deseja cancelar: ");
        var pratoCancelado = leitura.nextInt();
        if(pratoCancelado == 1){
            pedido.getPratos().remove(0);
        }

    }

    private void cancelarPedido () {
        pedido.getPratos().clear();
        System.out.println("Pedido cancelado");
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
