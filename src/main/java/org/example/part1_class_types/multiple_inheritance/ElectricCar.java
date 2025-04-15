package org.example.part1_class_types.multiple_inheritance;

/*
ElectricCar se va comporta cu un dublu rol:
* -> va fi atat clasa de implementare pt cele 2 intrfete: ElectricSystem, NavigationSystem
* -> va fi o sub clasa a clasei parinte GEnericVehicle
 */

public class ElectricCar extends GenericVehicle implements ElectricSystem, NavigationSystem {

    private int batteryLevel;
    private double range;

    //Eroare: There is no parameterless constructor available
    //Rezolvare: Implementez un constructor care se conecteaaza la constructorul clasei parinte si inserez super

    public ElectricCar(String brand,
                       String model,
                       int yearOfFabrication,
                       int batteryLevel,
                       double range
    ) {
        super(brand, model, yearOfFabrication);
        this.batteryLevel = batteryLevel;
        this.range = range;
    }

    @Override
    public void chargeBaterry() {
        this.batteryLevel = 100;
        System.out.println("Baterry charget to " + this.batteryLevel);
    }

    //
    @Override
    void drive() {
        System.out.println(this.brand + " " + this.model + " is driving silently...");

    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Navigate to " + destination + " using built-in GPS...");
    }
    public void displayStatus() {
        System.out.println("Car " + this.brand + " " + this.model + " ( " + yearOfFabrication + ")" );
        System.out.println("Battery level:" + this.batteryLevel + "%");
        System.out.println("Estimated range: " + this.range + " Low ");
    }
}
