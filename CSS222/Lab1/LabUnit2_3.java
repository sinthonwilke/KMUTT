public class LabUnit2_3 {
    public static void main(String[] args)
    {
        //i.
        int[] a1 = new int[10];
        int[] a2 = {3, 5, 7, 1, 8, 99, 44, -10 };
        int[] a3 = {4, 3, 2, 1};
        System.out.println("a1 length:" + a1.length);
        System.out.println("a2 length:" + a2.length);
        System.out.println("a3 length:" + a3.length);

        System.out.println();

        //ii.
        int[][] a4 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for (int i = 0; i < a4.length; i++)
        {
            for (int j = 0; j < a4[i].length; j++)
            {
                System.out.print(a4[i][j] + " ");
            }
            System.out.println();
        }
    }
}