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
//������ ������ ����(����) �� �������� ���ϸ� ��ü�ϴ� �۾�->�ٽ� �� ��ü�ƴ��� �ݺ�. 
	public static void main(String[] args) {
		int [] num=new int[5];	
		int sum=0;
		System.out.println("-���� ��-");
		
		for(int i=0;i<num.length;i++) {
		num[i]=(int)(Math.random()*50+1);
		System.out.println("num["+i+"]="+num[i]);
		}
		System.out.println("\n-���� ��-");
		//�����ϴ� �ڵ�
		int tmp=0;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {//j:���ϴ� ����, i��°�� ������->��+1
				//���� �ٲٴ� �ڵ�
				tmp=num[i]; //������ ���� �ٲܶ��� tmp�� �̸� �� 1�� �ű��.
				num[i]=num[j];
				num[j]=tmp;}
		}
		 Arrays.sort(num);
		 
		for(int i=0;i<num.length;i++) {
				System.out.println("num["+i+"]="+num[i]);
			
		}
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		
		System.out.println("\n�� = "+sum);
		
	}
}
		
		
	
	

			
		
		
	


