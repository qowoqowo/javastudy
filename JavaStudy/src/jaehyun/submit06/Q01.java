package jaehyun.submit06;

public class Q01 {
	public static void main(String[] args) {
		String[] nameArray = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};

		int count = 0;
		for(int i = 0; i < nameArray.length; i++) {
//			if(nameArray[i].substring(0, 1).equals("이")) {
//				count++;
//			}
			if(nameArray[i].indexOf("이") == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
