
public class Task5 {

	public static void main(String[] args) {
		// 5. Посчитать количество чётных и нечётных элементов в массиве,
		// кол-во чётных и нечётных вывести на экран
		
		int x[] = new int[100];
		
		for (int c = 0; c <x.length; c++) {
			x[c] = c + 1;
		}
		
		int evenAmount = 0;
		int oddAmount = 0;
		for (int i = 0; i <x.length; i++) {
			if (x[i]%2==0) {
				evenAmount = evenAmount + 1;
			}else {
				oddAmount = oddAmount + 1;
			}
		}

		System.out.println("Количество четных элементов в массиве = " + evenAmount);
		System.out.println("Количество нечетных элементов в массиве = " + oddAmount);
	}

}
