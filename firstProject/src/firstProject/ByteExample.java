package firstProject;

public class ByteExample {
	public static void main(String[] args) {
		byte numb1 = 125; // -129 ~ 127
		
		++numb1; //126 = 125 + 1
		++numb1; //127 = 126 + 1
		++numb1; //??? = 127 + 1;
		System.out.println(numb1);
		
		int numb2 = 13;
		int numb3 = 13;
		int rem = numb2 % numb3;
		System.out.println(numb3 + "�� ���� ������: " + rem);
	}

}
