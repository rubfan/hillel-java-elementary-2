package hw6;

/**
 * The <code>SelectionSort</code> class contains a selectionSort method
 * for quickly sorting an array.
 * @author  Alexey Kostash
 */

public class SelectionSort {

    /**
    * @param arr is an array to be sorted.
    */
    public static void selectionSort(int[] arr) {
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            index = i;
            for (int j = arr.length - 1; j > i; j--) {
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=====after sort =====");
        selectionSort(arr);
    }
    
}
