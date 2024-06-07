package map.Ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {

    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void exibirLivros(){
        System.out.println(livroMap);
    }

    public void removerLivroPorTitulo(String titulo){
        Map<String, Livro> livrosTreeMap = new TreeMap<>(livroMap);

        for (Map.Entry<String, Livro> entry : livrosTreeMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livroMap.remove(entry.getKey());
            }
        }

    }

    public void exibirLivrosPorPreco(){
        TreeMap<String, Livro> livrosPorPreco = new TreeMap<String, Livro>(new Livro.ComparatorPorPreco());

        System.out.println(livrosPorPreco);
    }

    public static void main(String[] args) {
        LivrariaOnline livrosMap = new LivrariaOnline();

        livrosMap.adicionarLivro("11111", "Livro 1", "Autor 1", 40.0);
        livrosMap.adicionarLivro("22222", "Livro 2", "Autor 2", 30.0);
        livrosMap.adicionarLivro("33333", "Livro 3", "Autor 3", 20.0);
        livrosMap.adicionarLivro("44444", "Livro 4", "Autor 4", 10.0);


        livrosMap.exibirLivros();
        //livrosMap.removerLivroPorTitulo("Livro 2");
        livrosMap.exibirLivros();
        livrosMap.exibirLivrosPorPreco();
    }
}
