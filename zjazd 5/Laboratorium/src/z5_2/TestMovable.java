package z5_2;

interface Movable{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
class MovablePoint implements Movable{
     int x;
     int y;
    public MovablePoint(int x, int y)
    {
       this.x=x;
       this.y=y;
    }
    @Override
    public void moveUp() {
         y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "Point("+x+","+y+")";
    }
}
public class TestMovable {
    public static void main(String[] args) {
        Movable ruch = new MovablePoint(1,2);
    System.out.println(ruch.toString());
    ruch.moveUp();
    System.out.println(ruch.toString());
    ruch.moveLeft();
    System.out.println(ruch.toString());
    ruch.moveDown();
    System.out.println(ruch.toString());
    ruch.moveRight();
    System.out.println(ruch.toString());
    }

}
