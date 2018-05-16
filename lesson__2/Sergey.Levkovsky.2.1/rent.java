import java.util.Scanner;
public class rent {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the number of days you spent: ");
        int days = A.nextInt();// задаем колдичество прожитых дней

        int rentAday = 40; //оплата за день
        int rentAdays = days * rentAday;// оплата за аренлу

        if (days >= 5 & days< 7) {
            rentAdays = days * rentAday - 20; // учитываем скидку за 5 или более прожитых дней
        }
        else if (days >= 7) {
            rentAdays = days * rentAday - 50; // учитываем скидку за 7 или более прожитых дней
        }

        System.out.println("payment for rent is" + " " + rentAdays);
    }
}