import java.util.Scanner;

public class Cliente { // cria a classe cliente
    private String nomeCliente; // atributo nome cliente
    private String telefone; // atributo telefone cliente
    private Pedido pedido = new Pedido(); // atributo em que o pedido relaciona o cliente
    Scanner leitura = new Scanner(System.in); // nome para o scanner

    // Contrutores
    public Cliente() {
        // corpo do construtor vazio
    }

    public Cliente(String nomeCliente, String telefone) {
        // construtor que recebe valores para nome e telefone
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
    }

    // Métodos
    public void exibeMenu() { // Método exibição de menu
        var opcao = -1; // Como os valores atribuidos a ações são de 0 a 5 para não ser automaticamente chamada uma ação atribui o valor -1 a variável
        while (opcao != 0) { // Enquanto não for selecionado 0 (sair) continuará executando
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

            System.out.println(menu); // exibe o menu
            opcao = leitura.nextInt(); // vai receber a próxima ação do cliente
            leitura.nextLine(); // lê o valor

            switch (opcao) { // realiza o bloco de código de acordo com o valor selecionado
                case 1:
                    realizarPedido(); // executa a função relaizar pedido
                    break; // para sair do switch
                case 2:
                    listarPedido(); // executa a função listar pedido
                    break;
                case 3:
                    cancelarPrato(); // executa a função cancelar prato
                    break;
                case 4:
                    cancelarPedido(); // executa a função cancelar pedido
                    break;
                case 0:
                    if(pedido.getPratos().isEmpty()){ // se o usuário não fizer pedidos ele saí sem nenhuma ação extra
                        System.out.println("Agradecemos pela visita!");
                        break;
                    } else { // se tiver pedidos na lista do usuário é simulado (só um tempo de espera) o pagamento do pedido
                        System.out.println("Validando Pagamento...");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException erro) {
                            erro.printStackTrace();
                        }
                        System.out.println(nomeCliente + ", seu pagamento foi aprovado! Agradecemos pela visita.");
                        break; //  sai do switch e finaliza
                    }
                default:
                    System.out.println("Opção inválida"); // caso o usuário insira uma opçaõ iválida
            }
        }
    }

    private void realizarPedido() { // método para realizar o pedido
        pedido.setComanda(1); // atribui o valor 1 a comanda (classe pedido)
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("""
                1. PIX
                2. DÉBITO
                3. CRÉDITO
                """);
        var pagamento = leitura.nextInt(); // lê a escolha da forma de pagamento
        //pedido.setPagamento(pagamento);

        // Enquanto a forma de pagamento selecionada não for válida solicita novamente
        while (pagamento != 1 && pagamento !=2 && pagamento != 3){
            System.out.println("Forma de pagamento inválida. Tente novamente");
            System.out.println("""
                1. PIX
                2. DÉBITO
                3. CRÉDITO
                """);
            pagamento = leitura.nextInt(); // lê novamente a escolha da forma de pagamento
        }

        pedido.setStatus(true); // define o status do pedido como realizado - true
        pedido.adicionarPrato(); // adiciona um prato ao pedido
        pedido.calcularTotal(); // calcula o total do pedido
    }

    private void listarPedido() { // método para listar os pratos no pedido
        if(pedido.getPratos().isEmpty()){ // caso não tenha pratos na lista de pedidos
            System.out.println("Nenhum pedido realizado!");
        } else {
            System.out.println(pedido.getPratos());
        }
    }

    private void cancelarPrato () { // chama a função cancelar prato (está na classe pedido)
        pedido.cancelarPratoo();
    }

    private void cancelarPedido() { // método para cancelar o pedido
        if(pedido.getPratos().isEmpty()){ // caso a lista de pedidos esteja vazia
            System.out.println("Nenhum pedido realizado!");
        } else {
            pedido.getPratos().clear(); // apaga da lista
            System.out.println("Pedido cancelado!");
        }

    }

    // Get e Set
    public String getNomeCliente() { // método get para o nome cliente
        return nomeCliente; // retorna o valor armazenado no atributo nome cliente
    }

    public void setNomeCliente(String nomeCliente) { // método setter para o nome cliente
        this.nomeCliente = nomeCliente; // atribui o valor passado ao atributo nome cliente
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // retorna uma string representando o objeto cliente como os valores atribuidos a seus atributos
    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", telefone='" + telefone + '\'';

    }
}