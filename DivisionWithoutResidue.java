package Lesson_2;

public class DivisionWithoutResidue {
  public static void main(String[] args){
    System.out.println("--------Lesson_2--------");
    System.out.println("5. Даны 2 числа, определить делится ли первое число на второе без остатка");
    System.out.println("\t Числа: 20, 10");
    int a = 20;
    int b = 10;
    if (a % b == 0){
      System.out.println(" Делится");
    } else {
      System.out.println(" Не делится");
    }
  }
}
