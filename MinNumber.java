package Lesson_2;

public class MinNumber {
  public static void main(String[] args) {
    System.out.println("--------Lesson_2--------");
    System.out.println("1. Найти минимальное из 3х чисел.");
    System.out.println("\t Числа: 2, 4, 6");
    int a = 2, b = 4, c = 6;
    int m = min(a, b, c);
    System.out.println("Минимальное число: " + min(a, b, c));
  }

  public static int min (int d, int e, int f){
    int minimum;
    if (d < e && d < f) {
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
}
