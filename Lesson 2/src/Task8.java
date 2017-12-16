
public class Task8 {

	public static void main(String[] args) {
		
		//8. Сохранить в массив типа char свою фамилию и имя (размер массива не
		 // должен превышать количество
		 // символов в фамилии пробел имени

		char x[] = new char[13]; 
		
		String name = "Баркова Дарья";
				
		for (int i = 0; i <name.length(); i++) {
			x[i] = name.charAt(i);
		}
				
	}

}
