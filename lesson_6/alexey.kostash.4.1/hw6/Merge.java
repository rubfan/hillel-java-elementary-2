package hw6;

public class Merge {
	
    public static void merge(int arr1[], int arr2[]){
        int arr3[] = new int[arr1.length + arr2.length];
        int m = 0, n = 0;
        for (int i = 0; i < arr3.length; i++) {
            if(n == arr2.length || m < arr1.length && arr1[m] <= arr2[n]){
                arr3[i] = arr1[m++];
            }else{
                arr3[i] = arr2[n++];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = new int[10];
        int arr2[] = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 100);
            arr2[i] = (int)(Math.random() * 100);
        }
        System.out.println("===== array 1 =====");
        SelectionSort.selectionSort(arr1);
        System.out.println();
        System.out.println("===== array 2 =====");
        SelectionSort.selectionSort(arr2);
        System.out.println();
        System.out.println("===== array 3 =====");
        merge(arr1, arr2);
    }
}
