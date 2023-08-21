public class MovablePoint implements Moveable
{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
    }

    public void moveUp()    {y -= ySpeed;}
    public void moveLeft()  {x -= xSpeed;}
    public void moveRight() {x += xSpeed;}

    public String toString()
    {return "x, y , xSpeed, ySpeed, radius = " + this.x + this.y + this.xSpeed + this.ySpeed;}
}
