
public class Task7 {

	public static void main(String[] args) {
		// 7. Найти максимальный и минимальный элемент среди чётных/нечётных

		int arr[] = new int[155];
		
		int evenAm = 0;
		int oddAm = 0;
		
		
		for (int c = 0; c <arr.length; c++) {
			arr[c] = c + 1;
			if (arr[c]%2==0) {
				evenAm = evenAm + 1;
			}else {
				oddAm = oddAm + 1;
			}
		}
		
		int evenArr[] = new int[evenAm];
		int oddArr[] = new int[oddAm];
			
		int a = 0;
		int b = 0;
		
		for (int i1 = 0; i1 <arr.length; i1++) {
			if (arr[i1]%2==0) {
				evenArr[a] = arr[i1];
				a = a + 1;
			}else {
				oddArr[b] = arr[i1];
				b = b + 1;
			}
		}
						
		int evenMax = evenArr[0];
		int evenMin = evenArr[0];
		
		int oddMax = oddArr[0];
		int oddMin = oddArr[0];
		
		for (int c1 = 1; c1 <evenArr.length; c1++) {
			if (evenArr[c1] > evenMax) {
				evenMax = evenArr[c1];
			}
		}
		System.out.println("Максимальный элемент среди четных чисел - " + evenMax);
		
		for (int c2 = 1; c2 < evenArr.length; c2++) {
			if (evenArr[c2] < evenMin) {
				evenMin = evenArr[c2];
			}
		}
		System.out.println("Минимальный элемент среди четных чисел - " + evenMin);
				
		for (int c3 = 0; c3 < oddArr.length; c3++) {
			if (oddArr[c3] > oddMax) {
				oddMax = oddArr[c3];
			}
		}
		System.out.println("Максимальный элемент среди нечетных чисел - " + oddMax);
		
		for (int c4 = 0; c4 < oddArr.length; c4++) {
			if (oddArr[c4] < oddMin) {
				oddMin = oddArr[c4];
			}
		}
		System.out.println("Минимальный элемент среди нечетных чисел - " + oddMin);
	}
}
