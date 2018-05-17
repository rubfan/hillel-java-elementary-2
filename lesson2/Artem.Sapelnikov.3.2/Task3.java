/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

/**
 *Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
 * @author Sapelnikov
 */
public class Task3 {
    public static void main (String args[]){
        int a=1,b=1,c=3; //Даны нам 3 числа;
        int Amin;
        Amin=Math.min(Math.min(a,c),Math.min(a,b));
        if (Amin==a&Amin==b&Amin==c){
            System.out.println("Минимальные значения a="+a+", b="+b+" и с="+c);
        }
        else if (Amin==a&Amin==b){
            System.out.println("Минимальные значения a="+a+", b="+b);
        }
        else if(Amin==a&Amin==c){
            System.out.println("Минимальные значения a ="+a+"и с="+c);
        }
        else if (Amin==b&Amin==c){
            System.out.println("Минимальные значения b ="+b+"и с="+c);
        }
            else
        System.out.println("Минимальное значение "+Amin);
    }   
    
}