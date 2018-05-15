import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter root: ");
        int a=sc.nextInt();
        System.out.println("Sum is: "+rootCalc(a));

    }

    public static int rootCalc(int a){
        int sum=0;
        int ifs=0;
        for (; a>0; a/=10){
            int b=a%10;
            sum+=b;
            if (sum>=10) {
                ifs = sum;
                sum = 0;
                for (; ifs > 0; ifs/=10){
                    sum+=ifs%10;
                }
            }
        }
        return sum;
    }
}
