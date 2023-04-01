
class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 2.0;
        this.color = "czerwony";
    }
    public Circle(double radius) {
        this.radius =  radius;
        this.color = "zielony";
    }
    public Circle(double radius, String color){
        this.radius =radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double setRadius(double radius){
        this.radius = radius;
        return radius;
    }
    public String setColor(String color){
        this.color = color;
        return color;
    }

}

class TestCircle {
    public static void main(String[] args) {
        Circle pierwsze = new Circle();
        Circle drugie = new Circle(3.0);
        Circle trzecie = new Circle(1.0,"czarny");
        Circle czwarte = new Circle();
        System.out.println("kolko pierwsze: ");
        System.out.println("promien "+ pierwsze.getRadius());
        System.out.println("pole " + pierwsze.getArea());
        System.out.println("kolko drugie: ");
        System.out.println("promien "+ drugie.getRadius());
        System.out.println("pole " + drugie.getArea());
        System.out.println("kolko trzecie: ");
        System.out.println("promien "+ trzecie.getRadius());
        System.out.println("pole " + trzecie.getArea());
        czwarte.setRadius(5.0);
        czwarte.setColor("zolty");
        System.out.println("kolko czwarte: ");
        System.out.println("promien "+ czwarte.getRadius());
        System.out.println("pole " + czwarte.getArea());

    }
}