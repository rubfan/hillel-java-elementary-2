/**
 *Найти минимальное из 3х чисел
 * @author Artem  Sapelnikov
 */
public class Task1 {
    public static void main(String args[]) {
        int a,b,c;
        a=-1;
        b=-2;
        c=-3;
        if (a<b&a<c){
            System.out.println("a наименьшее");
        }
        if (b<a&b<c){
            System.out.println("b наименьшее");
        }
        if (c<a&c<b)
            System.out.println("c наименьшее");
    }
}

