
public class Task5 {

	public static void main(String[] args) {
		// 5. ��������� ���������� ������ � �������� ��������� � �������,
		// ���-�� ������ � �������� ������� �� �����
		
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

		System.out.println("���������� ������ ��������� � ������� = " + evenAmount);
		System.out.println("���������� �������� ��������� � ������� = " + oddAmount);
	}

}
