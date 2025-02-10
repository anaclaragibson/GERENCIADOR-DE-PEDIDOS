import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido { // cria a classe pedido
    Scanner leitura = new Scanner(System.in); // nome para o scanner
    private int comanda = 0; // atribui o valor 0 a comanda
    private List<Prato> pratos = new ArrayList<>(); // cria a lista de pratos
    private boolean status; // status do pedido

    // Construtores
    public Pedido(int comanda, List<Prato> pratos, boolean status) {
        this.comanda = comanda;
        this.pratos = pratos;
        this.status = status;
    }

    public Pedido() {
        // corpo do construtor vazio
    }

    // Get e Set
    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda + 1;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos
    public void adicionarPrato(){
        var opcao = -1; // Como os valores atribuidos a ações são de 0 a 4 para não ser automaticamente chamada uma ação atribui o valor -1 a variável
        while (opcao != 0){ // Enquanto não for selecionado 0 (sair) continuará executando
            var menuPratos = """
                ------MENU DE PRATOS------
                1. Lasanha Bolonhesa
                2. Macarrão alho e óleo
                3. Risoto de camarão
                4. Lasanha 4 queijos
                
                0. Finalizar pedido
                ESCOLHA O PRATO:
                """;
            System.out.println(menuPratos); // exibe o menu de pratos
            opcao = leitura.nextInt(); // vai receber a próxima ação do cliente
            leitura.nextLine(); // lê o valor

            switch (opcao) { // realiza o bloco de código de acordo com o valor selecionado
                case 1:
                    Prato pratoPedido = new Prato(); // cria um novo objeto prato
                    pratoPedido.setId(1); // set do ID relacionado ao prato selecionado no menu
                    pratoPedido.setNomePrato("Lasanha Bolonhesa"); // nome do prato selecionado no menu
                    pratoPedido.setDescricao("Lasanha bolonhesa é uma massa em camadas com molho de carne, queijo e bechamel.\n"); // descricao do prato selecionado no menu
                    pratoPedido.setPreco(55.99); // valor do prato selecionado no menu
                    pratos.add(pratoPedido); // adiciona o pedido a lista de pratos
                    break; // break para sair do switch
                case 2:
                    Prato pratoPedido2 = new Prato();
                    pratoPedido2.setId(2);
                    pratoPedido2.setNomePrato("Macarrão Alho e Oléo");
                    pratoPedido2.setDescricao("Macarrão alho e óleo é um prato simples e delicioso, preparado com macarrão salteado em azeite, alho dourado e uma pitada de sal.\n");
                    pratoPedido2.setPreco(30.00);
                    pratos.add(pratoPedido2);
                    break;
                case 3:
                    Prato pratoPedido3 = new Prato();
                    pratoPedido3.setId(3);
                    pratoPedido3.setNomePrato("Risoto de camarão");
                    pratoPedido3.setDescricao("Risoto de camarão é um prato cremoso com arroz arbóreo, camarões, caldo de legumes, vinho branco e queijo parmesão.\n");
                    pratoPedido3.setPreco(55.99);
                    pratos.add(pratoPedido3);
                    break;
                case 4:
                    Prato pratoPedido4 = new Prato();
                    pratoPedido4.setId(4);
                    pratoPedido4.setNomePrato("Lasanha 4 queijos");
                    pratoPedido4.setDescricao("Lasanha 4 queijos é uma massa em camadas com molho cremoso de mozzarella, parmesão, gorgonzola e provolone.\n");
                    pratoPedido4.setPreco(65.00);
                    pratos.add(pratoPedido4);
                    break;
                case 0:
                    System.out.println("Pedido finalizado...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    public void definirStatus(){

    }

    public void calcularTotal(){ // método para realizar o calculo do valor total do pedido
        double soma = 0; // iniciada em 0
        int i;
        for(i = 0; i < pratos.size(); i++){ // passa pela lista de pratos e soma os valores adicionando a variável soma
            soma +=  pratos.get(i).getPreco();
        }
        System.out.printf("O VALOR TOTAL DO PEDIDO: R$%.2f\n", soma); // exibe o valor total do pedido
    }

    public void cancelarPratoo() { // método cancelar prato
        if (pratos.isEmpty()){ // caso a lista de pratos esteja vazia
            System.out.println("Pedido vazio");
            return;
        }
        System.out.println(pratos); // exibe a lista de pratos para o cliente selecionar qual deseja remover
        System.out.println("Digite o ID do prato que deseja cancelar: ");
        var idCancelar = leitura.nextInt(); // lê o id do prato inserido pelo cliente
        int i;
        for(i = 0; i < pratos.size(); i++) { // passa pela lista verificando os IDs e remove o que for igual ao selecionado pelo usuário
            if (pratos.get(i).getId() == idCancelar) {
                pratos.remove(i);
            }
        }
    }
}