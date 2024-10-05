import java.util.Scanner;

public class Ex2New {
    public static void main(String[] args) 
    {
        int arr[][]=new int[4][5];
        int arr1[]=new int[20];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2D Array Elements");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D ARRAY:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int counter=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr1[counter++]=arr[i][j];
            }
        }
        System.out.println("1D ARRAY ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
        }
    }  
}
