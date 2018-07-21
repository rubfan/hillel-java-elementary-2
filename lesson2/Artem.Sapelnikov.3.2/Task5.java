/**
 *Даны 2 числа, определить делится ли первое число на второе без остатка
 * @author Artem  Sapelnikov
 */
public class Task5 {
    public static void main (String args[]){
        double a,b,c;
        a=11;b=-1;
        if (b==0){
            System.out.println("Задача не решаема, делить на ноль незя!");
        }
        if (b!=0){
            c=a%b;
        System.out.println(c>0?"Не делится без отстатка":"Делится без остатка");
        }
        
    }
}
