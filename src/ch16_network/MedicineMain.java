package ch16_network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MedicineMain {
	public static void main(String[] args) throws IOException {
		// 1. medicine.txt 파일 읽어오기
		String path = System.getProperty("user.dir");
		String txtPath = path + "\\src\\files\\medicine.txt";

		BufferedReader buffReader = new BufferedReader(new FileReader(txtPath));

		ArrayList<Medicine> mediList = new ArrayList<>();

		while (true) {
			// 하나의 데이터에 대한 문자열
			String line = buffReader.readLine();

			if (line == null || line.isEmpty()) {
				break;
			}

			// 자바 객체로 생성
			// Medicine {itemSeq, entpName, itemName, efcyQesitm}
			// ﻿197700189|일양약품(주)|일양노이겔현탁액(규산알루민산마그네슘)|이 약은 위산과다 위ㆍ십이지장염 위염의 제산작용 및 증상의 개선에
			// 사용합니다.
			String[] mediArray = line.split("\\|");

			if (mediArray.length != 4) {
				continue;
			}

			Medicine medi = new Medicine();
			medi.setItemSeq(mediArray[0]);
			medi.setEntpName(mediArray[1]);
			medi.setItemName(mediArray[2]);
			medi.setEfcyQesitm(mediArray[3]);

			mediList.add(medi);

		}
		buffReader.close();

		// 사용자에게 증상을 입력받아서
		// 해당 증상에 복용하면 좋은 의약품의 회사명과 의약품명 출력

		/*
		 * 
		 * 증상 입력: 감기
		 * 
		 * 의약품 목록 ========
		 * 
		 * 경동제약 게보린
		 * 경동제약 게보린 
		 * 경동제약 게보린 
		 * 경동제약 게보린
		 * 
		 * ================
		 * 
		 * 증상 입력: 우웩
		 * 
		 * 의약품 목록 =======
		 * 
		 * 해당 증상에 맞는 의약품이 존재하지 않습니다.
		 * 
		 */
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("증상 입력: ");
			String sick = scan.nextLine();
			
			boolean isContain = false;
			for (int i = 0; i < mediList.size(); i++) {
				if (mediList.get(i).getEfcyQesitm().contains(sick)) {
					isContain = true;
				}
			}
			
			if(!isContain) {
				System.out.println("해당 증상에 맞는 의약품이 존재하지 않습니다.");
				break;
			}
			
			
			System.out.println("\n의약품 목록 ========\n");
			
			for (int i = 0; i < mediList.size(); i++) {
				if (mediList.get(i).getEfcyQesitm().contains(sick)) {
					System.out.println(mediList.get(i).getEntpName() 
							+ " | " + mediList.get(i).getItemName());
					
				} 
				
			}
			System.out.println("============================");
		}
		
		
		// 4700개 가량 의약품 데이터 mediList
		// entpName 을 토대로
		// 각 회사별로 의약품이 몇개 존재하는지 체크
		
		// 1. 동화약품(주) : 312개
		// 2. 신신제약(주) : 103개
		// 3. 삼진제약(주) : 80개
		// ...
		
		// 회사이름들을 종류별로 확보
		HashSet<String> entpSet = new HashSet<>();
		
		for(int i = 0; i < mediList.size(); i++) {
			entpSet.add(mediList.get(i).getEntpName());
		}
		
		// 동화약품(주), 신신제약(주), 삼진제약(주), ....
		// 238 개의 회사
		System.out.println(entpSet.size());
		
		// 동화약품, 30
		// 신신제약, 40
		// Entp 클래스 
		// 필드변수 name, count
		ArrayList<Entp> entpList = new ArrayList<>();
		
		for( String name : entpSet) {
			entpList.add(new Entp(name, 0));
		}
		
		// 각 Entp 객체의 회사명에 대해 mediList 안에 
		// 해당 회사명이 몇개 들어있는지 카운트해서 
		// Entp 객체 내 count에 반영
		for(int i = 0; i < entpList.size(); i++) { // 238
			String name = entpList.get(i).getName();
			
			int count = 0;
			for(int k = 0; k < mediList.size(); k++) { // 4700
				if(name.equals(mediList.get(k).getEntpName())) {
					count++;
				}
				
			}
			entpList.get(i).setCount(count);
		}
		
		for(int i = 0; i < entpList.size(); i++) {
			System.out.println(entpList.get(i));
		}
		
		
		Collections.sort(entpList, (entpA, entpB) -> entpB.getCount() - entpA.getCount());
		
		for(int i = 0; i < entpList.size(); i++) {
			System.out.println((i+1) + ". " + entpList.get(i));
		}
		
		
		


	}

}
