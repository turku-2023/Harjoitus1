public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 4};
        
        System.out.println("Original array:");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.println("Array after sorting in ascending order:");
        printArray(array);
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop,
            // then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
