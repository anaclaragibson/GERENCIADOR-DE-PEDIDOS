import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    Scanner leitura = new Scanner(System.in);
    private int comanda = 0;
    private List<Prato> pratos = new ArrayList<>();
    private boolean status;

    public Pedido(int comanda, List<Prato> pratos, boolean status) {
        this.comanda = comanda;
        this.pratos = pratos;
        this.status = status;
    }

    public Pedido() {

    }

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

    public void adicionarPrato(){
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
                    pratos.add(pratoPedido);
                    break;
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

    public void calcularTotal(){
        double soma = 0;
        int i;
        for(i = 0; i < pratos.size(); i++){
            soma +=  pratos.get(i).getPreco();
        }
        System.out.printf("O VALOR TOTAL DO PEDIDO: R$%.2f\n", soma);
    }

    public void cancelarPratoo() {
        System.out.println(pratos);
        System.out.println("Digite o ID do prato que deseja cancelar: ");
        var idCancelar = leitura.nextInt();
        int i;
        for(i = 0; i < pratos.size(); i++) {
            if (pratos.get(i).getId() == idCancelar) {
                pratos.remove(i);
            }

        }
    }


}




