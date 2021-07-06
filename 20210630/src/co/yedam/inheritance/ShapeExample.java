package co.yedam.inheritance;

public class ShapeExample {
	public static void main(String[] args) {		
		//다형성
		//명령어는 같지만 다양한 형태의 결과.(상속의 특징)
		Shape shape = new Shape();
		shape.draw();
		
		shape = new Triangle();
		shape.draw();
		
		shape = new Rectangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
		
	}

}
