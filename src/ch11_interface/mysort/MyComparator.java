package ch11_interface.mysort;

public interface MyComparator<T> {
	
	// MyComparator 를 생성할때 MyComparator<T> 안에
	// 입력된 객체의 타입이 메소드의 파라미터 타입 T에 적용된다.
	boolean myCompare(T left, T right);
	
	
	
	
}
