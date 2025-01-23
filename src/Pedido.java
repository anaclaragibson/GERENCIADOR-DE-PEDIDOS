import java.util.List;

public class Pedido {
    private int comanda;
    private List<Prato> pratos;
    private String formaDePagamento;
    private boolean status;

    public Pedido(int comanda, List<Prato> pratos, String formaDePagamento, boolean status) {
        this.comanda = comanda;
        this.pratos = pratos;
        this.formaDePagamento = formaDePagamento;
        this.status = status;
    }

    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void adicionarPrato(){

    }
    public void definirStatus(){

    }

    public void calcularTotal(){
    }
}
