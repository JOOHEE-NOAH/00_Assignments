package step00_����;

import java.util.Iterator;
import java.util.Random;

/*
 * [����14] 50���� ������ ���� ������ ���� ����Ͻÿ�
����1) 0 - 100 ������ �� �ϰ�
����2) 1�ٿ� 6���� ǥ���Ͻÿ�  

--���--
12      72      74      0       20      89
84      83      53      0       95      53
68      55      89      6       20      68
17      9       75      56      17      85
62      33      7       34      85      28
28      55      95      31      69      22
30      92      1       16      88      80
64      55      71      12      29      72
20      41
��=2420
*/
public class Test14 {

	public static void main(String[] args) {
	
	int cnt=0;
	
	for(int num=1;num<=50;num++) { //�̰��� �ϴ� �ڷ��� �������ϱ�
		System.out.print((int)(Math.random()*101+0)+"\t");
	
		// ���ٿ� n���� ǥ���ϱ�:n���� ������ �������� 0 
		cnt++;
		if (cnt%6==0) {
			System.out.println();
		}
	}
	}

}
