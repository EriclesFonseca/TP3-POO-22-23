import java.util.Random;
import java.util.Scanner;

public class JogoRandom {
    public static void main(String[] args) {
        // cria um objeto Random
        Random random = new Random();

        // cria um objeto Scanner
        Scanner input = new Scanner(System.in);

        // gera um número aleatório entre 0 e 9
        int numeroAleatorio = random.nextInt(10);

        // pede para o usuário adivinhar o número
        System.out.println("Adivinhe o número aleatório de 0 a 9:");
        int numeroDoUsuario = input.nextInt();

        // mostra o resultado
        if (numeroDoUsuario == numeroAleatorio) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou! O número correto é " + numeroAleatorio);
        }
    }
}