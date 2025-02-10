public class Prato {  // cria a classe Prato

    // Atributos
    private Integer id;  // atributo ID do prato
    private String nomePrato;  // atributo nome do prato
    private String descricao;  // atributo descrição do prato
    private Double preco;  // atributo preço do prato
    private Pedido pedido;  // atributo para o pedido ao qual o prato pertence

    // construtores
    public Prato() {  // construtor vazio que não recebe parâmetros
        this.id = id;
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Get e Set
    public String getNomePrato() {  // método get para o atributo nome prato
        return nomePrato;  // retorna o valor do nome do prato
    }

    public void setNomePrato(String nomePrato) {  // método setter para o atributo nome prato
        this.nomePrato = nomePrato;  // atribui o valor do parâmetro nome prato ao atributo da classe
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    // retorna uma string representando o objeto prato criado e os valores atribuidos a seus atributos
    @Override
    public String toString() {
        return "------PRATO-----\n" +
                "ID: " + id + "\n" +
                "Nome Prato: " + nomePrato + "\n" +
                "Descrição: " + descricao +
                "Preço: R$" + preco + "\n";
    }
}
