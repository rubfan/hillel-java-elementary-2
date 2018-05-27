package hw6;

import java.util.Random;

public class SumOfTwoNumbers {

    public static void sumOfTwo(int arr[], int sum){
        int min = 0, max = arr.length - 1, maxLimit = sum - arr[min], index = max;
        //Search index of max limit
        while (min < max){
            index = (min + max) / 2;
            if(arr[index] < maxLimit){
                min = index + 1;
            }else{
                max = index;
            }
        }
        System.out.println("maxLim = " + maxLimit + ", index = " + index + ", value = " + arr[index]);
        System.out.println();
        System.out.println("===== sum : =====");
        for (int i = 0; i < max - 1; i++) {
            for (int j = max; (j > i) && (arr[i] + arr[j] >= sum); j--) {
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int sum = random.nextInt() / 100000;
        int arr1[] = new int[1000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt() / 100000;
        }
        System.out.println("===== array =====");
        SelectionSort.selectionSort(arr1);
        System.out.println();
        System.out.println("===== Sum =====");
        System.out.println(sum);
        System.out.println();
        sumOfTwo(arr1, sum);
    }
}
