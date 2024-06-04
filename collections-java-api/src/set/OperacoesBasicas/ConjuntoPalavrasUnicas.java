package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

     public void adicionarPalavra(String palavra){
        this.conjuntoPalavrasUnicas.add(palavra);
     }
    public void removerPalavra(String palavra) {
        for(String S: conjuntoPalavrasUnicas){
            if(S.equals(palavra)){
                conjuntoPalavrasUnicas.remove(S);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        for (String S : conjuntoPalavrasUnicas) {
            if (S.equals(palavra)) {
                System.out.println(" Palavra [" + S + "] presente no conjunto");
                break;
            }
        }
    }
    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjPal = new ConjuntoPalavrasUnicas();

        conjPal.adicionarPalavra("Banana");
        conjPal.adicionarPalavra("Batata");
        conjPal.adicionarPalavra("Abacaxi");
        conjPal.adicionarPalavra("banana");

        conjPal.exibirPalavrasUnicas();
        conjPal.removerPalavra("Abacaxi");
        conjPal.exibirPalavrasUnicas();
        conjPal.verificarPalavra("banana");

    }

}
