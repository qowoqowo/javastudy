package ch09_class.pokemon;

// 포켓몬을 정의내리는 클래스
// 각 포켓몬은 이름, 도감번호, 타입, 분류 값이 존재 
// (= 객체의 속성, 상태)
public class Pokemon {
	// 객체의 속성에 대한 부분을 필드변수에 선언
	String name;		/* 포켓몬의 이름 */
	int no;			/* 도감번호 */
	String type;		/* 타입 (물, 불, 전기, ...) */
	String species;		/* 분류 (쥐, 꼬마거북, 도롱뇽. ...) */
	
	// 기본 생성자는 보이지 않으나 존재하는 상태임
	// 다른 생성자가 존재할 때, 기본 생성자 또한 필요하다면 별도로 작성
	public Pokemon() {
		
	}
	
	// 단축기 [Alt + Shift + S] - Generate Constructor using Fields
	// 필드변수의 갯수 만큼 파라미터가 존재
	// 모든 필드변수의 값을 파라미터로 입력 받을 수 있는 생성자 (= 풀 생성자)
	// 별도로 생성자를 만들면 안보이지만 존재했던 기본 생성자가 사라짐
	public Pokemon(String p_name, int no, String type, String species) {
		// 생성자 내에서 p_name 값은 파라미터로 들어온 값
		// 필드변수 name에 파라미터로 들어온 p_name 값 넘겨주기
		name = p_name;
		
		// this 는 해당 객체를 의미
		// this.no 는 객체에 .찍고 필드변수 no에 접근한 것과 같다.
		this.no = no;
		this.type = type;
		this.species = species;
	}
	
	
	
	
	// toString() 메소드 만들기
	// 단축키 [Art + Shift + S] - toString() 클릭
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", no=" + no + ", type=" + type + ", species=" + species + "]";
	}

	
	
	
}
