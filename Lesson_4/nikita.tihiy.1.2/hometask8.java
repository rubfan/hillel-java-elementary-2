public class hometask8 {
	
	public static void main(String[] args) {
		
		int x = 999999-100000+1; // количество чисел в диапазоне
		
		int a[] = new int[x]; // массив с этими числами
		
		a[0] = 100000; // первый член массива
		
		String whole; // строка, куда мы будем записывать член массива на проверку
		String st, nd, rd, fo, fi, si; // строчки с цифрами 6-значных номеров
		
		int ts, dn, dr, of, fu, is; // целочисленные переменные, куда будут записываться эти цифры
		
		// цикл на проверку и выдачу "счастливого номерка" 
		for ( int i = 1; i < x; i++ ) {
						
			a[i] = a[0] + i; // проверяемый член массива
			whole = Integer.toString(a[i]); // переводим его в строку
			
			// разбиваем строчку на 6 других, содержащих каждую цифру проверяемого члена
			st = ""+whole.charAt(0);
			nd = ""+whole.charAt(1);
			rd = ""+whole.charAt(2);
			fo = ""+whole.charAt(3);
			fi = ""+whole.charAt(4);
			si = ""+whole.charAt(5);
			
			// парсим строки в целочисленные переменные 
			ts = Integer.parseInt(st);
			dn = Integer.parseInt(nd);
			dr = Integer.parseInt(rd);
			of = Integer.parseInt(fo);
			fu = Integer.parseInt(fi);
			is = Integer.parseInt(si);
			
			// проверяем счастливый ли номерок сравнивая сумму первых трёх цифр с суммой последних. если да, выдаем на экран
			if ( (ts + dn + dr) == (of + fu + is) ) System.out.println("Lucky number: " + whole);
			
		}
	}
}
		
		
		