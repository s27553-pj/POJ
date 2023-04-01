
class Circle {
    private double radius;
    private double color;

    public Circle(){
        this.radius = 2.0;
        this.color = 47475;
    }
    public Circle(double radius) {
        this.radius =  radius;
        this.color = 7666;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
