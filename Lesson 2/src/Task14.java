import java.util.Arrays;

public class Task14 {

	public static void main(String[] args) {
		// 14. Найти в массиве и вывести на экран все элементы в заданном диапазоне (например от 20 до 23)

		int[] arr = new int[100];
		
		for (int c = 0; c <arr.length; c++) {
			arr[c] = (int) (Math.random() * 10);
			
		}
		
		int arrReq[] = new int[100];
		int b = 0;

		for (int i = 0; i <arr.length; i++) {
			if(arr[i] >= 1 && arr[i] <= 5) {
				arrReq[b] = arr[i];
				b = b +1;
			}
		}
		for (int a = 0; a < arrReq.length; a++) {
			if(arrReq[a] != 0) {
			System.out.print(arrReq[a] + " ");
			}
		}
		
	}
	
}
	

