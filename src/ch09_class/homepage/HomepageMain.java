package ch09_class.homepage;

import java.util.Scanner;

public class HomepageMain {
	public static void main(String[] args) {
		
		// 회원가입, 로그인, 회원목록
		// 회원 : 아이디, 비밀번호, 닉네임
		
		// 회원가입을 할때마다 새로운 Member 객체 생성
		// 생성된 Member 객체들을 ArrayList<Member> 에 담가서 처리
		// ArrayList<Member> 를 관리하는 MemberDB 객체를 만들어서 사용
		// MemberDB라는 객체는 딱 하나만 생성해서 사용
		// -> MemberDB 클래스에 싱글톤(Singleton) 패턴 적용
		
		// 싱글톤을 적용한 MemberDB에 대해 객체 생성 불가능
//		MemberDB memDB = new MemberDB();
		
//		MemberDB memDB = MemberDB.instance; // 302호
//		MemberDB.instance = null;
		
		MemberDB memDB = MemberDB.getInstance(); // 302호
		BoardDB boardDB = BoardDB.getInstance(); // 402호
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
			System.out.print(">>> ");
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 회원가입
				System.out.print("아이디 입력: ");
				String id = scan.nextLine();
				
				System.out.print("비밀번호 입력: ");
				String pw = scan.nextLine();
				
				System.out.print("닉네임 입력: ");
				String name = scan.nextLine();
				
				// 사용자가 입력한 값에 대한 Member 객체 생성
				Member mem = new Member(id,pw,name);
				
				// MemberDB 객체 내 memList 에 Member 객체를 담는 
				// 메소드를 추가
				memDB.insertMember(mem);
				
			}else if (command == 2) {
				// 로그인
				System.out.print("아이디 입력: ");
				String id = scan.nextLine();
				
				System.out.print("비밀번호 입력: ");
				String pw = scan.nextLine();
				
				// MemberDB 객체 내 memList에 담긴 Member 객체 중
				// 사용자가 입력한 id, pw와 일치하는 memId,memPw 가 
				// 있다면 해당 Member 객체를 가져옴
				Member login = memDB.login(id,pw);
				
				if(login != null) {
					System.out.println("로그인 성공");
					System.out.println(login.getMemName() + "님 환영합니다.");
					
					while(true) {
						// 게시판 - 글목록, 글쓰기, 글보기, 로그아웃
						// BoardDB 내 boardList 객체들 출력
						boardDB.showBoardList();
						
						System.out.println("행동을 선택해주세요.");
						System.out.println("1. 글쓰기 | 2. 글보기 | 3. 로그아웃");
						System.out.print(">>> ");
						int select = Integer.parseInt(scan.nextLine());
						
						if(select == 1) {
							// 글쓰기
							System.out.print("글 제목 입력: ");
							String title = scan.nextLine();
							
							System.out.println("글 내용 입력: ");
							String content = scan.nextLine();
							
							// 글번호? - x
							// 작성자? - login.getMamNane()
							Board bo = new Board(0, title, content, login.getMemName());
							boardDB.insertBoard(bo);
							
							
						}else if (select == 2) {
							// 글보기
							System.out.println("글 번호 입력: ");
							int no = Integer.parseInt(scan.nextLine());
							
							boardDB.readBoard(no);
						}else if(select == 3) {
							// 로그아웃
							break;
						}
						
						
						
						
					}
					
					
					
					
				}else {
					System.out.println("유효하지 않은 아이디 혹은 비밀번호 입니다.");
				}
				
				
				
			}else if(command == 3) {
				// 회원목록
				// MemberDB 객체 내 memList에 담긴 Member 객체들을 조회
				memDB.showMemList();
				
				
			}else if(command == 4) {
				// 종료
				break;
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
