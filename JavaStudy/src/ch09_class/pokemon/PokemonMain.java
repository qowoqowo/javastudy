package ch09_class.pokemon;

import java.util.ArrayList;

import ch09_class.school.Student;

public class PokemonMain {

	public static void main(String[] args) {
		// 포켓몬스터 카드 뽑기
		
		// 포켓몬 <- 객체를 바라보고 사용했다
		
		
		// 포켓몬
		// 즉, 포켓몬 객체는 이름, 도감번호, 타입, 분류 가 존재
		// 이상해씨, No.0001, 풀, 씨앗포켓몬 -> 객체 
		// 파이리, No.0004, 불, 도룡뇽포켓몬 -> 객체 
		// 꼬북이, No.0007, 물, 꼬마거북포켓몬 -> 객체
		// ...
		
		// 모든 포켓몬들을 담고 있는 리스트
		// 리스트에 포켓몬 객체들이 들어가야 한다.
		// 포켓몬 객체를 사용하기 위해 
		// 포켓몬 객체에 대해 "클래스"로 정의를 내려야 한다.
		
		// 포켓몬 객체는 (이름, 도감번호, 타입, 분류)에 대해 클래스로 만들기
		
		// 클래스명? -> Pokemon
		// 이름 -> String name
		// 도감번호 -> int no
		// 타입 -> String type
		// 분류 -> String species
		
		// Pokemon 클래스로부터 객체 생성
		Pokemon seed = new Pokemon();
		
		// ch09_class.pokemon.Pokemon@5aaa6d82
		System.out.println(seed);
		
		// 생성된 객체의 속성(= 필드변수)에 접근
		// seed 라는 Pokemon 객체 내 name 값을 꺼냄
		System.out.println(seed.name);
		
		// 필드 변수에 값을 담아주지 않으면
		// 생성된 객체의 필드변수들은 기본값(default)을 가지고 있음
		// 숫자: 0, boolean: false, 참조타입: null
		
		System.out.println(seed.no);
		
		
		// 필드 변수에 값 담기
		seed.name = "이상해씨";
		seed.no = 1;
		seed.type = "풀";
		seed.species = "씨앗";
		
		System.out.println(seed);
		
		System.out.println(seed.name);
		System.out.println(seed.no);
		System.out.println(seed.type);
		System.out.println(seed.species);
		
		// 새로운 Pokemon 객체
		Pokemon pylee = new Pokemon();
		
		pylee.name = "파이리";
		pylee.no = 2;
		pylee.type = "불";
		pylee.species = "도룡뇽";
		
		
		// 객체를 println 안에 넣었을 때
		// 필드변수값들을 한번에 보고자 한다면
		// 해당 객체의 클래스 내부에 toString 메소드를 만들어주면 된다.
		// pringln 에 참조타입 객체를 넣으면 
		// 객체의 toString() 실행 결과가 출력 된다.
		// toString() 을 우리가 별도로 만들지 않으면 (Override)
		// 기본적으로 @232g231 형태가 출력된다.
		System.out.println(pylee);
		
		// 세번째 객체 생성
		Pokemon turtle = new Pokemon();
		
		turtle.name = "꼬북이";
		turtle.no = 3;
		turtle.type = "물";
		turtle.species = "꼬마거북";
		
		System.out.println(turtle);
		
		System.out.println("\n============================\n");
		
		
		// 필드변수 값을 부여하면서 객체 생성 (= 별도의 생성자가 필요)
		// new Pokemon(); 에서 Pokemon() 을 생성자(Constructor) 라고 함
		// Pokemon() 와 같이 파라미터를 입력받지 않는 생성자를 기본 생성자라고 함
		
		Pokemon pica = new Pokemon("피카츄", 4, "전기", "쥐");
		
		System.out.println(pica);
		
		Pokemon cater = new Pokemon("캐터피", 5, "벌레", "애벌레");
		Pokemon pijon = new Pokemon("피죤", 6, "비행", "새");
		
		
		// 객체들을 리스트에 담기
		// Pokemon 객체를 담는 ArrayList
		// 자동 임포트 단축키 Ctrl + Shift + o
		ArrayList<Pokemon> pokeList = new ArrayList<>();
		
		pokeList.add(seed);
		pokeList.add(pylee);
		pokeList.add(turtle);
		pokeList.add(pica);
		pokeList.add(cater);
		// 객체를 생성하자마자 리스트에 담는방법
		pokeList.add(new Pokemon("피죤",6,"비행","새"));
		
		System.out.println(pokeList);
		
		
		// 카드 뽑기!!
		// 랜덤한 하나의 포켓몬 객체 뽑아서 출력
		// pokeList <- 포켓몬 객체 6개 들어있음
		// 6개인경우 -> 인덱스 0~5 -> 0~5 랜덤 숫자 생성
		
		
		
		Student hobbang = new Student("호빵맨",90,90,90,90);
		// 필드변수 kor의 접근제어자에 default 이므로
		// 다른폴더인 PokemonMKain에서 해당 필드변수에 접근할수 없음
//		System.out.println(hobbang.name);
		
		
		
		
		
		
		
		
		
	}

}
