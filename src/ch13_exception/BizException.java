package ch13_exception;

// 우리가 만든 에러 클래스
public class BizException extends Exception{
	
	// 에러 코드에 대한 필드변수 추가
	private String errCode;

	
	public BizException() {
		super();
	}


	public BizException(String message, String errCode) {
		super(message);
		this.errCode = errCode;
	}
	
	
	public String getErrCode() {
		return errCode;
	}

}
