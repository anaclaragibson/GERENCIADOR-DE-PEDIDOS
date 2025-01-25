import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String telefone;
    private Endereco endereco;
    private List<Prato> pratosPedidos = new ArrayList<>();
    Scanner leitura = new Scanner(System.in);

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0){
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

    private void realizarPedido(){
        var opcao = -1;
        while (opcao != 0){
            var menuPratos = """
                ------MENU DE PRATOS------
                1. Lasanha Bolonhesa
                2. Macarrão alho e óleo
                3. Risoto de camarão
                4. Lasanha 4 queijos
                
                0. Finalizar pedido
                ESCOLHA O PRATO:
                """;
            System.out.println(menuPratos);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    Prato pratoPedido = new Prato();
                    pratoPedido.setId(1);
                    pratoPedido.setNomePrato("Lasanha Bolonhesa");
                    pratoPedido.setDescricao("Lasanha bolonhesa é uma massa em camadas com molho de carne, queijo e bechamel.\n");
                    pratoPedido.setPreco(55.99);
                    pratosPedidos.add(pratoPedido);
                    break;
                case 2:
                    Prato pratoPedido2 = new Prato();
                    pratoPedido2.setId(2);
                    pratoPedido2.setNomePrato("Macarrão Alho e Oléo");
                    pratoPedido2.setDescricao("Macarrão alho e óleo é um prato simples e delicioso, preparado com macarrão salteado em azeite, alho dourado e uma pitada de sal.\n");
                    pratoPedido2.setPreco(30.00);
                    pratosPedidos.add(pratoPedido2);
                    break;
                case 3:
                    Prato pratoPedido3 = new Prato();
                    pratoPedido3.setId(3);
                    pratoPedido3.setNomePrato("Risoto de camarão");
                    pratoPedido3.setDescricao("Risoto de camarão é um prato cremoso com arroz arbóreo, camarões, caldo de legumes, vinho branco e queijo parmesão.\n");
                    pratoPedido3.setPreco(55.99);
                    pratosPedidos.add(pratoPedido3);
                    break;
                case 4:
                    Prato pratoPedido4 = new Prato();
                    pratoPedido4.setId(4);
                    pratoPedido4.setNomePrato("Lasanha 4 queijos");
                    pratoPedido4.setDescricao("Lasanha 4 queijos é uma massa em camadas com molho cremoso de mozzarella, parmesão, gorgonzola e provolone.\n");
                    pratoPedido4.setPreco(65.00);
                    pratosPedidos.add(pratoPedido4);
                    break;
                case 0:
                    System.out.println("Finalizando pedido");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void listarPedido(){
        pratosPedidos.forEach(System.out::println);
    }

    private void cancelarPrato(){
        pratosPedidos.forEach(System.out::println);
        System.out.println("Digite o ID do prato que deseja cancelar: ");
        var pratoCancelado = leitura.nextInt();
        pratosPedidos.get(pratosPedidos.indexOf(pratoCancelado));
        pratosPedidos.remove(pratoCancelado);
    }

    private void cancelarPedido(){

    }


}
