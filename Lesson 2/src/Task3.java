
public class Task3 {

	public static void main(String[] args) {
		// 3. ������� �� ����� ������ ����� �� ������� �� 100 ���������, ������������ ���������� ������ �������
		
		int[] x = new int[100];
		
		// y = (int) (Math.random() * 100); ���������� ���������� ���������� ����� �� 0 �� 100
		
		for (int c = 0; c <x.length; c++) {
			x[c] = (int) (Math.random() * 100);
		}
		
		for (int c = 0; c <x.length; c++) {
			if(x[c]%2==0){
		    System.out.println("����� " + c + " �������� ������ � ��� = " + x[c]);
			}
		}
				
	}

}
