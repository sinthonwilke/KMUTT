public class LabUnit2_5 {
    public static void main(String[] args)
    {
        //i.
        System.out.println("Addition");

        int[][] a1 = {{4, 7, 9, 8, 3}, {2, 4, 7, 8, 1}, {1, 1, 8, 1, 2}, {0, 0, 1, 0, 4}};
        int[][] b1 = {{1, 2, 8, 4, 3}, {4, 1, 8, 3, 1}, {2, 1, 0, 0, 5}, {1, 2, 1, 1, 7}};
        for (int i = 0; i < a1.length; i++)
        {
            for (int j = 0; j < a1[i].length; j++)
            {
                System.out.printf("%d\t" ,a1[i][j] + b1[i][j], " ");
            }
            System.out.println();
        }
        //ii.
        System.out.println("Multiplication");

        int[][] a2 = {{1, 2, 3}, {4, 5, 6}, {2, 3, 4}};
        int[][] b2 = {{1, 2, 3}, {4, 5, 6}, {2, 3, 4}};
        for (int i = 0; i < a2.length; i++)
        {
            for (int j = 0; j < a2.length; j++)
            {
                System.out.printf("%d\t" ,a2[i][j] * b2[i][j], " ");
            }
            System.out.println();
        }
    }
}