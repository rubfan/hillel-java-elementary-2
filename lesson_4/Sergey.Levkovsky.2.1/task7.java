package lesson4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taks7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int command = s.nextInt();
        int numbers[] = new int[command];
        for (int i = 0; i < numbers.length; i++) { //Принимаем все числа массива
            System.out.println("Enter" + " " + i + " " + "number of the array");
            numbers[i] = s.nextInt();
        }

        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even.add(numbers[i]);
            } else {
                odd.add(numbers[i]);
            }
        }

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < even.size(); i++) {
            sumEven += even.get(i);
        }
        for (int i = 0; i < odd.size(); i++) {
            sumOdd += odd.get(i);
        }

        System.out.println("Array of even numbers is: " + even);
        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("Array of odd numbers is: " + odd);
        System.out.println("The sum of odd numbers is " + sumOdd);
    }
}
