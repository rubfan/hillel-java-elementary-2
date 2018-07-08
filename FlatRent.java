package Lesson_2;

public class FlatRent {
  public static void main(String[] args){
    System.out.println("--------Lesson_2--------");
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
}
