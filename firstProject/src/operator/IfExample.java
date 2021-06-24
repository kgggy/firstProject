package operator;

public class IfExample {
	public static void main(String[] args) {
		//if () {} ()조건을 만족할때 {}실행
		//()아닐때는 else{}
		//조건이 여러개일때는 else if 사용하고 마지막에 else 사용
		int v1 = 20;
		int v2 = 20;
		
		if(v1 > v2) {
			System.out.println("v1 이 v2보다 큽니다.");
		} else if(v1==v2) {
			System.out.println("v1 이 v2와 같습니다.");
			
		}
		else {
			System.out.println("v2 가 v1보다 큽니다.");
		}
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		if(str1.equals(str3)) {
			System.out.println("같은 이름입니다.");
			// 문자열을 비교할땐 ==로 하면 new string으로 만들엇을 경우 주소가 달라지므로 
			// 같은 내용이라도 다른 것으로 이해함
			// equals는 문자열을 비교해줌
		}else {
			System.out.println("다른 이름입니다.");
		}
		
		System.out.println("end of prog");
	}

}
