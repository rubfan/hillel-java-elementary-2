/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

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