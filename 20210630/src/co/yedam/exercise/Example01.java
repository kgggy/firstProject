package co.yedam.exercise;

public class Example01 {
	public static void main(String[] args) {
		// e1 => 사원번호:1234, 이름:박주현,

		Employee e1 = new Employee();
		e1.setEmpName("박주현");
		e1.setEmpNum(1234);
		e1.setEmpEmail("pjh@email.com");
		e1.setEmpPay(4500000);
		e1.setEmpDep("개발부");
		//System.out.println(e1.showInfo());

		Employee e2 = new Employee("홍미림", 1235, "hmr@email.com");
		//System.out.println(e2.showInfo1());

		Employee[] employees = new Employee[5];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = new Employee("임효인", 1236, "lhi@email.com", 5000000, "총무부");

		for (int i = 0; i < employees.length; i++) {
			if(employees[i] != null) {
				System.out.println(employees[i].showInfo());
			}
			
		}

	}
}
