package day01;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(100 + 100);
		System.out.println(1.123 + 3.456);   	// 실수 연산
		
		System.out.println("안녕" + "하세요");		// 문자 연산
		System.out.println("100" + 200);		// "100"은 문자로 인식해서 문자 연산으로 이어쓰기 해진다.
		
		System.out.println("안녕" + 100 + 100);  // 연산자 우선순위에 따라 문자와 숫자를 연산하면 두 개를 문자로 만들고
								// 다시 문자와 숫자의 연산으로 두 개를 문자로 연산해서 안녕100100으로 출력한다.
		System.out.println("안녕" + (100 + 100)); // 가로로 묶어서 숫자 연산을 먼저해서 200을 만들고 문자와 숫자의 연산으로 
								// 안녕200으로 출력한다.

	}
}
