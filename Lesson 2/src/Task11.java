
public class Task11 {

	public static void main(String[] args) {
		// 11. Удалить из массива (1е задание) все элементы, кратные 3
		
        int[] x= new int[10];
		
		for (int i = 0; i <x.length; i++) {
			x[i]=i+1;
		}
		
		for (int c = 0; c <x.length; c++) {
			if (x[c]%3==0) {
				x[c] = 0;
			}
		}

	}

}
