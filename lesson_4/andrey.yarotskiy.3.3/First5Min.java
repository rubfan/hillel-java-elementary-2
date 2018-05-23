public class First5Min {

    public static void main(String[] args) {
        int arr[] = {130,29,88,11,13,155,86,93,147,3,128,165,170,36,76,2,180};
		
		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		
        int n = 5;
        int sorted[] = bubbleSort(arr);
		
        System.out.printf("\nFirst %d minimum elements of array: ",n);
        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
            if(i == sorted.length-1) break;
        }
    }

    public static int[] bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        return arr;
    }
}
