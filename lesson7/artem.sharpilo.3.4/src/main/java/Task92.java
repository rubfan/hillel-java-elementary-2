import java.util.Scanner;

public class Task92 {
    public static void main(String[] args) {
        System.out.println("Enter your words: ");
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        String[] a= s.split(" ");
        wordShortener(a);
    }

    static void wordShortener (String[] a){
        int i=a.length;
        char[] n= new  char[3];
        char[] b= new char[4];
        for (int j=0; j<i; j++){
            if(a[j].length()>4 && a[j].length()<12) {
                char c=Character.forDigit(a[j].length()-2, 10);
                n[0]=a[j].charAt(0);
                n[1]= c;
                n[2]=a[j].charAt(a[j].length()-1);
                System.out.println(n);
            }
            if (a[j].length()>=12){
                char[] c=String.valueOf(a[j].length()-2).toCharArray();
                b[0]=a[j].charAt(0);
                b[1]= c[0];
                b[2]=c[1];
                b[3]=a[j].charAt(a[j].length()-1);
                System.out.println(b);
            }
            if (a[j].length()<=4) System.out.println(a[j]);



        }



    }
}
