class RecursiveSearch {

    public static int searchRecursive(int[] arr, int target, int index) {
        
        if (index >= arr.length) {
            return 0;
        }
        if (arr[index] == target) {
            return 1; 
        }
        // Recur for the next element
        return searchRecursive(arr, target, index + 1);
    }
}
