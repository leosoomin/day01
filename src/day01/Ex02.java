package day01;

public class Ex02 {
	public static void main(String[] args) {
		// System.out.println(100 \n); 			문자열로 묶여있지 않을 때(숫자일때)는 ESCAPE문자 사용 X
		System.out.println("100\n200\n300");
		System.out.println("이수민 \n오광석");
		
		System.out.println("이수민 \t오광석");		// \t : 스페이스바 8칸 정도가 텝 크기이다.
		System.out.println("1\t1234567\t12345678\t1");
		System.out.println("이름\t나이");
		System.out.println("=============");
		System.out.println("홍길동\t20살");
		System.out.println("김개똥\t30살");
		System.out.println("-------------");
		
		
		System.out.println("\"이수민");		// \" : 큰 따옴표 표현. (경로같은걸 지정할 때 사용)
		//	E:\1.31 개강 핀테크 이수민\eclipse-java\workspace-java -> 이 경로 지정하는거 표현 할 때
		System.out.println("\"E:\\1.31 개강 핀테크 이수민\\eclipse-java\\workspace-java\"");
		System.out.println("E:\\1.31 개강 핀테크 이수민\\eclipse-java\\workspace-java");
		System.out.println("\"이수민\"");
		System.out.println("\\이수민");
		System.out.println("\\이수민\\");
	}
}
