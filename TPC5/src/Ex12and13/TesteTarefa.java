package Ex12and13;

import java.time.LocalDate;

public class TesteTarefa {
    public static void main(String[] args) {

        // Criar tarefas
        TarefaUnica tarefaUnica = new TarefaUnica("Fazer compras", LocalDate.of(2023, 4, 22));
        TarefaDiaria tarefaDiaria = new TarefaDiaria("Estudar Programacao", LocalDate.of(2023, 4, 20));
        TarefaMensal tarefaMensal = new TarefaMensal("Pagar fatura do cartão de crédito", LocalDate.of(2023, 4, 10));

       // Verificando se as tarefas ocorrem em uma determinada data
        System.out.println(tarefaUnica.ocorreEm(2023, 4, 22));
        System.out.println(tarefaDiaria.ocorreEm(2023, 4, 20));
        System.out.println(tarefaMensal.ocorreEm(2023, 4, 14));

    }
}
