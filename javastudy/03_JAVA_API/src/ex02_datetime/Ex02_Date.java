package ex02_datetime;

import java.util.Date;

public class Ex02_Date {

	public static void main(String[] args) {
		
		// 클래스 명명 규칙             //중요
		// 패키지 다음에 마침표(.)를 적고 클래스명을 적는다.
		
		java.lang.System.out.println("Hello");
		//--------까지 생략 가능(나머지는 반드시 기입해야함.
		
		
		// 예외 규칙
		// java.lang 패키지에 소속된 클래스들은 패키지를 생략할 수 있다.

		//java.util 패키지의 Date 클래스
		// 1. java.util.Date                  -> 기존 방법 
		// 2. import java.util.Date;          -> 자동 완성 기능을 통해 2번 방법을 통요하여 사용
		//	  Date
		
		/////////////////////////////////
		
		// 클래스와 객체
		// 1. 클래스 : 객체를 만들기 위한 설계도
		// 2. 객체 : 클래스를 이용해서 만든 실제 객체
		// 3. 일반적인 생성 방법
		//    클래스 객체 = new 클래스();
		
		// 메소드 사용
		// 1. 클래스를 이용해서 호출
		//    System.out.println()
		//    System.currentTimeMillins()
		//    System.nanoTime()
		//    Math.random()
		
		// 2, 객체를 만들어서 호출
		//    String str = new String("Hello");      //클래스가 String, 객체가 str
		//	  str.equals("Hello")
		//	  Date now = new Date();       //클래스가 Date, 객체가 now
		//    now.getMonth()
		//	  StringBuilder sb = new Stringbuilder();       //클래스가 Stringbuilder, 객체가 sb
		//    sb.append()
		
		
		// Date 클래스와 now 객체
		Date now = new Date();                //Date 입력 후, 자동 완성 반드시 실행해야함.(java.util)
		System.out.println(now);
		
		
		
		
		
		
		
	}

}
