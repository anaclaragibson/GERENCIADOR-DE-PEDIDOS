import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String telefone;
    private Pedido pedido = new Pedido();
    Scanner leitura = new Scanner(System.in);

    public Cliente() {
    }

    public Cliente(String nomeCliente, String telefone) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
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
                    5 - Exibir informações
                    
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
                    if(pedido.getPratos().isEmpty()){
                        System.out.println("Agradecemos pela visita!");
                        break;
                    } else {
                        System.out.println("Validando Pagamento...");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException erro) {
                            erro.printStackTrace();
                        }
                        System.out.println(nomeCliente + ", seu pagamento foi aprovado! Agradecemos pela visita.");
                        break;
                    }
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void realizarPedido() {
        pedido.setComanda(1);
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("""
                1. PIX
                2. DÉBITO
                3. CRÉDITO
                """);
        var pagamento = leitura.nextInt();
        //pedido.setPagamento(pagamento);
        while (pagamento != 1 && pagamento !=2 && pagamento != 3){
            System.out.println("Forma de pagamento inválida. Tente novamente");
            System.out.println("""
                1. PIX
                2. DÉBITO
                3. CRÉDITO
                """);
            pagamento = leitura.nextInt();
        }
        pedido.setStatus(true);
        pedido.adicionarPrato();
        pedido.calcularTotal();
    }

    private void listarPedido() {
        if(pedido.getPratos().isEmpty()){
            System.out.println("Nenhum pedido realizado!");
        } else {
            System.out.println(pedido.getPratos());
        }
    }

     private void cancelarPrato () {
        pedido.cancelarPratoo();

//        System.out.println(pedido.getPratos());
//        System.out.println("Digite o ID do prato que deseja cancelar: ");
//        var idCancelar = leitura.nextInt();
//        int i;
//        for(i = 0; i < pedido.getPratos().size(); i++){
//            idCancelar =
//            if(idCancelar == pedido.getPratos().){
//                pedido.getPratos().remove(idCancelar);
//            }
//            else{
//                System.out.println("ID NÃO ENCONTRADO!");
//            }
//        }
//
   }

    private void cancelarPedido() {
        if(pedido.getPratos().isEmpty()){
            System.out.println("Nenhum pedido realizado!");
        } else {
            pedido.getPratos().clear();
            System.out.println("Pedido cancelado!");
        }

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


    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", telefone='" + telefone + '\'';

    }


}
