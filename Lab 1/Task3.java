import java.util.Random;
import java.util.Arrays;
public class Task3
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Random rand=new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rand.nextInt(100);
        }
        int []newArr=Arrays.copyOf(arr, arr.length);
        // System.out.println(Arrays.equals(arr,newArr));

        Arrays.sort(arr);
        // System.out.println(Arrays.equals(arr, newArr));
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(arr));
    }
}