import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        Random ran = new Random();
        ran.setSeed(System.currentTimeMillis());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        arr = MyArray.removeTheElement(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}

class MyArray {
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
