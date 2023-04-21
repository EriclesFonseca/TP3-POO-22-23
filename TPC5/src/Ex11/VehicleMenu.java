package Ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleMenu {
    private ArrayList<Vehicle> veiculos;

    public VehicleMenu() {
        veiculos = new ArrayList<Vehicle>();
    }

    public void adicionarVeiculo(String regNo, String make, int YearOfManufacture, int value) {
        Vehicle novo = new Vehicle(regNo, make, YearOfManufacture, value);
        veiculos.add(novo);
        System.out.println("Veiculo adicionado");
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nao tem veiculos.");
        } else {
            System.out.println("A lista de veiculos:");
            for (Vehicle veiculo : veiculos) {
                System.out.println(veiculo.getRegNo() + " " + veiculo.getMake() + " " + veiculo.getYearOfManufacture() + " " + veiculo.getValue() + " " + veiculo.calculateAge(2023) + " anos");
            }
        }
    }

    public void apagarVeiculo(int posicao) {
        if (posicao >= veiculos.size() || posicao < 0) {
            System.out.println("Posicao invalida");
        } else {
            veiculos.remove(posicao);
            System.out.println("Veiculo apagado.");
        }
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        VehicleMenu menu = new VehicleMenu();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar veiculos");
            System.out.println("3 - Apagar veiculo");
            System.out.println("4 - Terminar");
            System.out.print("Escolha: ");
            int escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("regNo: ");
                    String regNo = leitura.next();
                    System.out.print("make: ");
                    String make = leitura.next();
                    System.out.print("YearOfManufacture: ");
                    int YearOfManufacture = leitura.nextInt();
                    System.out.print("value: ");
                    int value = leitura.nextInt();
                    menu.adicionarVeiculo(regNo, make, YearOfManufacture, value);
                    break;
                case 2:
                    menu.listarVeiculos();
                    break;
                case 3:
                    System.out.print("Posicao do veiculo: ");
                    int posicao = leitura.nextInt();
                    menu.apagarVeiculo(posicao);
                    break;
                case 4:
                    System.out.println("Terminar");
                    leitura.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
        }
    }
}
