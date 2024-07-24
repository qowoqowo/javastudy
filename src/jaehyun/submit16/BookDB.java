package jaehyun.submit16;

import java.util.ArrayList;


public class BookDB {
	
	
	private ArrayList<Book> bookList = new ArrayList<>();

	private BookDB() {
	}
	
	private static BookDB instance = new BookDB();
	
	public static BookDB getInstance() {
		return instance;
	}
	
	public void insertBook(Book book) {
		
		for(int i = 0; i < bookList.size(); i++) {
			bookList.add(book);
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
