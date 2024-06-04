package set.Ordenacao;

import set.Ordenacao.Produto.ComparatorPorPreco;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, int quantidade, double preco){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 5", 1, 5, 15);
        cadastroProdutos.adicionarProduto("Produto 0", 2, 10, 10);
        cadastroProdutos.adicionarProduto("Produto 3", 1, 2, 2);
        cadastroProdutos.adicionarProduto("Produto 8", 3, 2, 17);
        cadastroProdutos.adicionarProduto("Produto 7", 4, 2, 0);
        cadastroProdutos.adicionarProduto("Produto 6", 5, 2, 11);

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
