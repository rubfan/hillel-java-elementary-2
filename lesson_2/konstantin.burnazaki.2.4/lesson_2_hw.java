import java.util.Arrays;

public class lesson_2_hw {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 2;
        findMin(a, b, c);
        findMinMax(a, b, c);
        findMinDuplicate(a, b, c);
        System.out.println(isEven(9));
        System.out.println(isDivisible(9, 5));
        System.out.println(closerToTen(9, 13));
        System.out.println(costOfRent(8));

    }


    public static void findMin(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        System.out.println("Min value: " + nums[0]);
    }

    public static void findMinMax(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        System.out.println("Min value: " + nums[0]);
        System.out.println("Max value: " + nums[nums.length - 1]);
//        int interim_max = Math.max(a, b);
//        int interim_min = Math.min(a, b);
//        System.out.println(Math.max(interim_max, c));
//        System.out.println(Math.min(interim_min, c));
    }

    public static void findMinDuplicate(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        System.out.println("Min value: " + nums[0]);
        for (int i = 1; nums[0] == nums[i]; i++)
            System.out.println("Duplicate min value: " + nums[i]);

        }

    public static boolean isEven(int a){
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
        }

    public static boolean isDivisible(int a, int b){
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int closerToTen(int a, int b){
        return (Math.abs(10 - b) > Math.abs(10 - a)) ? a : b;
    }

    public static int costOfRent(int duration){
        int costOfOneDay = 40;
        int fiveDaysDiscount = duration > 5 ? 20 : 0;
        int sevenDaysDiscount = duration > 7 ? 50 : 0;
        return costOfOneDay * duration - (Math.max(fiveDaysDiscount, sevenDaysDiscount));
    }
    }


