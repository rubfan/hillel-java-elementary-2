class task2 {
    // Merges two sorted arrays.
    void merge(int a[], int b[]) {
        // Find sizes of two arrays to be merged
        int n1 = a.length;
        int n2 = b.length;
        int c[] = new int[n1 + n2];

        // Initial indexes of first and second arrays
        int i = 0, j = 0;

        // Initial index of merged array array
        int k = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements a[] */
        while (i < n1) {
            c[k] = a[i];
            i++;
            k++;
        }

        /* Copy remaining elements of b[] */
        while (j < n2) {
            c[k] = b[j];
            j++;
            k++;
        }
        System.out.println("\nSorted array");
        printArray(c);
    }


    /* A utility function to print an array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int a[] = {1, 3, 5, 6, 29};
        int b[] = {2, 4, 8, 9, 12};

        System.out.println("Given Arrays");
        printArray(a);
        printArray(b);

        task2 ob = new task2();
        ob.merge(a, b);

    }
}