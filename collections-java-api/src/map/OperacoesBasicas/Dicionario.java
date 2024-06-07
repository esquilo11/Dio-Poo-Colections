package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if(!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dic = new Dicionario();

        dic.adicionarPalavra("Palavra 1", "Sig 1");
        dic.adicionarPalavra("Palavra 2", "Sig 2");
        dic.adicionarPalavra("Palavra 3", "Sig 3");
        dic.adicionarPalavra("Palavra 4", "Sig 4");
        dic.adicionarPalavra("Palavra 5", "Sig 5");

        dic.exibirPalavras();
        dic.removerPalavra("Palavra 3");
        dic.exibirPalavras();

        System.out.println(dic.pesquisarPorPalavra("Palavra 5"));

    }

}
