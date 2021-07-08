package co.yedam.generic;

class Orange{
	int price;
	
}
public class BoxExample {
	public static void main(String[] args) {
		
		//generic => 클래스 정의하는 시점이 아닌 사용시점에 어떤 타입이든 받아 사용할 수 있도록함.
		//지정해서 Casting할 필요 없음, 타입오류를 일으키지 않도록 함.
		//클래스<타입> 변수선언  의 형태로 이용.
		Box<String> box = new Box<String>(); 
		box.setObj("Hello");
		String val = box.getObj(); 
//		Box box = new Box();
//		box.setObj("Hello");
//		String val = (String) box.getObj();//getObj의 타입이 Object 타입이므로 형태변환해줘야함.
		
		Box<String> boxx = new Box<String>();
		boxx.setObj("10"); 
		String val2 = boxx.getObj();
		
//		box.setObj("10"); //문자열 10.
//		Integer val2 = (Integer) box.getObj(); //=>String타입을 Integer타입으로 가져오면 오류발생.
		
		Box<Orange> box1 = new Box<Orange>();
		box1.setObj(new Orange());
		Orange ora = box1.getObj();
		
		
		
		//int(실제값) => Integer(참조타입)
		//byte(기본 데이터타입) => Byte(byte의 클래스)
		//double => Double
	}
}
