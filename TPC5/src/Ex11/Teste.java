package Ex11;

public class Teste {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("ST-87-CP","OPEL",2008,950000);
        System.out.println("RegNo: "+ vehicle.getRegNo());
        System.out.println("Make: "+ vehicle.getMake());
        System.out.println("Ano fabrico: "+ vehicle.getYearOfManufacture());
        System.out.println("Value: "+ vehicle.getValue());
        System.out.println("Idade:" + vehicle.calculateAge(2023));

        SecondHandVehicle secondHandVehicle = new SecondHandVehicle("ST-87-CP","OPEL",2008,950000,2);
        System.out.println("RegNo: "+ secondHandVehicle.getRegNo());
        System.out.println("Make: "+ secondHandVehicle.getMake());
        System.out.println("Ano fabrico: "+ secondHandVehicle.getYearOfManufacture());
        System.out.println("Value: "+ secondHandVehicle.getValue());
        System.out.println("Numero proprietarios: "+ secondHandVehicle.getNumberOfOwners());
        System.out.println("Proprietarios multiplos:"+ secondHandVehicle.hasMultipleOwners());
    }
}
