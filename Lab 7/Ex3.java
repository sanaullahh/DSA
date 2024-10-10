public class Ex3 {
    
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) 
            leftArray[i] = array[left + i];
        for (int i = 0; i < n2; i++) 
            rightArray[i] = array[mid + 1 + i];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void Ex3(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            Ex3(array, left, mid);
            Ex3(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        for (int num : array)
            System.out.print(num + " ");

        Ex3(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : array)
            System.out.print(num + " ");
    }
}
