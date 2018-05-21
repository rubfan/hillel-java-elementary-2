public class hometask6 {
	
	public static void main(String[] args) {
		
		int x = 42; // количество элементов в массиве;
				
		// объявляем и инициализируем массив с количеством членов 'x';
		int a[] = new int[x]; 		
				
		// цикл, чтобы просто указать значения (от 1 до x) членам массива для моей проверки работоспособности :)
		for ( int i = 1; i <= x; i++ ) { 
		
			a[i-1]= 0 + i; 
			System.out.println(a[i-1]);
			
		}
		
		int result = a[0]+a[x-1];
		System.out.println("Result: " + result);
		
	}
}
		