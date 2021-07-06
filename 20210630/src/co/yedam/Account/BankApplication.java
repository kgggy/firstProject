package co.yedam.Account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

//컨트롤 입금, 출금 등의 처리들을 사용자의 입력으로 메뉴를 실행.
public class BankApplication {

	private static BankApplication app = new BankApplication();

	private BankApplication() {

	}

	// 싱글톤객체 -> 하나의 애플리케이션 내에서 단 하나만 생성되는 객체.
	// 리소스를 줄이기위해 사용.
	public static BankApplication getInstance() {
		return app;
	}

	// static이 없는 이유 => 인스턴스를 따로 이용하기 위해.
	private void printMenu() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.파일저장 | 6.불러오기 | 7.종료");
		System.out.println("------------------------------------------------------------------");
		System.out.println("선택 >>");
	}

	private Account[] accountArray = new Account[100];
	private Scanner scanner = new Scanner(System.in);
	File file = new File("accountList.txt");

	public void exe() {
		boolean run = true;
		while (run) {
			printMenu();
			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				fileSave();
			} else if (selectNo == 6) {
				fileOpen();
			} else if (selectNo == 7) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}// end of main

	private void createAccount() {
		System.out.println("=======");
		System.out.println("계좌생성");
		System.out.println("=======");

		String ano = Utils.scanString("계좌번호 : ");
		// static 타입이므로 new 인스턴스 안만들어줘도됨. => class명.메소드
		String owner = Utils.scanString("계좌주 : ");
		//String balance = Utils.scanString("초기입금액 : ");
		int balance = 0;
//		while (true) {
//			try {
//				System.out.print("초기입금액 : ");
//				balance = scanner.nextInt();
//				break;
//			} catch (Exception e) {
//				System.out.println("숫자만 입력 가능합니다.");
//				continue;
//			}
//
//			if (balance < 0) {
//				System.out.println("잘못된 값입니다.");
//			}
//		}

//		String amount = scanner.nextLine(); => "1000"->1000

		Account accounts = new Account(ano, owner, balance);
//		accounts.setAno(ano);
//		accounts.setOwner(owner);
//		accounts.setBalance(Integer.parseInt(amount));//문자열을 숫자로(String => int)바꿔주는 역할.
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // 비어있는 위치에 넣기.
				accountArray[i] = accounts;
				break; // 비어있는 위치에 한 건 입력 후 종료.
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	private void accountList() {
		System.out.println("=======");
		System.out.println("계좌목록");
		System.out.println("=======");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].showInfo());
			}
		}
	}

	private Account findAccount(String ano) {
		// String acc = scanner.nextLine();
		// boolean pass = false;
		// Account accounts = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}

	private void deposit() {
		System.out.println("====");
		System.out.println("예금");
		System.out.println("====");

		String ano = scanString("계좌번호 >>");
		Account accounts = findAccount(ano); // 같은 타입을 반환하기 위해 앞에 Account 써줘야함
		if (accounts == null) {
			System.out.println("등록된 계좌가 없습니다.");
		} else {
			String amt = Utils.scanNumberString("예금액 >>");
			int saving = accounts.getBalance() + Integer.parseInt(amt);
			accounts.setBalance(saving);
			System.out.println("입금되었습니다.");
		}

	}

	private void withdraw() {
		System.out.println("====");
		System.out.println("출금");
		System.out.println("====");

		String ano = scanString("계좌번호 >>");
		Account accounts = findAccount(ano); // 같은 타입을 반환하기 위해 앞에 Account 써줘야함
		if (accounts == null) {
			System.out.println("등록된 계좌가 없습니다.");
		} else {
			String amt = Utils.scanNumberString("출금액 >>");
			int saving = accounts.getBalance() - Integer.parseInt(amt);
			accounts.setBalance(saving);
			System.out.println("출금되었습니다.");
		}
	}

	private void fileSave() { // 파일에 저장해주기 위해.
		OutputStream os = null; // 내보내는(저장시키는)기능 <-> InputStream
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] != null) {
					Account account = accountArray[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileOpen() {
		Reader is = null;
		try {
			is = new FileReader(file);
			int readByte = 0; // 파일에 있는 내용을 한바이트씩 읽어들임.
			StringBuffer sb = new StringBuffer(); // str += newstr; 안써도 append 통해 자동으로 더해줌.
			while ((readByte = is.read()) != -1) {
				System.out.print((char) readByte);
				sb.append((char) readByte);// 문자를 읽어와서 sb에 누적해서 담음.
			}
			String[] acnts = sb.toString().split("\n");
			for (int i = 0; i < acnts.length; i++) {
				String[] acnt = acnts[i].split(",");
				accountArray[i] = new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String scanString(String msg) {
		System.out.println(msg);
		String val = scanner.nextLine();
		return val;
	}

	public int scanInt(String msg) {
		System.out.println(msg);
		int val = scanner.nextInt();
		return val;
	}

}// class
