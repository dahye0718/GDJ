package ex02_datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_SimpleDateFormat {

	public static void main(String[] args) {
		
		// java.text.SimpleDateFormat 클래스
		// 패턴이 적용된 String 타입의 날짜 반환
		
		Date date1 = new Date();     //ctrl로 util패키지 선택
		java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());	 //ctrl로 sql패키지 선택(import가 되지 않음.), 상단의 util타입
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
		
		String result1 = sdf.format(date1);
		String result2 = sdf.format(date2);
		
		System.out.println(result1);
		System.out.println(result2);

		
		}

}
