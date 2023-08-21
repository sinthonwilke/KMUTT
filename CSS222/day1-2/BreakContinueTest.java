public class BreakContinueTest {
    public static void main(String[] args)
    {
        System.out.println("Break Example");
        int i = 0;
        while (i < 10)
        {
            System.out.println(i);
            i++;
            if(i == 4)
            {
                break;
            }
        }

        System.out.println("Continue Example");
        int j = 0;
        while (j < 10)
        {
            System.out.println(j);
            j++;
            if(j == 4)
            {
                continue;
            }

        }
    }
}