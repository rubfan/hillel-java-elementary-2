import java.util.ArrayList;
import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print number: ");
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();
        while(n>=10){
            int num = n;
            int sum = 0;
            while(num!=0){
                nums.add(num % 10);
                sum += num % 10;
                num /= 10;
            }
            System.out.print(nums.get(nums.size()-1));
            for (int j = 1; j < nums.size(); j++) {
                System.out.print(" + " + nums.get(nums.size()-1-j));
            }
            System.out.println(" = " + sum);
            nums.clear();
            n = sum;
        }
    }
}
