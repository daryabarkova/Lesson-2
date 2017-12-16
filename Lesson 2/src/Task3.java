
public class Task3 {

	public static void main(String[] args) {
		// 3. Вывести на экран четные числа из массива из 100 элементов, заполненного случайными целыми числами
		
		int[] x = new int[100];
		
		// y = (int) (Math.random() * 100); Присвоение переменной случайного числа от 0 до 100
		
		for (int c = 0; c <x.length; c++) {
			x[c] = (int) (Math.random() * 100);
		}
		
		for (int c = 0; c <x.length; c++) {
			if(x[c]%2==0){
		    System.out.println("Число " + c + " является четным и оно = " + x[c]);
			}
		}
				
	}

}
