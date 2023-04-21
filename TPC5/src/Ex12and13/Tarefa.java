package Ex12and13;

import java.time.LocalDate;

public class Tarefa {
    private String descricao;
    public LocalDate data;

    public Tarefa(String descricao, LocalDate data) {
        this.descricao = descricao;
        this.data = data;
    }

    public boolean ocorreEm(int year, int month, int day) {
        LocalDate dataParam = LocalDate.of(year, month, day);
        return data.equals(dataParam);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }
}





