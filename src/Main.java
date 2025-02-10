public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(); // chama a classe cliente que executará os métodos
        CriarCliente criar = new CriarCliente(); // chama a classe criar cliente que criará um novo cliente
        criar.criarCliente(cliente);
        cliente.exibeMenu(); // método exibe menu da classe cliente
    }
}