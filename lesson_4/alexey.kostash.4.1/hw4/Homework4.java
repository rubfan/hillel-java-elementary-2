package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

    int[] arr = new int[20];
    int n;

    static void upTo10000(){
        for(int i = 1000; i < 10000;){
            System.out.println(i);
            i +=3;
        }
    }

    static void first55(){
        int a = -1;
        for(int i = 0; i < 55; i++){
            System.out.println(a += 2);
        }
    }

    static void from90to0(){
        for(int i = 90; i >= 0;){
            System.out.println(i);
            i -=5;
        }
    }

    static void first20(){
        int a = 2;
        for(int i = 0; i < 20; i++){
            System.out.println(a << i);
        }
    }

    void firstValueOfArray(){
        if(this.n > this.arr.length){
            System.out.println("Error: value is bigger than array length.");
        }else{
            for(int i = 0; i < this.n; i++){
                System.out.println(this.arr[i]);
            }
        }
    }

    static void evenOddOfArray(int[] arr){
        int evenSum = 0, oddSum = 0;
        for (int i : arr) {
            if(i % 2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("Even = " + evenSum + ", Odd = " + oddSum);
    }

    static void minMaxOfArray(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i : arr){
            if(min > i) min = i;
            if(max < i) max = i;
        }
        System.out.println("min = " + min + ", max = " + max);
    }

    static void luckyTicket(){
        int sum, a;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    sum = i + j + k;
					//В следующих двух циклах определяются три цифры второго числа. 
					//Сложные логические условия объясняются так:
					//int m = sum - 18 > 0 ? sum - 18 : 0; означает что, если например сумма равна 24, то первая цифра не может быть меньше 6 (24 - 18),
					//значит осуществлять перебор от 0 до 5 не имеет смысла
					//часть (m < 10) && (m <= sum) означает, что цыфра неможет быть больше 9 и больше суммы, например если сумма = 4, то не имеет смысла перебирать 
					//значения от 5 до 9.
					//второй цикл действует аналогично первому
					//Благодаря такому подходу количество итераций удалось уменьшить с 999999 до 55252 (это и есть количество счастливых билетиков)
                    for(int m = sum - 18 > 0 ? sum - 18 : 0; (m < 10) && (m <= sum); m++){
                        for(int n = sum - 9 - m > 0 ? sum - 9 - m : 0; (n < 10) && (n <= (sum - m)); n++){
                            a = sum - (m + n);
                            System.out.println(""+i+j+k+m+n+a);
                        }
                    }
                }
            }
        }
    }

    static void toBinary(int i){
        int[] nums = new int[32];
        int k = Math.abs(i);
        int iter = 0;
        for (int j = 0; j < nums.length; j++) {
            nums[j] = k % 2;
            k /= 2;
        }
        if(i >= 0){
            while(nums[31 - iter++] == 0){}
            for (int j = nums.length - iter; j >= 0; j--) {
                System.out.print(nums[j]);
            }
        }else{
            for (int j = 0; j < nums.length; j++) {
                nums[j] ^= 1;
            }
            while(nums[iter] == 1){
                nums[iter++] = 0;
            }
            nums[iter] = 1;
            for (int j = nums.length - 1; j >= 0; j--) {
                System.out.print(nums[j]);
            }
        }
        System.out.println();
    }

    static void firstFiveMin(int [] arr){
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    static void toOneDigit(int i){ // i must be > 0
        while (!(i<10)){
            int j = 0;
            while (i > 0){
                j += i % 10;
                i /= 10;
            }
            i = j;
        }
        System.out.println(i);
    }

    public static void main(String[] args) {

        System.out.println("1======= from 1000 to 10000 =======");
        upTo10000();

        System.out.println("2======= first 55 =======");
        first55();

        System.out.println("3======= from 90 to 0 =======");
        from90to0();

        System.out.println("4======= first 20 =======");
        first20();

        System.out.println("5======= first N of array =======");
        
		Homework4 hw4 = new Homework4();
        int num;
        Scanner scan = new Scanner(System.in);
        
		for(int i = 0; i < hw4.arr.length; i++){
            hw4.arr[i] = (int)(Math.random()*10000);
        }
        for(int i = 0; i < hw4.arr.length; i++){
            System.out.println(hw4.arr[i]);
        }
        
		System.out.print("Enter how many of the first array elements you whant to see: ");
        hw4.n = scan.nextInt();
        scan.nextLine();
        hw4.firstValueOfArray();

        System.out.println("6======= Max & Min of array =======");
        minMaxOfArray(hw4.arr);

        System.out.println("7======= Even and odd of array =======");
        evenOddOfArray(hw4.arr);

        System.out.println("8======= Lucky Ticket =======");
        luckyTicket();

        System.out.println("9======= toBinary =======");
        
		System.out.print("Enter integer: ");
        num = scan.nextInt();
        scan.nextLine();
        System.out.print(num + " in binary system is: ");
        toBinary(num);

        System.out.println("10======= first 5 min =======");
        firstFiveMin(hw4.arr);

        System.out.println("11======= Digit    =======");
        
		System.out.print("Enter integer (must be bigger then zero): ");
        num = scan.nextInt();
        scan.nextLine();
        scan.close();
        toOneDigit(num);
    }
}