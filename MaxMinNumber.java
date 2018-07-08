package Lesson_2;

public class MaxMinNumber {
  public static void main(String[] args) {
    System.out.println("--------Lesson_2--------");
    System.out.println("2. Найти среди 3х чисел максимальное и минимальное.");
    System.out.println("\t Числа: 5, 10, 15");
    int a = 5, b = 10, c = 15;
    int m = min(a, b, c);
    int x = max(a, b, c);
    System.out.println("Минимальное число: " + min(a, b, c));
    System.out.println("Максимальное число: " +max(a, b, c));
  }

  public static int min (int d, int e, int f){
    int minimum;
    if (d < e && d < f){
      minimum = d;
    } else if (e < d && e < f){
      minimum = e;
    } else if (f < d && f < e){
      minimum = f;
    } else {
      minimum = 0;
      System.out.println("Ошибка");
    }
    return minimum;
  }

  public static int max (int d, int e, int f){
    int maximum;
    if (d > e && d > f){
      maximum = d;
    } else if (e > d && e > f){
      maximum = e;
    } else if (f > d && f > e){
      maximum = f;
    } else {
      maximum = 0;
      System.out.println("Ошибка");
    }
    return maximum;
  }
}
