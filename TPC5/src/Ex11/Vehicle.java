package Ex11;

public class Vehicle {
    private final int YearOfManufacture;
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String regNo, String make, int YearOfManufacture, double value){
        this.regNo = regNo;
        this.make = make;
        this.YearOfManufacture = YearOfManufacture;
        this.value = value;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int calculateAge(int year) {
        int age = this.yearOfManufacture - year;
        return age;
    }
}


