
public class Task4 {

	public static void main(String[] args) {
		// 4. Посчитать разность всех нечётных элементов массива
		
		int x[] = new int[15];
		int oddSum = 0;
		
		for(int c = 0; c <x.length; c++) {
			x[c]= c + 1;
			if (x[c]%2!=0) {
				oddSum = oddSum + 1;
			}
		}
		
		int y[] = new int[oddSum];
	 	int b = 0;
		
		for (int i = 0; i<x.length; i++) {
			if (x[i]%2!=0) {
				y[b] = x[i];
				b = b + 1;
			}
		}
			
			int yDif = 0;			
		for (int e = 0; e < y.length; e++) { 
			yDif = yDif - y[e];
			}
		System.out.println("Разность всех нечетных елементов массива х = " + yDif);
		}

	}


