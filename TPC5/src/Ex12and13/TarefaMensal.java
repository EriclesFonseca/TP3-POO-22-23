package Ex12and13;

import java.time.LocalDate;

public class TarefaMensal extends Tarefa {
    public TarefaMensal(String descricao, LocalDate data) {

        super(descricao, data);
    }

    @Override
    public boolean ocorreEm(int year, int month, int day) {

        return data.getDayOfMonth() == day;
    }
}