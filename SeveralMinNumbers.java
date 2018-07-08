package Lesson_2;

public class SeveralMinNumbers {
  public static void main(String[] args){
    System.out.println("--------Lesson_2--------");
    System.out.println("3. Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа");
    System.out.println("\t Числа: 2, 2, 4");
    int a = 2, b = 2, c = 4;
    int m = min(a, b, c);
    System.out.println("Минимальные числа: " + min(a, b, c) + ", " + min(a, b, c));
  }

  public static int min (int d, int e, int f){
    int minimum;
    if (d < e && d < f) {
      minimum = d;
    } else if (e == d && e < f){
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
