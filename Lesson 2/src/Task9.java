
import java.io.*;
import java.util.stream.Collectors;

public class Task9 {

	public static void main(String[] args) throws IOException {
		// 9. ����������� ���������� ��� ��� ������ 8 � ����������
		
        char x[] = new char[13]; 
        
        String name = "";
        	
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line:");
        System.out.println(keyb.readLine());  
        
        name = keyb.lines().collect(Collectors.joining("\n"));
        
                  
	}

}
