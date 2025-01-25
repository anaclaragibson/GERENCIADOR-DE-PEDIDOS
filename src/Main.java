public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        CriarCliente criar = new CriarCliente();
        criar.criarCliente(cliente);
        cliente.exibeMenu();
    }
}