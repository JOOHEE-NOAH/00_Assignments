package step00_����;

import java.util.Arrays;

/*[���� 34] ũ�Ⱑ 5�� �������迭�� ����� ����(1~50)�� �����Ͽ� ����Ͻÿ�

[���ȭ��]
-���� ��-
num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25

-���� ��-
num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
�� = 156*/
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


