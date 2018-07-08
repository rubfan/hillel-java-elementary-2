package Lesson_2;

import java.lang.Math;

public class NearestNumber {
  public static void main(String[] args){
    System.out.println("--------Lesson_2--------");
    System.out.println("6. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11");
    System.out.println("\t Число: 10");
    int a = 8;
    int b = 11;
    int c = numberTen(a, b);
    System.out.println("Ближайшее число к 10: " + c);
  }

  static int numberTen(int a, int b) {
    int d1 = Math.abs(a - 10);
    int d2 = Math.abs(b - 10);
    return d1 < d2 ? a : b;
  }
}
