class Insertion {

    static void printArray(int arr[]) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 6, 9};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;                
            }
            arr[j + 1] = temp;    
        }
        
        printArray(arr);
    }
}
