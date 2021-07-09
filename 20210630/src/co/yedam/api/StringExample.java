package co.yedam.api;

public class StringExample {
	public static void main(String[] args) {
//		String data = new String("Hello, World");
//		char val = data.charAt(7); //문장의 인덱스 0번째 위치를 가져옴.
//		System.out.println(val);

		// 6번째 자리가 1,3이면 남자 2,4면 여자. 공백이나 - 없애기.
//문자열 찾기 => " "/-가 포함되어있으면 7번째, 없으면 6번째 숫자가 1/3이면 남자, 2,4면 여자.

		String birth1 = "9703041324567";
		String birth2 = "970304 1655984";
		String birth3 = "970304-2324567";
		String birth4 = "020304-3235648";
		String birth5 = "003565 4263213";

		// String gen = checkGender(birth1);

//		String data = new String(birth2);
//		char val = data.charAt(6);
//		System.out.println(val);
//
//		String first = data.substring(0, 6);
//		String second = data.substring(7);
//
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(first);
//		sb.append(second);
//		System.out.println(sb.toString());
		
		String subject = birth1;
		if(birth1.indexOf(" ") != -1 && birth1.indexOf("-") != -1) {
			
		}

	}

//	public static String checkGender(String id) {
//		if (val == 1) {
//			return "남자";
//		} else
//			return "여자";
//
//	}

}
