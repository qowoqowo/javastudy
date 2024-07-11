package ch09_class.homepage;

import java.util.ArrayList;

// Member 객체들을 관리하는 객체
public class MemberDB {
	
	private ArrayList<Member> memList = new ArrayList<>();
	
	// 싱글톤(Singleton) 패턴 적용
	// 1. 기본생성자를 private 처리
	private MemberDB() {
		// memList에 기본 Member 객체 넣기
		memList.add(new Member("a001","123a","호빵맨"));
		memList.add(new Member("b001","123b","찐빵맨"));
		memList.add(new Member("c001","123c","꿀빵맨"));
	}
	
	// 2. 기본생성자를 이용하여 필드변수에 
	// 	  자기자신을 객체(instance)로 생성
	// 2.1. static 을 추가해서 MemberDB에 대해 객체 생성없이
	// 	   생성된 instance에 접근 하도록 함
	// 2.2. 다른 클래스에서 수정하지 못하도록 
	//      private 설정 후 instance에 대한 getter 만 생성 
	private static MemberDB instance = new MemberDB(); // 302호
	
	// 3. 필드 instance에 대한 getter 생성
	public static MemberDB getInstance() {
		return instance;
	}
	
	
	// 회원가입시 Member 객체를 memList에 추가하는 메소드
	// 파라미터 mem 으로 들어온 Member 객체의 아이디가 (memId)
	// memList 에 존재하는 Member 객체의 아이디와 중복되는지 체크
	// 중복되면 회원가입 불가 출력 (memList.add 실행 X)
	// 중복되지 않으면 "회원가입 성공" 출력 (memList.add 실행)
	public void insertMember(Member mem) {
		
		// 중복 체크 스위치
		boolean isDuple = false;
		
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).getMemId().equals(mem.getMemId())) {
				// 중복되는 경우
				isDuple = true;
			}
		}
		
		if(isDuple) {
			System.out.println("중복된 아이디 입니다.");
		}else {
			System.out.println("회원가입 성공");
			memList.add(mem);
		}
		
	}
	
	// 회원목록 보기하면 memList 내 Member 객체 보여주기
	public void showMemList() {
		for(int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}
	
	// 로그인 시 파라미터 id, pw와 일치하는 Member 객체를 찾아 리턴
	public Member login(String id, String pw) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).getMemId().equals(id)
					&& memList.get(i).getMemPw().equals(pw)) {
				return memList.get(i);
			}
		}
		
		// 유효하지 않은 아이디 혹은 패스워드
		return null;
		
	}
	
	
	
	
	
	
	
}
