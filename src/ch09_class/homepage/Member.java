package ch09_class.homepage;

public class Member {
	// 캡슐화 기반 국룰
	// 1. 모든 필드변수 private 처리
	
	private String memId;
	private String memPw;
	private String memName;
	
	// 2. 기본생성자와 풀생성자 추가
	public Member() {
		super();
	}
	
	public Member(String memId, String memPw, String memName) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
	}

	// 3. toString 추가
	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + "]";
	}
	
	
	// 4. Getters and Setters 추가
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}
	

	


	
}
