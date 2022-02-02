package workshop01;

/*
[ 문제 6 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 
변수 선언이 아래와 같이 되어 있을 때 실행 결과와 같이 출력 될 수 있도록 프로그램 하시오.

1. 구현 클래스
클래스명 메소드 설명
Test06 +main(String args[]): void main 함수 안에서 모든 코드 작업 진행

2. 실행 결과
출력은 아래와 같이 이루어 진다. 
c=30
ch=C
f=1.5
l = 27000000000
result=true

*/
public class Test06 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = 30;
		char ch = 'A';
		ch ='C' ;
		float f =1.5f;
		long l = 27000000000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2 ;
		
		  System.out.println("c="+c); 
		  System.out.println("ch="+ch);
		  System.out.println("f="+f); 
		  System.out.println("l="+l);
		  System.out.println("result="+result);
		  
		 
		 
	}

}
