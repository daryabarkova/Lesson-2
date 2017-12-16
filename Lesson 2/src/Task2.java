
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// 2. Заполнить массив из 100 элементов случайными целыми числами
		
		Random rg = new Random();
							
		int x[] = new int[100];
					
		for (int c = 0; c <x.length; c++) {
			int r = rg.nextInt(100);
		    x[c] = r;
		}
		
	   for (int c = 0; c<x.length; c++) {
		   System.out.println("Число " + c + "=" + x[c]);
	   }
		
       
	}

}
