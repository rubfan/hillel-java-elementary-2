import java.util.Arrays;

public class Lesson6 {

    public static void main(String[] args) {
        int[] test1 = {1, 2, -13, 4, -5, 6};
        int[] test2 = {-70, 1, 60, 1, 5, 100};
        System.out.println("=====================================");
        System.out.println("объединение массивов " + Arrays.toString(mergeArr(test2, test1)));
        System.out.println("=====================================");
        System.out.print("проверка на сумму ");
        findSum(30, test2, 0, test2.length);
        System.out.println("=====================================");
        selectionSort(test1);
        System.out.println("сортировка выборкой " + Arrays.toString(test1));


    }

    public static int[] mergeArr(int[] firstArray, int[] secondArray) {
        int[] res = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, res, 0, firstArray.length);
        System.arraycopy(secondArray, 0, res, firstArray.length, secondArray.length);
        Arrays.sort(res);
        return res;
    }

    public static void findSum(int sum, int[] arr, int start, int finish) {
        if (start == arr.length) {
            System.out.println("false");
            return;
        }
        int j = finish - 1;
        for (int i = start; i < finish; i++) {
            if (arr[start] + arr[i] == sum || arr[j] + arr[i] == sum) {
                System.out.println("true");
                --j;
                return;
            }
        }
        findSum(sum, arr, start + 1, finish - 1);

    }

    public static void selectionSort(int[] array) {
        int minIndex;
        int minValue;
        for (int i = 0; i < array.length; i++) {
            minValue = array[i];
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            }
            if (array[i] != array[minIndex]) {
                array[minIndex] = array[i];
                array[i] = minValue;
            }
        }
    }


}
