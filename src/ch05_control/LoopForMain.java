package ch05_control;

public class LoopForMain {
	
	public static void main(String[] args) {
		// 반복문(loop) - for문
		
		// 콘솔창에 1부터 10까지 출력
		System.out.println(11);
		System.out.println(12);
		System.out.println(13);
		System.out.println(14);
		System.out.println(15);
		System.out.println(16);
		System.out.println(17);
		System.out.println(18);
		System.out.println(19);
		System.out.println(20);
		
		int one = 11;
		System.out.println(one++);  // 1 -> 2
		System.out.println(one++);  // 2 -> 3
		System.out.println(one++);
		System.out.println(one++);
		System.out.println(one++);
		System.out.println(one++);
		System.out.println(one++);
		System.out.println(one++);
		System.out.println(one++);
		System.out.println(one++);
		
		System.out.println("\n==============================\n");
		
		// for( 초기화식 ; 조건식 ; 증감식 )
		// 초기화식에는 for문의 반복횟수를 결정해주는 "변수 선언"
		// 조건식에는 for문이 실행되는 조건을 지정 (조건이 true일때만 실행)
		// 증감식에는 for문이 반복될때마다 "변수"의 증감을 지정
		
		// for문을 이용하여 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 초기화식의 변수는 for문 내에서 선언된 것으로
		// for문 밖에서 사용불가 (변수의 스코프)
//		System.out.println(i);
		
		
		// for문을 이용하여 11부터 20까지 출력
		for(int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
		
		// i는 단순히 변수명이므로 다른 변수명을 써도 된다.
		for(int hello = 11; hello <= 20; hello++) {
			System.out.println(hello);
		}
		
		// 변수 i는 for문의 반복횟수 결정하는 역할이 메인
		// 꼭 for문 내에 i를 쓸 필요는 없다.
		// 동일한 코드 10번 반복 실행
		one = 1;
		for(int i = 0; i < 10; i++) {  // 10번 반복 실행되는 for문
			System.out.println(one++);
		}
		
		System.out.println("\n===========================\n");
		
		// 1부터 20까지 더한 값?
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			// i 는 1,2,3,4, ... ,20
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		// 1부터 20까지 중에 짝수끼리만 더한 값?
		sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// ...
		// 2 x 9 = 18
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (i * 2));
		}
		
		System.out.println("\n============================\n");
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		// 위의 코드를 for문을 이용하여 같은 결과가 출력되도록 만들기
		
		// println이 5번 반복 실행되는 상황 -> 5번 반복되는 for문 생성
		// 반복이 될때마다 *이 하나씩 늘어난 상태가 출력 -> 변수가 필요
		String star = "";
		for(int i = 0; i < 5; i++) {
			// i 는 0,1,2,3,4 총 5번 반복 실행
			star += "*";
			System.out.println(star);
		}
		
		// 초기화식, 조건식, 증감식 응용한 버전
		for(String s = "*"; s.length() <= 5; s += "*") {
			System.out.println(s);
		}
		
		System.out.println("\n=============================\n");
		
		// 나머지 연산자 % 의 사용 예시
		// for문 내에서 순환하는 숫자에 대해 사용하면 좋다.
		
		// 국수 공장에서 면을 100cm 뽑고 있다.
		// 국수를 5cm 마다 자른다.
		for(int i = 0; i < 100; i++) {  // 20번 반복
			System.out.println("|||||||| " + i);
			
			// i가 4, 9, 14, ... 일때 컷팅
			// 4, 9, 14, 19, 24, ... -> 규칙 발견하기
			// 각 숫자들은 5로 나눴을때 나머지가 4인 숫자들
			if(i == 4 || i == 9 || i == 14 || i == 19) {
				System.out.println("--------");
			}
			
			// 나머지 연산자 적용
			if(i % 5 == 4) {
				System.out.println("--------");
			}
		}
		
		System.out.println("\n===============================\n");
		
		// 라면 공장에서 면을 40cm 뽑고 있는데
		// 6cm마다 잘라주어야 한다.
		/*
		  //////// 0
		  \\\\\\\\ 1
		  //////// 2
		  \\\\\\\\ 3
		  //////// 4
		  \\\\\\\\ 5
		  --------
		  //////// 
		*/
		
		for(int i = 0; i < 40; i++) {
			// 홀짝 판별 조건에 대한 if문
			if(i % 2 == 0) {
				System.out.println("////////" + i);
			}else {
				System.out.println("\\\\\\\\\\\\\\\\" + i);
			} 
			
			// i가 5, 11, 17, 23, 29, ... 일때 컷팅
			// i를 6으로 나눈 나머지가 5인 숫자들
			// 조건을 체크하는 목적이 다른 경우 if문을 분리한다.
			if(i % 6 == 5) {
				System.out.println("--------");
			}
		}
		
		System.out.println("\n===========================\n");
		
		// 10부터 1까지 출력
		// 초기화식, 조건식, 증감식 응용
		for(int i = 10; i >= 1 ; i--) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}
		
		System.out.println("\n===========================\n");
		
		// for문으로 String을 가지고 놀기 
		
		// 숫자형 문자열에서 각 자리수를 더한 결과 얻기
		String strExample = "312432323";
		
		sum = 0;
		// strExample의 글자수만큼 반복적으로 substring과 Integer.parseInt를 함
		// 1. strExample의 글자수만큼 반복되는 for문 만들기
		for(int i = 0; i < strExample.length(); i++) {
			// i 는 0,1,2,3,4, ...
			// i 가 0일때 substring(0, 1)
			// i 가 1일때 substring(1, 2)
			// i 가 2일때 substring(2, 3)
			// 규칙발견!! substring(i, i+1)
			String strNum = strExample.substring(i, i+1);  // 매번 한글자 자름
			
			// String -> int 변환
			int num = Integer.parseInt(strNum);
			sum += num;
		}
		
		System.out.println(sum);
		
		
		// 슈의 갯수는?
		String syusyu = "ㅅ슈ㅠ슈슈슈슛ㅅ슛슈슈슈";
		
		// syusyu에서 "슈"가 몇글자 들어가있는지 세어보기
		// 1. syusyu의 글자수만큼 반복되는 for문 생성
		// 2. for문이 반복될때마다 syusyu를 한글자씩 자른다.
		// 3. 자른 글자가 "슈"와 일치하는지 비교
		// 4. 일치한다면 카운팅
		
		int count = 0;
		for(int i = 0; i < syusyu.length(); i++) {
			// 2.
			String syu = syusyu.substring(i, i+1);
			System.out.println(syu);
			
			// 3.
			System.out.println(syu == "슈");
			System.out.println(syu.equals("슈"));
			System.out.println(System.identityHashCode(syu));
			System.out.println(System.identityHashCode("슈"));
			if(syu.equals("슈")) {
				// 4.
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println("\n============= break =================\n");
		
		// break
		// 반복문을 종료시키는데 사용
		
		// 내 이름을 유니코드로 표현한다면?
		// 유니코드는 세상 모든 문자를 0~65000 숫자에 매칭시켜놓은걸 의미
		
		char target = 0;
		
		// 정 = 51221 
		// 찬 = 52268 
		// 웅 = 50885
		for(int i = 0; i < 65000; i++) {
			if(target == '웅') {
				// 일치할때의 번호 찾기 (목적 달성)
				System.out.println(i);
				// 목적을 달성했으니 더이상 for문이 실행될 필요가 없음
				// 컴퓨터가 break문을 실행하면 가까운 반복문(for, while)
				// 하나를 즉시 종료한다.
				break;
			}
			target++;
		}
		
		
		// continue
		// 반복문 내에서 continue문이 실행되면
		// 바로 다음 반복문으로 넘어간다.
		
		// 구구단 출력하는데 1,2,3 은 출력 안한다.
		for(int i = 1; i <= 9; i++) {
			if(i < 4) {
				// 컴퓨터가 continue문을 실행하면 
				// 바로 다음 증감식, 조건식 실행하러 감
				// continue 아래에 있는 코드는 실행되지 않음
				continue;
			}
			
			System.out.println("2 x " + i + " = " + (i * 2));
		}
		
		System.out.println("\n==================================\n");
		
		// 구구단 출력
		// (이중 for문)
		
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// ...
		// 2 x 9 = 18
		// -----------
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 3 = 9
		// ...
		// 3 x 9 = 27
		// -----------
		// 9 x 1 = 9
		// 9 x 2 = 18
		// 9 x 3 = 27
		// ...
		// 9 x 9 = 81
		
		for(int left = 2; left <= 9; left++) {
			// left = 2, 3, 4, 5, 6, 7, 8, 9
			System.out.println(left + "단 -------");
			
			for(int right = 1; right <= 9; right++) {
				// right = 1 ~ 9
				System.out.println(left + " x " + right + " = " + (left * right));
			} 
			
			System.out.println("-----------");
		}
		
		
		/*
		 * 디버깅(Debug) 모드 (이클립스 기준)
		 * 
		 * 코드를 한줄 한줄 실행해보면서 문제점을 찾는 방법
		 * 
		 * 디버깅 하고자 하는 코드의 시작부분에
		 * 코드라인 좌측 파란띠 부분을 더블클릭하여
		 * breakpoint를 만든다. [Ctrl + Shift + B]
		 * 
		 * 디버깅 실행
		 * 상단 벌레 모양 버튼 클릭 [단축키 F11]
		 * 디버깅 모드에 적합한 화면(Perpective) 전환 여부
		 * 코드들이 위에서부터 실행 되다가
		 * breakpoint가 있는 지점에 멈춰서 대기를 한다.
		 * 
		 * 이후 상단의 Run - Step over [단축키 F6]
		 * 을 실행하면 한줄한줄 실행이 된다.
		 * (for문 내부 i 같은 변수 상황을 일일히 확인 가능)
		 * 
		 * 디버깅 모드 종료는 빨간 중지 버튼(Terminate)
		 * [Ctrl + F2]
		 * 
		 * 이후 원래 화면으로 돌아오려면 우측 상단에서
		 * Java Perspective 클릭
		 * 
		 * (for문 안에 println만 잘 이용하면 굳이 디버깅 할 필요없음)
		 * 
		 */
		
		System.out.println("\n==================================\n");
		
		// 트리 (반쪽)
		//     *
		//    **
		//   ***
		//  **** 
		// *****
		
		// println이 5번 실행
		System.out.println("    *");  // i=0 일때 공백 4개, 별 1개  
		System.out.println("   **");  // i=1 일때 공백 3개, 별 2개
		System.out.println("  ***");  // i=2 일때 공백 2개, 별 3개
		System.out.println(" ****");  // i=3 일때 공백 1개, 별 4개
		System.out.println("*****");  // i=4 일때 공백 0개, 별 5개
		
		// 규칙을 찾아서 for문으로 구현
		for(int i = 0; i < 5; i++) {
			// i = 0, 1, 2, 3, 4
			// ? = 4, 3, 2, 1, 0
			// ? = 1, 2, 3, 4, 5
			
			// 공백 생성
			String blank = "";
			for(int k = 0; k < 4 - i; k++) {
				blank += " ";
			}
			
			// 별 생성
			String stars = "";
			for(int k = 0; k < i + 1; k++) {
				stars += "*";
			}
			
			System.out.println(blank + stars);
		}
		
		
		// 트리
		//     *		
		//    ***
		//   *****
		//  *******
		// *********
		
		for(int i = 0; i < 5; i++) {
			// i = 0, 1, 2, 3, 4
			// ? = 1, 3, 5, 7, 9
			
			// 공백 생성
			String blank = "";
			for(int k = 0; k < 4 - i; k++) {
				blank += " ";
			}
			
			// 별 생성
			String stars = "";
			for(int k = 0; k < (2*i) + 1; k++) {
				stars += "*";
			}
			
			System.out.println(blank + stars);
		}
		
		
		
		
		
		
		
	}
	
}
