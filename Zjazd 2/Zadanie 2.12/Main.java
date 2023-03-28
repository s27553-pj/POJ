 class Vehicle {
    private int passengers;
    private int fuelcap;
    private double  fuelconsumption;

    Vehicle(int passengers, int fuelcap, double fuelconsumption)
    {
        this.passengers =passengers;
        this.fuelcap =fuelcap;
        this.fuelconsumption =fuelconsumption;
    }
     int getPassengers() {
        return passengers;
    }
     void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }
     int getFuelcap() {
        return fuelcap;
    }
     void setFuelcap(int fuelcap)
    {
        this.fuelcap = fuelcap;
    }
     double getFuelconsumption() {
        return fuelconsumption;
    }
     void setFuelconsumption(double fuelconsumption)
    {
        this.fuelconsumption = fuelconsumption;
    }
     void range() {
        double range = fuelcap / fuelconsumption * 100;
        range*=100;
        range=Math.round(range);
        range/=100;
        System.out.println("liczba pasazerow: " + passengers);
        System.out.println("zasieg (km): " + range) ;
    }
}

class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(7,60,8.0);
        Vehicle sportsCar = new Vehicle(2,50,12.0);
        System.out.println("minivan");
        miniVan.range();
        System.out.println("sportowy samochod");
        sportsCar.range();

    }
}