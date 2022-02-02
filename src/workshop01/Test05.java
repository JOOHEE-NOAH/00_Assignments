package workshop01;
/*[문제5]
화씨를 섭씨로 변경하는 프로그램을 작성 하시오.
C(celcius): 섭씨, F(fahrenheit): 화씨
공식: C = 5/9 * (F-32)

1. 구현 클래스
클래스명 메소드 설명
Test05 +main(String args[]): void main 함수 안에서 모든 코드 작업 진행

2. 실행 결과
출력은 아래와 같이 이루어 진다. 
Fahrenheit:100
Celcius:37.77778
*/

public class Test05 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ((float)fahrenheit-32)*5/9;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
