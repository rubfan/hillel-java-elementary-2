// Задача "Чаевые".
// входные данные: сумма, которую вы должны заплатить и уровень сервиса
// в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
// - terrible (0%)
// - poor (5%)
// - good (10%)
// - great (15%)
// - excellent (20%)

import java.util.Scanner; 

public class hometask4 {
	
	public static void main(String []args) {
		
		Scanner chs = new Scanner(System.in);
		
		double totalPayment;
						
		String quality;
		
		System.out.println("You have received some services. Enter the amount you have to pay for them: ");
		totalPayment = chs.nextDouble();
			
		System.out.println("Type the service quality (choose the one of below listed) and press 'Enter' to determine how much tips to leave: ");
		System.out.println("terrible");
		System.out.println("poor");
		System.out.println("good");
		System.out.println("great");
		System.out.println("excellent");
		
		quality = chs.next();
		
		if (quality.equals("terrible") || quality.equals("poor") || quality.equals("good") || quality.equals("great") || quality.equals("excellent")) {
			
		switch(quality) {
			
			case "terrible": 
				System.out.println("No tips");			
				break;
			case "poor": 
				System.out.println("Tips: " + (totalPayment * 0.05));
				break;
			case "good": 
				System.out.println("Tips: " + (totalPayment * 0.10));
				break;
			case "great": 
				System.out.println("Tips: " + (totalPayment * 0.15));
				break;
			case "excellent": 
				System.out.println("Tips: " + (totalPayment * 0.20));
				break;
		
		}
		}
		
		else {
			
			System.out.println("Wrong! Please try again.");
										
		}
	}
}
