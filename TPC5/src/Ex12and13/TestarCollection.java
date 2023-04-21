package Ex12and13;
import java.time.LocalDate;
import java.util.List;

public class TestarCollection {
    public static void main(String[] args) {
        Collection collection = new Collection();

        // Criar tarefas
        collection.criarTarefaUnica("Fazer TPC de POO", LocalDate.now());
        collection.criarTarefaDiaria("Jogar com Amigos", LocalDate.now());
        collection.criarTarefaMensal("Pagar propina da escola", LocalDate.of(2023, 4, 1));
        collection.criarTarefaUnica("Enviar trabalho pratico", LocalDate.of(2023, 6, 3));
        collection.criarTarefaDiaria("Ler o livro Java in Two Semesters", LocalDate.of(2023, 4, 20));

        // Listar tarefas de hoje
        List<Tarefa> tarefasHoje = collection.listarTarefas(LocalDate.now());
        System.out.println("Tarefas de hoje:");
        for (Tarefa tarefa : tarefasHoje) {
            System.out.println("- " + tarefa.getDescricao());
        }

        // Mudar uma tarefa
        collection.modificarTarefa(2, "Fazer teste de AN", LocalDate.of(2023, 4, 10));

        // Listar tarefas
        List<Tarefa> todasTarefas = collection.listarTarefas(LocalDate.MIN);
        System.out.println("Todas as tarefas:");
        for (Tarefa tarefa : todasTarefas) {
            System.out.println("- " + tarefa.getDescricao() + " (" + tarefa.getClass().getSimpleName() + ")");
        }

        // Remover tarefa
        collection.apagarTarefa(0);

        // Listar tarefas de um detarminado dia
        LocalDate dataEspecifica = LocalDate.of(2023, 6, 3);
        List<Tarefa> tarefasDataEspecifica = collection.listarTarefas(dataEspecifica);
        System.out.println("Tarefas de " + dataEspecifica + ":");
        for (Tarefa tarefa : tarefasDataEspecifica) {
            System.out.println("- " + tarefa.getDescricao());
        }
    }
}
