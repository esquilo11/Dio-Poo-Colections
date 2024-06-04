package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        for(Tarefa T : listaTarefas){
            if(T.getDescricao().equalsIgnoreCase(descricao)){
                listaTarefas.remove(T);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        System.out.println(listaTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa T : listaTarefas){
            if (T.isStatus()){
                tarefasConcluidas.add(T);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa T : listaTarefas){
            if (T.isStatus() == false){
                tarefasPendentes.add(T);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa T : listaTarefas){
            if (T.getDescricao() == descricao){
                T.setStatus(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa T : listaTarefas){
            if (T.getDescricao() == descricao){
                T.setStatus(false);
            }
        }
    }

    public void limparListaTarefas(){
        listaTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaDeTarefas = new ListaTarefas();

        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 2");
        listaDeTarefas.adicionarTarefa("Tarefa 3");
        listaDeTarefas.adicionarTarefa("Tarefa 4");
        listaDeTarefas.adicionarTarefa("Tarefa 5");

//        listaDeTarefas.exibirTarefas();
//        listaDeTarefas.removerTarefa("Tarefa 4");
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.contarTarefas();
        listaDeTarefas.marcarTarefaConcluida("Tarefa 2");
        listaDeTarefas.marcarTarefaConcluida("Tarefa 5");
        listaDeTarefas.exibirTarefas();
        System.out.println(listaDeTarefas.obterTarefasConcluidas());
        System.out.println(listaDeTarefas.obterTarefasPendentes());
        listaDeTarefas.contarTarefas();
        listaDeTarefas.limparListaTarefas();
        listaDeTarefas.contarTarefas();
    }




















































}

