package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual) ){
                System.out.println("O proximo evento: " + entry.getValue() + " Ocorrerá na data: " + entry.getKey());
                break;
            }
        }



    }




    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 06, 05), "Evento 1", "Descricao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 06), "Evento 2", "Descricao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 07), "Evento 3", "Descricao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 05, 04), "Evento 4", "Descricao 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
