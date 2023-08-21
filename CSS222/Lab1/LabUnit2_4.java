public class LabUnit2_4 {
    public static void main(String[] args)
    {
        int[] arr = {234, 6, 846, 85, 96, 198, 545, 12, 60, 34, 4, 87, 7, 1};
        int temp;
        for (int i = 0; i < arr.length; i++)
        {     
            for (int j = i+1; j < arr.length; j++)
            {     
                if(arr[i] > arr[j])
                {  
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;
                }
            }
        }

        for (int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}