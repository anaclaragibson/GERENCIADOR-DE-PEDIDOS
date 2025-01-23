import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String telefone;
    private Endereco endereco;
    private List<Pedido> pratosPedidos;
    Scanner leitura = new Scanner(System.in);

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0){
            var menu = """
            ------------
            Escolha o número de sua opção:
            1 - Realizar pedido
            2 - Listar pedido
            3 - Cancelar prato do pedido
            4 - Cancelar pedido
            5 - Alterar endereço
          
            0 - Sair
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

    private void realizarPedido(){

    }
    private void listarPedido(){

    }

    private void cancelarPrato(){

    }
    private void cancelarPedido(){

    }


}
