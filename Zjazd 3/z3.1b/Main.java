
class Circle {
    private double radius;
    private double color;

    public Circle(){
        this.radius = 2.0;
        this.color = 1.0;
    }
    public Circle(double radius) {
        this.radius =  radius;
        this.color = 2.0;
    }
    public double getRadius(){
        return radius;
    }
     public double getArea(){
        return radius*radius*Math.PI;
    }

}

class TestCircle {
    public static void main(String[] args) {
        Circle pierwsze = new Circle();
        Circle drugie = new Circle(3.0);
    System.out.println("kolko pierwsze: ");
      System.out.println("promien "+ pierwsze.getRadius());
      System.out.println("pole " + pierwsze.getArea());
      System.out.println("kolko drugie: ");
        System.out.println("promien "+ drugie.getRadius());
        System.out.println("pole " + drugie.getArea());

    }
}