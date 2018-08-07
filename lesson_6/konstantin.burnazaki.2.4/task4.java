public class task4 {
    public static void main(String[] args) {
        int a[] = {1, 5, 7, 9, 12};
        int sum = 17;
        ifHaveSum(a, sum);
    }

    static private void ifHaveSum(int arr[], int sum) {
        for (int i = 0, searchFor = sum - arr[i]; i < arr.length - 1; i++, searchFor = sum - arr[i])
            if (binarySearch(arr, i, arr.length - 1, searchFor) != null) {
                Integer numberToAdd = binarySearch(arr, i, arr.length - 1, searchFor);
                System.out.println("Success: " + arr[i] + " + " + numberToAdd + " = " + sum);
                return;
            }
        System.out.println("Fail: there are no any numbers in the array that produce sum of " + sum);


    }

    static private java.lang.Integer binarySearch(int[] arr, int l, int r, int searchFor) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == searchFor)
                return arr[mid];
            if (arr[mid] < searchFor)
                return binarySearch(arr, mid + 1, r, searchFor);
            else if (arr[mid] > searchFor)
                return binarySearch(arr, l, mid - 1, searchFor);
        }
        return null;
    }

}


