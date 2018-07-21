/**
 *Найти среди 3х чисел максимальное и минимальное
 * @author Artem  Sapelnikov
 */
public class Task2 {
    public static void main (String args[]){
        int a=1,b=2,c=3; //Даны нам 3 числа;
        int A,B;
        A=Math.min(Math.min(a,c),b);
        B=Math.max(Math.min(a,c),b);
        System.out.println("Минимальное значение "+A);
        System.out.println("Максимальное значение "+B);
    }
}
