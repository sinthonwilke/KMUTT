public class TestMove
{
    public static void main(String[] args)
    {
        Moveable m1 = new MovablePoint(5, 6, 10, 0);
        System.out.println(m1);
        m1.moveLeft();

        Moveable m2 = new MovableCircle(2, 1, 2, 20, 0);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
