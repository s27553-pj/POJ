class Vehicle {
    private int passengers;
    private int fuelcap;
    private double  fuelconsumption;
    private double distance;

    Vehicle(int passengers, int fuelcap, double fuelconsumption, double distance)
    {
        this.passengers =passengers;
        this.fuelcap =fuelcap;
        this.fuelconsumption =fuelconsumption;
        this.distance = distance;
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
    double getDistance()
    {
        return distance;
    }
    void setDistance(double distance)
    {
        this.distance=distance;
    }
    void range() {
        double range = fuelcap / fuelconsumption * 100;
        System.out.println("liczba pasazerow: " + passengers);
        System.out.println("zasieg (km): " + range) ;
    }
    void fuelneeded()
    {
        double fuelneeded = fuelconsumption/100.0*distance;
        fuelneeded*=100;
        fuelneeded=Math.round(fuelneeded);
        fuelneeded/=100;
        System.out.println("potrzebuje " + fuelneeded + "litrow paliwa ");
    }
}

class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(7,60,8.0, 100.0);
        Vehicle sportsCar = new Vehicle(2,50,12.0, 30.0);
        System.out.print("minivan ");
        miniVan.fuelneeded();
        System.out.print("sportowy samochod ");
        sportsCar.fuelneeded();

    }
}