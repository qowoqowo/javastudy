package ch07_array;

import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ArrayMain2 {
	
	public static void main(String[] args) {
		String[] seoyugi = new String[4];
		
		seoyugi[0] = "삼장";
		seoyugi[1] = "오공";
		seoyugi[2] = "사오정";
		seoyugi[3] = "저팔계";
		
		System.out.println(seoyugi);
		
		// ArrayMain 클래스 안에 만들어 놓은 printArray 메소드 사용
		ArrayMain.printArray(seoyugi);
		
		// 배열의 복사
		String[] sinSeoyugi = seoyugi;
		
		ArrayMain.printArray(sinSeoyugi);
		
		sinSeoyugi[0] = "강호동";
		sinSeoyugi[1] = "이수근";
		
		// 신서유기 배열 확인
		ArrayMain.printArray(sinSeoyugi);
		
		// 서유기 배열 확인
		ArrayMain.printArray(seoyugi);
		
		// @ 앞은 객체의 타입
		// @ 뒤는 객체의 메모리 주소(hashCode)를 16진수로 나타낸 것 
		System.out.println(seoyugi);
		System.out.println(sinSeoyugi);
		
		// 메모리 주소(hashCode)
		System.out.println(seoyugi.hashCode());
		System.out.println(sinSeoyugi.hashCode());
		
		// 숫자를 16진수로 변환
		System.out.println(Integer.toHexString(seoyugi.hashCode()));
		
		// 해쉬코드 hashCode
		// 객체의 메모리 주소값을 이용해서 
		// 해쉬를 적용한 코드
		
		// 해쉬 hash
		// 해쉬함수(암호화 알고리즘)를 이용해서
		// 데이터를 암호화하는 기법 (SHA 도 그 중 하나)
		
		// 암호화, 복호화를 사용하는 것은 어렵지 않다.
		
		// Base64로 문자열 인코딩 (암호화는 아님)
		Encoder base64Encoder = Base64.getEncoder();
		String password = "1q2w3e4";
		
		// 문자열을 byte 배열(byte[])로 변환
		byte[] passByte = password.getBytes();
		
		// byte[] 을 인코딩 -> byte[] 리턴
		byte[] encodeByte = base64Encoder.encode(passByte);
		
		// byte[]을 String로 변환
		String encryption = new String(encodeByte);
		
		System.out.println(encryption);
		
		// 디코딩
		Decoder base64Decoder = Base64.getDecoder();
		byte[] decodeByte = base64Decoder.decode(encryption);
		String decryption = new String(decodeByte); 
		System.out.println(decryption);
		
		
		System.out.println("\n===========================\n");
		
		// 올바른 배열 복사
		String[] synSeoyugi = seoyugi.clone();
		
		ArrayMain.printArray(seoyugi);
		ArrayMain.printArray(synSeoyugi);
		
		synSeoyugi[2] = "은지원";
		
		ArrayMain.printArray(synSeoyugi);
		ArrayMain.printArray(seoyugi);
		
		System.out.println(synSeoyugi.hashCode());
		System.out.println(seoyugi.hashCode());
		
		
		// clone을 모른다면?
		String[] newSeoyugi = new String[seoyugi.length];
		
		// newSeoyugi의 각 인덱스에 
		// seoyugi의 각 인덱스 값을 넣으면 됨
		for(int i = 0; i < seoyugi.length; i++) {
			newSeoyugi[i] = seoyugi[i];
		}
		
		ArrayMain.printArray(newSeoyugi);
		
		System.out.println("\n==========================\n");
		
		int[] numArray = {23, 456, 213, 32, 464, 1, 2};
		
		// 인덱스 0번과 인덱스 1번 값의 위치를 바꾸기
		int temp = numArray[0];
		numArray[0] = numArray[1];
		numArray[1] = temp;
		
		ArrayMain.printArray(numArray);
		
		// 자리를 바꾸는 메소드
		swap(numArray[2], numArray[6]);
		
		ArrayMain.printArray(numArray);
		
		swap(numArray, 2, 6);
		
		ArrayMain.printArray(numArray);
		
		
		System.out.println("\n==============================\n");
		
		// 배열을 정렬하기
		// 정렬 알고리즘 - 버블정렬, 선택정렬, ...
		
		// 배열에 대해 
		// [456, 23, 2, 32, 464, 1, 213]

		// index 0과 1 비교
		// index 1과 2 비교
		// index 2와 3 비교 ...
		// index 5와 6 비교 (length가 7일때)
		// 비교할때마다 왼쪽이 오른쪽보다 큰지 체크
		// 왼쪽이 더 크다면 자리교체
		
		// 6번 반복 실행 시키면 정렬이 완료
		for(int k = 0; k < numArray.length - 1; k++) {
			for(int i = 0; i < numArray.length - 1 - k; i++) {
				// i = 0, 1, 2, 3, 4, 5
				// numArray[i] > numArray[i+1] : 왼쪽이 클때 자리바꿈 (오름차순)
				// numArray[i] < numArray[i+1] : 왼쪽이 작을때 자리바꿈 (내림차순)
				if(numArray[i] < numArray[i+1]) {
					int tp = numArray[i];
					numArray[i] = numArray[i+1];
					numArray[i+1] = tp;
				}
			}
		}
		
		ArrayMain.printArray(numArray);
		 
		
		// 쉽게 정렬하기
		// Arrays.sort() 괄호 안에 정렬하고자 하는 배열 넣기
		Arrays.sort(numArray);
		
		// 오름차순 정렬이 됨
		ArrayMain.printArray(numArray);
		
		// 오름차순을 해주는 Arrays.sort()를 이용하여 내림차순
		// 1. numArray의 모든 요소에 -1을 곱함
		// 2. Arrays.sort(numArray) 로 오름차순 정렬
		// 3. numArray의 모든 요소에 -1을 곱함
		// [456, 23, 2, 32, 464, 1, 213]
		// 1. [-456, -23, -2, -32, -464, -1, -213]
		// 2. [-464, -456, -213, -32, -23, -2, -1]
		// 3. [464, 456, 213, 32, 23, 2, 1]
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = numArray[i] * -1;
		}
		
		ArrayMain.printArray(numArray);
		
		Arrays.sort(numArray);
		
		ArrayMain.printArray(numArray);
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = numArray[i] * -1;
		}
		
		ArrayMain.printArray(numArray);
		
		System.out.println("\n============================\n");
		
		// 다차원 배열
		// [-456, -23, -2, -32, -464, -1, -213] = 1차원 배열
		
		// 복권
		// 5천원 -> 복권번호가 5줄
		// 로또번호 = 1줄 [1, 4, 7, 12, 23, 43]
		
		// 로또구매 = 5줄 [1, 4, 7, 12, 23, 43]
		//				  [1, 4, 7, 12, 23, 43]
		// 				  [1, 4, 7, 12, 23, 43]
		//  			  [1, 4, 7, 12, 23, 43]
		// 				  [1, 4, 7, 12, 23, 43]
		
		int[] lottoOne = {1, 4, 7, 12, 23, 43};
		
		int[][] lottoTwo = {   {1, 4, 7, 12, 23, 43}  
							 , {2, 4, 7, 12, 24, 43}  
							 , {3, 4, 7, 12, 23, 43}  
							 , {4, 5, 7, 21, 23, 43}
							 , {5, 6, 7, 12, 23, 43}  };
		
		// 2차원 배열 lottoTwo의 인덱스 1번 -> 1차원 배열 
		int[] lotto = lottoTwo[1];
		
		ArrayMain.printArray(lotto);
		
		// 2차월 배열 내 하나의 값만 꺼내기
		// 24 -> 인덱스 1번 배열 내 인덱스 4번에 존재
		int num = lottoTwo[1][4];
		System.out.println(num);
		
		System.out.println(lottoTwo[3][3]);  // 21
		
		// 3차원 배열
		int[][][] lottoThree = { { {1, 4, 7, 12, 23, 43}  
								 , {2, 4, 7, 12, 24, 43}  
								 , {3, 4, 7, 12, 23, 43}  
								 , {4, 5, 7, 21, 23, 43}
								 , {5, 6, 7, 12, 23, 43} } ,
				
								{ {1, 4, 7, 12, 23, 43}  
								 , {2, 4, 7, 12, 24, 43}  
								 , {3, 4, 7, 12, 23, 45}  
								 , {4, 5, 7, 21, 23, 43}
								 , {5, 6, 7, 12, 23, 43} } ,
								
								{ {1, 4, 7, 12, 23, 43}  
								 , {2, 4, 7, 12, 24, 43}  
								 , {3, 4, 7, 12, 23, 43}  
								 , {4, 5, 7, 21, 23, 43}
								 , {5, 6, 7, 12, 23, 43} } };
								 
		System.out.println(lottoThree[1][2][5]);
		
		
		// 이미지 데이터
		int[][] image2D = { {1, 0, 0, 0, 0, 0, 1}, 
							{0, 1, 0, 0, 0, 1, 0}, 
							{0, 0, 1, 0, 1, 0, 0},
							{0, 0, 0, 1, 0, 0, 0},
							{0, 0, 1, 0, 1, 0, 0},
							{0, 1, 0, 0, 0, 1, 0},
							{1, 0, 0, 0, 0, 0, 1} };
		
		// image2D 의 데이터를 1차원 배열에 순서대로 담기
		// [1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, ... ]
		System.out.println(image2D.length);  // 7
		System.out.println(image2D[0].length);  // 7
		
		int[] image1D = new int[49];
		
		// image1D[0]  = image2D[0][0]
		// image1D[1]  = image2D[0][1]
		// image1D[2]  = image2D[0][2]
		// image1D[3]  = image2D[0][3]
		// image1D[4]  = image2D[0][4]
		// image1D[5]  = image2D[0][5]
		// image1D[6]  = image2D[0][6]
		// image1D[7]  = image2D[1][0]
		// image1D[8]  = image2D[1][1]
		// image1D[9]  = image2D[1][2]
		// image1D[10] = image2D[1][3]
		// image1D[11] = image2D[1][4]
		// image1D[12] = image2D[1][5]
		// image1D[13] = image2D[1][6]
		// image1D[14] = image2D[2][0]
		// image1D[15] = image2D[2][1]
		// ...
		// image1D[48] = image2D[6][6]
		int idx = 0;
		for(int i = 0; i < 7; i++) {
			// i = 0, 1, 2, 3, 4, 5, 6
			for(int k = 0; k < 7; k++) {
				// k = 0, 1, 2, 3, 4, 5, 6
				image1D[idx] = image2D[i][k];
				idx++;
			}
		}
		
		ArrayMain.printArray(image1D);
		
		
	}  // main
	
	
	// Call by Reference를 고려하여 swap 메소드 만들기
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
	}
	
	
	public static void swap(int numA, int numB) {
		int temp = numA;
		numA = numB;
		numB = temp;
	}
	
	
	
	
	
	
	
	
	
}
