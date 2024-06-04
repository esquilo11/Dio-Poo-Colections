package set.Ordenacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {

    private Set<Aluno> alunoSet;

    public GerenciadorAluno (){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula){
        for(Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                alunoSet.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new Aluno.ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

        gerenciadorAluno.adicionarAluno("Jamile", 12345, 8.5);
        gerenciadorAluno.adicionarAluno("Ricardo", 12346, 7);
        gerenciadorAluno.adicionarAluno("Robson", 12347, 10);
        gerenciadorAluno.adicionarAluno("Kelly", 12348, 6);
        gerenciadorAluno.adicionarAluno("Andre", 12349, 0);

        System.out.println(gerenciadorAluno.exibirAlunosPorNota());
    }





}
