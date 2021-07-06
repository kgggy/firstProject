package co.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
//		Dao dao = new OracleDao();
		Dao dao = new MysqlDao();

		dao.insert();
		dao.update();
		dao.delete();

		// sqlite, postgreSQL, .. 쓸때마다 클래스로 선언하지 않고 익명으로 구현하는 부분만 만들기(일회성)
		Dao dao2 = new Dao() {
			@Override
			public void insert() {
				System.out.println("sqlite 입력처리.");
			}

			@Override
			public void update() {
				System.out.println("sqlite 수정처리.");
			}

			@Override
			public void delete() {
				System.out.println("sqlite 삭제처리.");
			}

		};

		dao2.insert();
		dao2.update();
		dao2.delete();
		
		dao2 = new Dao() {
		@Override
		public void insert() {
			System.out.println("postgreSQL 입력처리.");
		}

		@Override
		public void update() {
			System.out.println("postgreSQL 수정처리.");
		}

		@Override
		public void delete() {
			System.out.println("postgreSQL 삭제처리.");
		}

	};

	dao2.insert();
	dao2.update();
	dao2.delete();
		// 인터페이스는 유지보수에 편리
//	dao = new MysqlDao();
	}
}
