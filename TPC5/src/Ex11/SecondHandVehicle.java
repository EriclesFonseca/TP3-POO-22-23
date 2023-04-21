package Ex11;

public class SecondHandVehicle extends Vehicle{
    private int numberOfOwners;

    public SecondHandVehicle(String regNo, String make, int YearOfManufacture, double value, int numberOfOwners) {
        super(regNo, make, YearOfManufacture, value);
        this.numberOfOwners = numberOfOwners;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }

    public boolean hasMultipleOwners(){
        return numberOfOwners > 1;
    }
}

