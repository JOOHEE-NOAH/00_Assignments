package step00_과제;

import java.util.Arrays;

/*[문제 34] 크기가 5인 정수형배열을 만들고 난수(1~50)를 저장하여 출력하시오

[결과화면]
-정렬 전-
num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25

-정렬 후-
num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
합 = 156*/
public class Test34 {

	public static void main(String[] args) {
		int [] num=new int[5];
		
		for(int i=0;i<num.length;i++) {
		num[i]=(int)(Math.random()*50+1);
		System.out.println("num["+i+"]="+num[i]);
		}
		Arrays.sort(num);
		for(int i: num) {
		System.out.println("num["+i+"]="+num[i]);
		}
			}
		
		
	}


