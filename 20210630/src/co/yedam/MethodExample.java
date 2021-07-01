package co.yedam;

public class MethodExample {

	public static String makeUsefulInfo(String str) {
		// 괄호가 있는것은 모두 메소드임.
		String[] info = str.split(" "); // " "공백으로 구분해 배열 만듦
		String name = info[0];
		String birth = info[1]; // 공백 다음 내용이 배열의 두번째 내용이 됨.
		String phone = info[2];
		name = "이름 : " + name;
		birth = "\n생일 : " + birth.substring(0, 4) + "년" + birth.substring(4, 6) + "일" + birth.substring(6, 8);
		phone = "\n전화 : " + phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7, 11);
		// substring(0, 3) =>0부터 3번째 까지의 글자를 의미. \n => 한줄 띄우기
		String result;
		result = name;
		result += birth; // += 내용을 더해줌
		result += phone;

//		System.out.println("===========================");
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		String str1 = new String("홍길동 19900101 01012356548");
		String str2 = new String("권가영 19970610 01023546984");
		String str3 = new String("오혜지 19960505 01035456235");

		makeUsefulInfo(str1);
		makeUsefulInfo(str2);
		makeUsefulInfo(str3);

		// String result = makeUsefulInfo()
//		String result1 = makeUsefulInfo(str1);
//		String result2 = makeUsefulInfo(str2);
//		String result3 = makeUsefulInfo(str3);

//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);

		// System.out.println(result);

	}

}
