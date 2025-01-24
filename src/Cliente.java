import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String telefone;
    private Endereco endereco;
    private List<Prato> pratosPedidos;
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
        var opcao = -1;
        while (opcao != 0){
            var menuPratos = """
                MENU DE PRATOS:
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
                    Prato lasanhaBolonhesa = new Prato();
                    lasanhaBolonhesa.setNomePrato("Lasanha Bolonhesa");
                    lasanhaBolonhesa.setDescricao("Lasanha bolonhesa é uma massa em camadas com molho de carne, queijo e bechamel.\n");
                    lasanhaBolonhesa.setPreco(55.99);
                    pratosPedidos.add(lasanhaBolonhesa);
                case 2:
                    Prato macarao = new Prato();
                    macarao.setNomePrato("Macarrão Alho e Oléo");
                    macarao.setDescricao("Macarrão alho e óleo é um prato simples e delicioso, preparado com macarrão salteado em azeite, alho dourado e uma pitada de sal.\n" +
                            "\n");
                    macarao.setPreco(30.00);
                    pratosPedidos.add(macarao);
                case 3:
                    Prato risoto = new Prato();
                    risoto.setNomePrato("Risoto de camarão");
                    risoto.setDescricao("Risoto de camarão é um prato cremoso com arroz arbóreo, camarões, caldo de legumes, vinho branco e queijo parmesão.");
                    risoto.setPreco(55.99);
                    pratosPedidos.add(risoto);
                    break;
                case 4:
                    Prato lasanhaQueijo = new Prato();
                    lasanhaQueijo.setNomePrato("Lasanha 4 queijos");
                    lasanhaQueijo.setDescricao("Lasanha 4 queijos é uma massa em camadas com molho cremoso de mozzarella, parmesão, gorgonzola e provolone.");
                    lasanhaQueijo.setPreco(65.00);
                    pratosPedidos.add(lasanhaQueijo);
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

    }

    private void cancelarPrato(){

    }
    private void cancelarPedido(){

    }


}
