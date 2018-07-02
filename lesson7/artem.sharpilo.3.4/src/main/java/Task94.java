import java.util.Scanner;

public class Task94 {
    public static void main(String[] args) {
        System.out.println("Enter number you need to change: ");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        decimalToBinary(i);
    }
    static String decimalToBinary(int i){
        String res="";
        int result;
        if(i == 0) return "0";
        result=i%2;
        decimalToBinary(i - (result + (i/2)));
        res=res.concat(Integer.toString(result));
        System.out.print(res);
        return res;
    }
}
