package conditions;

public class SwitchExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 5) + 1;
		System.out.println(ran);
		switch (ran) {
		case 1:
			System.out.println("1값이 나왔습니다.");
			break;
		// break는 case1을 만족하면 더이상의 경우는 실행하지 않고 빠져나오겠다는 의미.
		case 2:
			System.out.println("2값이 나왔습니다.");
			break;
		case 3:
			System.out.println("3값이 나왔습니다.");
			break;
		default:
			System.out.println("그 외");
			// else와 같은 의미
		}
	}

}
