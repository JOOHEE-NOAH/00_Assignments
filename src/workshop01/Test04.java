package workshop01;

/*[문제4]
 * 문자형 변수 ch가 영문자(대문자 또는 소문자)일 때만 변수 b의 값이 true가 되도록 프로그램
을 완성 하시오.

char ch = 'z';
boolean b = ;
System.out.println(b);

1. 구현 클래스
클래스명 메소드 설명
Test04 +main(String args[]): void main 함수 안에서 모든 코드 작업 진행

2. 실행 결과
출력은 아래와 같이 이루어 진다.
true*/
public class Test04 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch=='z'||ch=='Z');
		System.out.println(b);
	}

}
