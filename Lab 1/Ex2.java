import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        int arr1[] = new int[20];
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter 2D Array Elements:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sn.nextInt();
            }
        }

        System.out.println("2D ARRAY:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                boolean isDuplicate = false;
                for (int k = 0; k < counter; k++) {
                    if (arr1[k] == arr[i][j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    arr1[counter] = arr[i][j];
                    counter++;
                }
            }
        }
        System.out.println("1D ARRAY with No Duplicates:");
        for (int i = 0; i < counter; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
