import java.util.Arrays;
public class Ex1 {
    public static void main(String[] args) {
        int arr[]={1,2,6,7,3,4,8,2};

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<=arr.length;i++)
        {
            if(i%2==1)
            {
                // Arrays.sort(arr);
                System.out.print(i+" ");
            }
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(i%2==0)
            {
                // Arrays.sort(arr);
                System.out.print(i+" ");
            }
        }
        
    }
    
}
