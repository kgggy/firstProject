package co.yedam.exercise;

public class FoodExample {
	public static void main(String[] args) {
		Food f1 = new Food();
		f1.setFruit("apple");
		System.out.println(f1.getFruit());

		Food f2 = new Food("pie", "orange", "rice", "cream");
		System.out.println(f2.getBread() + ", " + f2.getFruit() + ", " + f2.getRice() + ", " + f2.getPasta());

		Food f3 = new Food("tart", "grape");
		System.out.println(f3.getBread() + ", " + f3.getFruit());
		
	//	Food[] //food계열의 인스턴스를 담을 수 있는 배열
		Food[] foods = new Food[5]; //5개를 담을 수 있는 배열.
		foods[0] = f1;
		foods[1] = f2;
		foods[2] = f3; //나머지 두 자리는 초기값 null값으로 할당되어있음.
		
		for(int i = 0; i<foods.length; i++) {
			if(foods[i] != null) {
				System.out.println(foods[i].getBread() + ", " + foods[i].getFruit()+ ", " + foods[i].getRice() + ", " + foods[i].getPasta());
			}
		}
		
	}

}
