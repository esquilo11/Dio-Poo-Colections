package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<OrdenacaoNumeros>{
    private List<Integer> listaInteros;

    @Override
    public String toString() {
        return listaInteros.toString();
    }

    @Override
    public int compareTo(OrdenacaoNumeros o) {
        return 0;
    }

    public OrdenacaoNumeros() {
        this.listaInteros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaInteros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(listaInteros);
        Collections.sort(listaDescendente);
        Collections.reverse(listaDescendente);
        return listaDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumero(8);
        listaNumeros.adicionarNumero(20);
        listaNumeros.adicionarNumero(6);
        listaNumeros.adicionarNumero(32);
        listaNumeros.adicionarNumero(19);

        System.out.println(listaNumeros);
        System.out.println(listaNumeros.ordenarAscendente());
        System.out.println(listaNumeros.ordenarDescendente());
    }


}
