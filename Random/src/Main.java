import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(100);
        System.out.println("Numero gerado aleatoriamente: " + numero);
    }
}

