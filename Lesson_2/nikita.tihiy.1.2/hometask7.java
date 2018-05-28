// Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее стоимость 40 грн. 
// Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.

import java.util.Scanner;

public class hometask7 {
	
	public static void main (String []args) {
		
		Scanner in = new Scanner(System.in);
		
		int days; 
		
		System.out.println("Rent period (days): ");
		days = in.nextInt();
		
		int RentPrice;
		
		if (days <= 0) System.out.println("Please enter relaunch programm and enter correct days value.");
		if (days <= 5) { 
			RentPrice = days * 40; 
			System.out.println("Total cost: " + RentPrice + " UAH.");
			return;
		}
		if (days <= 7) { 
			RentPrice = days * 40 - 20; 
			System.out.println("Total cost: " + RentPrice + " UAH."); 
		}
		else { 
		RentPrice = days * 40 - 50;
		System.out.println("Total cost: " + RentPrice + " UAH.");
		}
	}
}
		
			
		
		
		
		