package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OredenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OredenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> odenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }


    public static void main(String[] args) {
        OredenacaoPessoas ordPessoa = new OredenacaoPessoas();
        ordPessoa.adicionarPessoa("nome 1", 20, 1.56);
        ordPessoa.adicionarPessoa("nome 2", 30, 1.80);
        ordPessoa.adicionarPessoa("nome 3", 25, 1.70);
        ordPessoa.adicionarPessoa("nome 4", 17, 1.56);

        //System.out.println(ordPessoa.odenarPorIdade());
        System.out.println(ordPessoa.ordenarPorAltura());

    }





}
