package co.yedam.exercise;

public class Employee {
 //필드 정의
	private String empName;
	private int empNum;
	private String empEmail;
	private int empPay;
	private String empDep;
	
	public Employee() {
		
	}
	
	public Employee(String empName, int empNum, String empEmail, int empPay, String empDep) {
		super();
		this.empName = empName;
		this.empNum = empNum;
		this.empEmail = empEmail;
		this.empPay = empPay;
		this.empDep = empDep;
	}
	public Employee(String empName, int empNum, String empEmail) {
		super();
		this.empName = empName;
		this.empNum = empNum;
		this.empEmail = empEmail;
	}
	//오른쪽마우스-source-construct using field
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public int getEmpPay() {
		return empPay;
	}
	public void setEmpPay(int empPay) {
		this.empPay = empPay;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String showInfo() {
		return "사원이름: " + empName + " 사원번호: " + empNum +  " 이메일: " + empEmail + " 급여: " +empPay +  " 부서: " + empDep;
	}
	public String showInfo1() {
		return "사원이름: " + empName + " 사원번호: " + empNum +  " 이메일: " + empEmail;
	}
	

}
