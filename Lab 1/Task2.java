public class Task2 {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)// if j=0 so output will be dissending.
            {
                int temp=0;
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
            // System.out.println(arr[i]+" ");
            System.out.println("Sorted array in descending order:");
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i] + " ");
            }

    }
    
}
