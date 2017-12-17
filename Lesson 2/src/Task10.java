import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		// 10. Добавить в массив из задания 9 пробел и отчество.
		
		String name = "Баркова Дарья";
		
		char x[] = name.toCharArray();
		
		String secname = "Валерьевна";
		
		char y[] = secname.toCharArray();
		
		char z[] = new char[x.length + y.length + 1];
		
		int i = 0;
		
		for (int c = 0; c <z.length; c++) {
		    if(c < x.length) {
		    	z[c] = x[c];
		    }else if(c > x.length) {
		    	z[c] = y[i];
		    	i = i + 1;
		    }
		}
		System.out.println(Arrays.toString(z));
	}

}
