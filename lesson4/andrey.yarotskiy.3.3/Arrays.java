public class Arrays {

    public static void main(String[] args) {
        int arr[] = {130,29,88,11,13,155,86,93,147,3,128,165,170,36,76,2,180};

        int n = 5;
        System.out.printf("Sum of first %d elements of array: ",n);
        int sumOfN = 0;
        for (int i = 0; i < n; i++) {
            sumOfN += arr[i];
            if(i == arr.length-1) break;
        }
        System.out.println(sumOfN);

        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = arr[i] < min ? arr[i]:min;
            max = arr[i] > max ? arr[i]:max;
        }
        System.out.printf("\nMinimum of array: %d\nMaximum of array: %d\n\n",min,max);

        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
        }
        System.out.printf("Number of even: " + evenSum + "; Number of odd: " + oddSum);
    }
}
