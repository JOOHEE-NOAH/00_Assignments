package workshop01;

/*[ 문제 3 ] 다음과 같은 조건을 만족하는 프로그램을 완성 하시오. 
 * 다음과 같이 변수가 선언 되어 있을 때 실행 결과가 100의 자리만 남기고 
 * 나머지 자릿수는 0으로 바꾸는 프로그램을 완성 하시오.

class Test03 {
public static void main(String[] args) {
int num = 456;
int result = ;
System.out.println(result);
}
}

1. 구현 클래스
클래스명 메소드 설명
Test03 +main(String args[]): void main 함수 안에서 모든 코드 작업 진행

2. 실행 결과
출력은 아래와 같이 이루어 진다.
400
*/
public class Test03 {

	public static void main(String[] args) {
		int num = 456;
		int result =(num/100)*100 ;
		System.out.println(result);
	}

}
