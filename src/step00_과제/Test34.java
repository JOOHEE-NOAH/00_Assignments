package step00_����;

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
		int max=num[0];
		int min=num[0];
		
		
		for(int i=0;i<num.length;i++) {
		num[i]=(int)(Math.random()*50+1);
		System.out.println("num["+i+"]="+num[i]);
		}
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i])}
			}
		}
		
	}

}
