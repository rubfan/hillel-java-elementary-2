import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = A.nextInt();

        if ( (a % 2)== 0 ){
            System.out.println("Entered number is even");
        }
        else {
            System.out.println("Entered number is odd");
        }
    }
}