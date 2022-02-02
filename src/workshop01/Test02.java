package workshop01;

/*[ 문제 2 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
 * 변수 선언이 아래와 같을 때 실행 결과와 같이 출력 될 수 있도록 프로그램 완성 하시오.
ascii 값 ‘A’ -> 65
ascii 값 ‘B’ -> 66
ascii 값 ‘1’ -> 49
ascii 값 ‘2’ -> 50

*1 구현 클래스
클래스명 메소드 설명
Test02 +main(String args[]): void main 함수 안에서 모든 코드 작업 진행

2. 실행 결과
출력은 아래와 같이 이루어 진다.
12
true
131
51
99
*/
public class Test02 {

	public static void main(String[] args) {

			String s1 = "1";
			String s2 = "2";
			boolean bnx = false;
			char c1 = 'A';
			char c2 = 'B';
			char c3 = '1';
			char c4 = '2';
			int inx = 2;
			System.out.println(s1+s2 );
			System.out.println( );
			System.out.println( c1+c2);
			System.out.println(c4+1 );
			System.out.println(c3+c4);
			
			
			
	}

}
