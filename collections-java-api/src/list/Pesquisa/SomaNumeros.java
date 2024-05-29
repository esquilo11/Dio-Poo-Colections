package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteros;

    public SomaNumeros(){
        this.listaInteros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteros.add(numero);
    }

    public int calcularSoma(){
        Integer somaInteiros = 0;
        for(Integer I : listaInteros){
            somaInteiros = somaInteiros + I;
        }
        return somaInteiros;
    }

    public int encontrarMaiorNumero(){
        Integer maiorNumero = null;
        for(Integer I : listaInteros){
            if (maiorNumero == null){
                maiorNumero = I;
            }
            else{
                if (I > maiorNumero){
                    maiorNumero = I;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        Integer menorNumero = null;
        for(Integer I : listaInteros){
            if (menorNumero == null){
                menorNumero = I;
            }
            else{
                if (I < menorNumero){
                    menorNumero = I;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return listaInteros;
    }

    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();

        lista.adicionarNumero(3);
        lista.adicionarNumero(17);
        lista.adicionarNumero(12);
        lista.adicionarNumero(-15);
        lista.adicionarNumero(8);

        System.out.println(lista.exibirNumeros());;
        System.out.println(lista.calcularSoma());
        System.out.println(lista.encontrarMaiorNumero());
        System.out.println(lista.encontrarMenorNumero());
    }
}
