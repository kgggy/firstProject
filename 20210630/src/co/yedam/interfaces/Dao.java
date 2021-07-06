package co.yedam.interfaces;

public interface Dao { // Data Access Object
	public void insert(); // 추상메소드(기능이 구현되어있지 않아 상속받는 곳에서 구현해야하는 메소드)
//abstract 
//Dao(interface)를 구현하는 클래스 -> OracleDao, MysqlDao.(Dao기능을 구현하지 않으면 에러발생)
	
	
	public void update();

	public void delete();
}
