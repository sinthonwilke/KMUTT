public class TestMovable 
{
    public static void main(String[] args)
    {
        Moveable m1 = new MoveablePoint(5, 5);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);    
    }
}
