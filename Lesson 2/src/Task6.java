
public class Task6 {

	public static void main(String[] args) {
		// 6. ����� � ������� �� ����� ������������ / ����������� �������
		
		int x[] = new int[] {11, 1049, 5, 84, 65, 87, 3, 555};
		
		int max = x[0];
		
		for (int c = 1; c <x.length; c++) {
			if (x[c] > max) {
				max = x[c];
			}
		}
								
		System.out.println("������������ ������� ������� - " + max);
		
		int min = x[0];
		for (int i = 1; i <x.length; i++) {
			if(x[i] < min) {
				min = x[i];
			}
		}
						System.out.println("����������� ������� ��c���� - " + min);
	}

}






