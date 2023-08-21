public class LabUnit2_1 {
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;

        //i.
        x++;

        //ii.
        x = x + y;

        //iii.
        System.out.println(x > y);

        //iv.
        x = x > y? y:x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}