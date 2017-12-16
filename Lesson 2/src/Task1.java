
public class Task1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		int x1 = 1;
//		int y1 = 2;
//		
//		int[] х = new int[5];
//		char y[] = new char[10];
//		
//		System.out.println("");

		// 1. заполнить массив х целыми числами, 
		// вывести содержимое массива x на экран
		
//		int[] x= new int[10];
//		
//		for (int i = 0; i <x.length; i++) {
//			x[i]=i+1;
//		}
//		
//		for (int i = 0; i <x.length; i++){
//		System.out.println(x[i]);
//		
//	}
		
		// 1.1 заполнить массив х целыми числами, 
		// вывести содержимое массива x на экран в обратном порядке
		
	int[] x= new int[10];
		
		for (int i = 0; i <x.length; i++) {
			x[i]=i+1;
		}
		
		for (int i = x.length - 1; i >= 0; i--){
		System.out.println(x[i]);
		
	}
		
	}
}
