package jaehyun.submit16;

import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		String[] splitStr = strBooks.split(",");
		for(int i = 0; i <splitStr.length; i++) {
			splitStr[i].trim();
		}
		ArrayList<BookDB> strList = new ArrayList<>();
		ArrayList<Book> bookList = new ArrayList<>();
		
		Book book = new Book();
		for(int i = 0; i <splitStr.length; i++) {
			book.setName(splitStr[i]);
			book.setNo(i+1);
			book.setRent(true);
			bookList.add(book);
		}
		
		
		BookDB bookDB = BookDB.getInstance();
		for(int i = 0; i <splitStr.length; i++) {

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
