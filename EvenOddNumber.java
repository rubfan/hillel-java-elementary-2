package Lesson_2;

public class EvenOddNumber {
  public static void main(String[] args){
    System.out.println("--------Lesson_2--------");
    System.out.println("4. Написать программу, которая проверит, является ли число четным или нечетным");
    System.out.println("\t Число: 10");
    int n = 10;
    if (n % 2 == 0){
          System.out.println("Число: " + n + " - четное");
    } else {
          System.out.println("Число: " + n + " - нечетное");
    }
  }
}
