package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����28] ���� ���α׷��� �ۼ��Ͻÿ�
(1)Argument�� ���� ���ڸ� �Է¹����� �Է¼��ڸ�ŭ �������迭�� �����
(2)�ֿܼ��� ���� �迭�� ����Ÿ�� �Է� �޴´�
(3)�Է¹��� ����Ÿ�� �����  ���Ѵ� 

[������]
$ java Test22  5

score[0]�� �Է��Ͻÿ� : 34.5
score[1]�� �Է��Ͻÿ�  : 90.4
     .
     .
score[4]�� �Է��Ͻÿ�  : 100.0

��� : 56.45               <--- �Ҽ��� �Ʒ� ��°�ڸ����� ���Ͻÿ�*/
public class Test28 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double n;
		int num=Integer.parseInt(args[0]);
		double sum=0;
		double avg=0;
	for(int i=0;i<num;i++) {
		System.out.print("score["+i+"]�� �Է��Ͻÿ� : ");
		n=Double.parseDouble(br.readLine());
		
		sum+=n;
		avg=sum/num;
	}	
		
		System.out.printf("��� : %.2f",avg);
		
			
			
			
		 
	}

}
