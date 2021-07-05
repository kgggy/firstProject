package co.yedam.exercise;

public class Food {
	private String bread;
	private String fruit;
	private String rice;
	private String pasta;	
	
	public Food() {
	}
	
	public Food(String bread, String fruit, String rice, String pasta) {
		super();
		this.bread = bread;
		this.fruit = fruit;
		this.rice = rice;
		this.pasta = pasta;
	}
	
	
	public Food(String bread, String fruit) {
		super();
		this.bread = bread;
		this.fruit = fruit;
	}

	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getPasta() {
		return pasta;
	}
	public void setPasta(String pasta) {
		this.pasta = pasta;
	}
	
	
		
	}


