import java.util.Scanner;
public class Dwob{
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = A.nextInt();

        Scanner B = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int b = A.nextInt();
       if ((a%b)==0){
           System.out.println("YAP!");
       }
       else {
           System.out.println("NAH!");
       }
    }

}