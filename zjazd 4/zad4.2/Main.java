
class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, String color, double regularPrice) {
        this.speed=speed;
        this.color=color;
        this.regularPrice=regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
class Sedan extends Car implements Purchase{
    int length;
    public Sedan(int speed, String color, double regularPrice, int length)
    {
        super(speed,color,regularPrice);
        this.length=length;
    }
    @Override
    public double getSalePrice() {
        if(length>20) {
            return super.getSalePrice()*0.95;
        }
        else{
            return super.getSalePrice()*0.9;
        }
    }
    public String getPurchaseInfo() {
        return "SEDAN";
    }
}
class Ford extends Car implements Purchase{
    int year;
    int manufacturerDiscount;
    public Ford(int speed, String color, double regularPrice,int year, int manufacturerDiscount)
    {
        super(speed,color,regularPrice);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }
    @Override
    public double getSalePrice() {
        double x=super.getSalePrice()-manufacturerDiscount;
        return x;
    }
    public String getPurchaseInfo() {
        return "SEDAN";
    }
}
class Truck extends Car implements Purchase{
    int weight;
    public Truck(int speed, String color, double regularPrice,int weight)
    {
        super(speed,color,regularPrice);
        this.weight=weight;
    }
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice()*0.9;
        }
        else {
            return super.getSalePrice();
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK";
    }
}
interface Purchase {
    public String getPurchaseInfo();
}
class AutoShop {
    public static void main(String[] args) {
        Sedan s1 = new Sedan(160,"red",20000,10);
        Ford f1 = new Ford(125,"black",4452.0,2005,10);
        Ford f2 = new Ford(155,"pink",5000.0,1998,5);
        Truck t1 = new Truck(200,"gold", 5000000,5000);
        System.out.println(s1.getPurchaseInfo()+ ": speed: "+ s1.speed + " regularprice: " + s1.regularPrice + " color: " +s1.color + " length: " + s1.length + " saleprice: " + s1.getSalePrice());
        System.out.println(f1.getPurchaseInfo()+ ": speed: "+ f1.speed + " regularprice: " + f1.regularPrice + " color: " +f1.color + " year: " + f1.year + " manufacturerdiscount: " + f1.manufacturerDiscount+ " saleprice: " + f1.getSalePrice());
        System.out.println(f2.getPurchaseInfo()+ ": speed: "+ f2.speed + " regularprice: " + f2.regularPrice + " color: " +f2.color + " year: " + f2.year +" manufacturerdiscount: " + f2.manufacturerDiscount+ " saleprice: " + f2.getSalePrice());
        System.out.println(t1.getPurchaseInfo()+ ": speed: "+ t1.speed + " regularprice: " + t1.regularPrice + " color: " +t1.color + " weight: " + t1.weight + " saleprice: " + t1.getSalePrice());
    }
}