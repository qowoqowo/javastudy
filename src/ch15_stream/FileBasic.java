package ch15_stream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileBasic {
	public static void main(String[] args) {
		// 현재 자바 프로젝트의 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		// window 는 경로가 \ 로 구분
		// mac, linux는 경로마다 / 로 구분
		String srcPath = path + "\\src";
		
		srcPath = path + File.separatorChar + "src";
		System.out.println(srcPath);
		
		// src 폴더를 자바에서 File 객체로 불러오기
		// File 객체는 폴더랑 파일 모두 불러오기
		File src = new File(srcPath);
		
		// File 객체의 toString은 해당 File 객체가
		// 바라보고 있는 파일/폴더의 풀경로를 리턴한다.
		System.out.println(src);
		
		// File이 바라보고 있는 파일/폴더가 폴더인지 확인
		System.out.println(src.isDirectory());
		
		// 해당 File 객체가 폴더를 바라보고 있다면
		// 폴더 내에 있는 파일들의 목록을 배열로 꺼낼 수 있음
		File[] fileArray = src.listFiles();
		
		for(int i = 0; i < fileArray.length; i++) {
			System.out.println(fileArray[i]); // 풀경로
		System.out.println(fileArray[i].getName()); // 파일명만 출력
		}
		
		System.out.println(fileArray[0]);
		
		// fileArray[0] = ch01_start 폴더
		// 그 안에 있는 HelloWorld.java 파일 가져오기
		File hello = new File(fileArray[0] + "\\HelloWorld.java");
		System.out.println(hello);
		
		// 존재하지 않는 경로의 파일명에 대해서도 File 객체는 만들어진다.
		File faker = new File(fileArray[0] + "\\faker.java");
		System.out.println(faker);
		
		
		// File 객체가 실제로 존재하는 파일을 바라보고 있는지 확인
		System.out.println(hello.exists());
		System.out.println(faker.exists());
		
		// 파일에 대한 정보 보기
		// .length() 파일 크기 리턴(byte)
		// 1 KB = 1024 byte
		// 1 MB = 1024 KB
		// 1 GB = 1024 MB
		// 1 TB = 1024 GB
		System.out.println(hello.length());
		
		// .lastModfied()
		// 마지막 수정 날짜
		System.out.println(hello.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		System.out.println(sdf.format(hello.lastModified()));
		
		// 존재하지 않는 파일은 0 리턴
		System.out.println(faker.length());
		System.out.println(faker.lastModified());
		
		// 파일 생성
		try {
			faker.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// File 객체를 통해 폴더 만들기
		// src 폴더에 files 폴더 만들기
		File filesFolder = new File(srcPath + "\\files");
		
		// mkdir = make directory 를 의미
		filesFolder.mkdir();
		
		
		System.out.println("\n==============================================\n");
		
		ArrayList<String> stuList = new ArrayList<>();
		
		stuList.add("재민");
		stuList.add("동희");
		stuList.add("주형");
		stuList.add("효신");
		stuList.add("경희");
		stuList.add("건우");
		stuList.add("상욱");
		
		// src\files 폴더 내부에
		// stuList 내 학생 이름으로 구성된 폴더들을 만들어보기
		for(int i = 0; i < stuList.size(); i++) {
			String stuPath = srcPath + "\\files\\" + stuList.get(i);
			File stuFile = new File(stuPath);
			stuFile.mkdir();
		}
		
		
		// 각 학생 폴더 내부에 id.txt 파일을 하나씩 만들어보기
		for(int i = 0; i < stuList.size(); i++) {
			String idPath = srcPath + "\\files\\" + stuList.get(i) + "\\id.txt";
			File idFile = new File(idPath);
			try {
				idFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
