public class task1 {
    public static void main(String[] args) {
        task1 ob = new task1();
        int arr[] = {1, 2, 64, 25, 12, 22, 11, 23, 87};
        ob.sort(arr);
        System.out.print("Sorted array: ");
        ob.printArray(arr);


    }


    void sort(int arr[]) {
        final long startTime = System.nanoTime();
        int n = arr.length;
        int swaps = 0;
        int compares = 0;

        // One by one move boundary of unsorted array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            compares++;

            // Swap the found minimum element with the first
            // element
            if (i != min_idx) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        final long duration = System.nanoTime() - startTime;
        System.out.println("Sort operation has taken " + duration + " nanoseconds"
                + "\n" + "Swaps: " + swaps
                + "\n" + "Compares: " + compares);
    }

    // Prints the array
    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}