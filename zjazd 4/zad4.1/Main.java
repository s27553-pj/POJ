class Circle
{
     double radius;
     String color;

    public Circle()
    {
        this.radius=1.0;
        this.color="blue";
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' + ", area" + getArea() + '\'' +
                '}';
    }
}
class Cylinder extends Circle
{
    private double height;
    double Volume;
    public Cylinder()
    {
        this.height=4.0;
    }
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double radius, double height)
    {
       super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return height*radius*radius*Math.PI;
    }
}

class TestCircleAndCylinder {
    public static void main(String[] args) {

        Circle pierwsze = new Circle();
        Circle drugie = new Circle(3.0);
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(4.0);
        Cylinder c3 = new Cylinder(5.0, 3.0);
    System.out.println(pierwsze.toString());
    System.out.println(drugie.toString());
    System.out.println("Cylinder{radius="+c1.radius+ ", color="+c1.color+", volume="+c1.getVolume());
    System.out.println("Cylinder{radius="+c2.radius+ ", color="+c2.color+", volume="+c2.getVolume());
    System.out.println("Cylinder{radius="+c3.radius+ ", color="+c3.color+", volume="+c3.getVolume());
    }
}
