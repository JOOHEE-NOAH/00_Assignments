package workshop01;

/*[문제1]다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
 * 본인의 주민번호를 정수형 변수에 선언 하고 이를 화면에 출력 하시오.

1. 구현 클래스
클래스명 메소드 설명
Test01 +main(String args[]): void 
main 함수 안에서 모든 코드 작업 진행

2. 실행 결과
출력은 아래와 같이 이루어 진다.
나의 주민번호:8310202182637
*/
public class Test01 {

	public static void main(String[] args) {
		long num=9403302008934L; // type int is out of range 에러발생: long 변수=숫자L;사용
		System.out.println("나의 주민번호:"+num);
		
	}

}
