/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

/**
 *Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
 * @author Artem Sapelnikov
 */
public class Task6 {
   
    public static void main(String args[]){
    int a=12,b=2,c=10;
    int A,B;//assistants;
   // if (b>=10){
    A=Math.min((Math.abs(c-b)),Math.abs(b-c));
  //  }
    B=Math.min((Math.abs(c-a)),Math.abs(a-c));
    boolean C=A<B;
    boolean D=A==B;
    System.out.println(D?"Оба числа равноудалены":C?"Ближайшее число b":"Ближайшее число a");
    }
   
        
}
                        