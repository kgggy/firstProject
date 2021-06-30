package referece;

public class PersonExample {
	public static void main(String[] args) {
		Person ohj = new Person(); //new person -> 실제 존재를 만드는 것 : '인스턴스화'(개체) 한다고 표현
		
		//ohj는 변수(여러 형태의 데이터 담지 못함), person은 클래스(다양한 형태의 데이터 담기 가능, 기능 가능).
		ohj.name = "홍길동";
		ohj.age = 20;
		ohj.height = 167.4;
		ohj.weight = 50;
		//ohj.birth = "20100101"; //필드에 없으므로 사용 불가.
		
		ohj.walk();
		ohj.sleep();
		ohj.showInfo();
		
		Person psy = new Person();
		psy.walk();
		
	}

}
