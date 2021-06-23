package firstProject;

public class AvgExample {
	public static void main(String[] args) {
//		국어, 영어. 수학 0 ~ 100
		int kor = 100;
		int eng = 100;
		int math = 98;
		String name = "권가영";
		
		int sum = kor + eng + math;
	    double avg = sum/3.0;
	    
	    System.out.println(name + "학생의 점수합계는 " + sum + ", 평균은 " + avg + "점 입니다.");

	}

}
