public class Prato {
    private Integer id;
    private String nomePrato;
    private String descricao;
    private Double preco;

    public Prato() {
        this.id = id;
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
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

    @Override
    public String toString() {
        return "------PRATO-----\n" +
                "ID: " + id + "\n" +
                "Nome Prato: " + nomePrato + "\n" +
                "Descrição: " + descricao +
                "Preço: R$" + preco + "\n";
        //ajustar para que fique bonito
    }
}
