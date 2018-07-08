package Lesson_2;

import java.lang.Math;

public class Lesson2 {
  public static void main(String[] args) {
    System.out.println("--------Lesson_2--------");
    /*Задача №1*/
    System.out.println("1. Найти минимальное из 3х чисел.");
    System.out.println("\t Числа: 2, 4, 6");
    int a = 2, b = 4, c = 6;
    int m = min(a, b, c);
    System.out.println("Минимальное число: " + min(a, b, c));
    /*Задача №2*/
    System.out.println("2. Найти среди 3х чисел максимальное и минимальное.");
    System.out.println("\t Числа: 5, 10, 15");
    int i = 5, j = 10, k = 15;
    int m1 = min(i, j, k);
    int x = max(i, j, k);
    System.out.println("Минимальное число: " + min(i, j, k));
    System.out.println("Максимальное число: " + max(i, j, k));
    /*Задача №3*/
    System.out.println("3. Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа");
    System.out.println("\t Числа: 2, 2, 4");
    int l = 2, o = 2, p = 4;
    int m2 = min(a, b, c);
    System.out.println("Минимальные числа: " + min(l, o, p) + ", " + min(l, o, p));
    /*Задача №4*/
    System.out.println("4. Написать программу, которая проверит, является ли число четным или нечетным");
    System.out.println("\t Число: 10");
    int n = 10;
    if (n % 2 == 0){
      System.out.println("Число: " + n + " - четное");
    } else {
      System.out.println("Число: " + n + " - нечетное");
    }
    /*Задача №5*/
    System.out.println("5. Даны 2 числа, определить делится ли первое число на второе без остатка");
    System.out.println("\t Числа: 20, 10");
    int d = 20;
    int e = 10;
    if (d % e == 0){
      System.out.println("Делится");
    } else {
      System.out.println("Не делится");
    }
    /*Задача №6*/
    System.out.println("6. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11");
    System.out.println("\t Число: 10");
    int q = 8;
    int r = 11;
    int s = numberTen(q, r);
    System.out.println("Ближайшее число к 10: " + s);
    /*Задача №7*/
    System.out.println("7. Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, \n" +
            "что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн,\n" +
            "а если больше 7 дней, то скидка составит 50 грн.");
    int days = 6;
    int price = 40*days;
    if(days > 7){
      price -= 50;
    } else if(days > 5){
      price -= 20;
    } else {
      System.out.println("Ошибка!");
    }
    System.out.println("Дней: 6");
    System.out.println("Цена: " + price);
  }

  /*Задачи №1, №2*/
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

  /*Задача №2*/
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

  /*Задача №6*/
  static int numberTen(int q, int r) {
    int d1 = Math.abs(q - 10);
    int d2 = Math.abs(r - 10);
    return d1 < d2 ? q : r;
  }
}
