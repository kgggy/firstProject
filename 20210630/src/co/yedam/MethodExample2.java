package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();  
		p1.setName("홍길동");		
		String name = p1.getName(); //매개값이 없도록 정의해놓았으므로 ()내에 아무것도 없음.
		
//		p1.showInfo(); // void -> return(반환)타입이 없음(마우스 올려보면 알 수 ㅇ)
//		String info = p1.getName(); // String타입으로 반환해줌
		
		int result = p1.getSum(10, 20);
		System.out.println("결과 : " + result);		
		
		int result2 = p1.getSum(p1.getSum(10, 20), p1.getSum(5, 5));
		System.out.println("결과 : " + result2);
		
		//10에서 20 사이의 임의값 추출
		int n1 = 0;
		int n2 = 0;
		n1 = p1.getFrom10To20();
		System.out.println(n1);
		n2 = p1.getFrom10To30(20, 30);
		System.out.println(n2);
		
		
		String returns = p1.getNameAndAge("홍길동",20);
		System.out.println(returns);
		
		Person newPerson = p1.createNewPerson("권가영", 25, "A");
		newPerson.setHeight(163.3);
		System.out.println(newPerson.getInfo());
		
		//이름, 나이, 키를 매개값으로 받아 새로운 사람 생성.
		Person anotherPerson = p1.createNewPerson("권가영", 20 , 165.3, "AA");
		System.out.println(anotherPerson.getInfo());
		
		Person theOtherPerson = p1.createNewPerson("안의정", 20, 165.3,"O");
		System.out.println(theOtherPerson.getInfo());
		
	}
	

}
