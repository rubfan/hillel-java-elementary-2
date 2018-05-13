/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

/**
 *Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, 
 * если известно, что за 1 день ее стоимость 40 грн. 
 * Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, 
 * то скидка составит 50 грн.
 * @author Artem  Sapelnikov
 */
public class Task7 {
    public static void main (String args[]){
        int arenda = 0,a=40,b=20,c=50,count;
        count=8;
        boolean A,B,C;
        A=count<=5;
        B=count>5&count<=7;
        C=count>7;
        if (A){
            arenda=count*a;
        }
        if (B){
            arenda=count*a-b;
        }
        if (C){
            arenda=count*a-c;
        }
        System.out.println("Ареда квартиры по прошествии " + count + " дней составляет " + arenda + "грн. 00 копеек");
    }
}
