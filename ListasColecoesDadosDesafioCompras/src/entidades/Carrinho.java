package entidades;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtosComprados;

    public Carrinho() {
        this.produtosComprados = new ArrayList<>();
    }

    public void adicionaProduto (Produto meuProduto){
        this.produtosComprados.add(meuProduto);
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    @Override
    public String toString() {
        return "Minhas compras:\n" +
                produtosComprados;
    }
}
