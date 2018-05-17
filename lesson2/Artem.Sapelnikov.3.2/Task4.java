/**
 *Написать программу, которая проверит, является ли число четным или нечетным
 * @author Artem  Sapelnikov
 */
public class Task4 {
    public static void main (String args[]){
        int a=2,b=2,c;
        c=a/b;
        boolean A,B;
        A=b==a;
        B=a==b*c;
      //  System.out.println(" a="+a+", b="  + b+ ", c="+c);
        System.out.println(A?"Чётное":B?"Чётное":"Нечётное");
    }
}