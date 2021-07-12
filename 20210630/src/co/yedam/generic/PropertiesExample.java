package co.yedam.generic;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		String path = PropertiesExample.class.getResource("../../db.properties").getPath(); // 상대경로 
		//db.properties => key, value형식으로 값을 저장.
		Properties prop = new Properties(); // 생성자 호출.
		try {
			prop.load(new FileReader(path));
			String id = prop.getProperty("id");
			String name = prop.getProperty("name");
			String pass = prop.getProperty("password");

			System.out.println(id + ", " + name + ", " + pass);
		} catch (Exception e) { // Exception => 최상위 예외.
			e.printStackTrace();
		} 
	}
}
