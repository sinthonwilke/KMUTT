public class LabUnit2_2 {
    public static void main(String[] args)
    {
        //i.
        System.out.println("===If statements.===");
        int x = 1;
        int y = 0;
        if (x == y)
        {
            System.out.println("x and y are equal");
        }
        if (x > y)
        {
            System.out.println("x is greatest");
        }
        else
        {
            System.out.println("y is greatest");
        }

        //ii.
        System.out.println("===Switch Statements.===");
        char character = 'b';
        switch (character)
        {
            case 'a' :
                System.out.println("char case: a");
                break;
            case 'b' :
                System.out.println("char case: b");
                break;
            case 'c' :
                System.out.println("char case: c");
                break;
        }

        //iii.
        System.out.println("===For loop.===");
        int sum = 0;
        for (int a = 0; a < 10; a++)
        {
            sum++;
        }
        System.out.println("sum: " + sum);

        //iv.
        System.out.println("===While Statements.===");
        int i = 0;
        while (i <= 5)
        {
            System.out.println(i);
            i = i + 1;
        }

        //v.
        System.out.println("===Do statements.===");
        i = 10;
        do
        {
            System.out.println(i);
            i--;
        }
        while (i > 5);
    }
}