public class MovableCircle implements Moveable
{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp()    {center.y -= center.ySpeed;}
    public void moveLeft()  {center.x -= center.xSpeed;}
    public void moveRight() {center.x -= center.xSpeed;}

    public String toString()
    {return "x, y , xSpeed, ySpeed, radius = " + center.x + center.y + center.xSpeed + center.ySpeed + radius;}
}

