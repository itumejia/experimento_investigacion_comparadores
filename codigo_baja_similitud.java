public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Already sorted
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        // Split the array into two halves
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);
        
        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted halves
        merge(left, right, array);
    }
    
    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0; // Index for the left array
        int j = 0; // Index for the right array
        int k = 0; // Index for the result array
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        // Copy remaining elements from the left array, if any
        while (i < left.length) {
            result[k++] = left[i++];
        }
        
        // Copy remaining elements from the right array, if any
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 3, 8, 4, 2, 7, 6};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        mergeSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
