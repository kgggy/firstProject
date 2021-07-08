package co.yedam.generic.board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {
		
		//게시판
		Board b1 = new Board("이것이자바다", "자바가 어렵네요...");
		Board b2 = new Board("초콜렛", "오늘 박미경쌤이 초콜렛을 주셨어요.");
		Board b3 = new Board("날씨", "비가와요...");
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(b1);
		dao.insertBoard(b2);
		dao.insertBoard(b3);
		
		//Map형식으로 리스트를 보여준다.
		Map<String, String> map = dao.getBoards();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		System.out.println("< Map으로 가져온 리스트 >");
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println("제목: " + key +  ", 내용: " + map.get(key));
		}
		
		ArrayList<Board> list = dao.getBoardList();
//		for(Board board:list) { //컬렉션에 들어있는 갯수만큼 반복문 실행.
//			System.out.println(board.toString());
//		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("수정할 글 제목을 입력하세요.");
		String search = scn.nextLine();
		System.out.println("변경할 내용을 입력하세요.");
		String changeContent = scn.nextLine();
		
		Board arg = new Board(search, changeContent); //Board타입을 매개변수로.
		
	//	dao.updateBoard(search, changeContent); //일일히 변수타입 선언한 경우.
		dao.updateBoard(arg);
		
		System.out.println("< List으로 가져온 리스트 >");
		list = dao.getBoardList();
		for(Board board:list) { 
			System.out.println(board.toString());
		}
		scn.close();
	}
}
