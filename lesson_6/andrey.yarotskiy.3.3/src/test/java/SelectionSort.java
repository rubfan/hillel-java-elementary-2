public class SelectionSort {

    public static void main(String[] args) {
        int randArr[] = {162, 186, 296, 486, 146, 127, 236, 106, 365, 476, 482, 268, 97, 107, 397, 192, 472, 213, 130, 389, 186, 80, 161, 374};
        int sortedArr[] = {80, 97, 106, 107, 127, 130, 146, 161, 162, 186, 186, 192, 213, 236, 268, 296, 365, 374, 389, 397, 472, 476, 482, 486};
        int reverseArr[] = {486, 482, 476, 472, 397, 389, 374, 365, 296, 268, 236, 213, 192, 186, 186, 162, 161, 146, 130, 127, 107, 106, 97, 80};
        int thriceLongArr[] = {162, 186, 296, 486, 146, 127, 236, 106, 365, 476, 482, 268, 97, 107, 397, 192, 472, 213, 130, 389, 186, 80, 161, 374, 319, 372, 474, 94, 189, 305, 448, 203, 208, 401, 56, 445, 80, 163, 72, 58, 202, 3, 321, 453, 341, 76, 133, 296, 317, 455, 81, 463, 441, 120, 496, 203, 367, 86, 318, 382, 430, 274, 217, 149, 40, 214, 488, 493, 312, 262, 60, 6};

        int operationCount = 0;

        long param1[] = selectionSort("random", randArr);
        long param2[] = selectionSort("sorted", sortedArr);
        long param3[] = selectionSort("reverse", reverseArr);
        long param4[] = selectionSort("thriceLong", thriceLongArr);

        System.out.println("~~~~~~~~~~~~~~~~~~~Conclusion~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sorting already sorted array faster then random on " + (param1[0]-param2[0]) + " nanoseconds");
        System.out.println("Sorting random array is faster then thrice longer array in " + ((double)param4[0]/(double)param1[0]) + " times");
        System.out.println("Sorting thrice longer array needs in " + ((double)param4[1]/(double) param1[1]) + " times more operations");
    }

    public static long[] selectionSort (String name, int arr[]) {
        int swaps = 0;
        int compares = 0;

        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]) minPos = j;
                compares++;
            }
            if(i != minPos){
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
                swaps++;
            }
        }
        long finish = System.nanoTime();
        System.out.print("Sorted \"" + name + "\" array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        long duration = finish - start;
        long operations = compares + swaps;
        System.out.printf("\nCompares: %d; Swaps: %d\nTotal operaions: %d\n",compares,swaps,operations);
        System.out.println("Duration: " + duration + " nanoseconds\n");
        long params[] = {duration, operations};
        return params;
    }
}