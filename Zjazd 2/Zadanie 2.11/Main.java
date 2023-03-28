class Vehicle {
         public int passengers;
         public double fuelcap;
         public double  fuelconsumption;
     }

class VehicleProg {
    public static void main(String[] args) {
            Vehicle miniVan = new Vehicle();
            miniVan.passengers = 7;
            miniVan.fuelcap=60.0;
            miniVan.fuelconsumption =8.0;

            Vehicle sportsCar = new Vehicle();
            sportsCar.passengers =2;
            sportsCar.fuelcap =50;
            sportsCar.fuelconsumption =12;
            double zasiegVan=miniVan.fuelcap/miniVan.fuelconsumption*100;
            double zasiegSports = sportsCar.fuelcap/sportsCar.fuelconsumption*100;
    System.out.println("zagieg miniVana:" + zasiegVan);
    System.out.println("zagieg sportowego auta:" +  zasiegSports);
        }
    }
