package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����8] ���� �Է¹޾� 0���� �۰ų� 100���� ũ�� "�Է¿���!!"  ���
(if���� ||�����ڸ� �̿��Ͻÿ�)

�����Է��Ͻÿ� : 120
�Է¿���!!

�����Է��Ͻÿ� : 55
�ԷµȰ� : 55*/
public class Test08_ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int score;
		System.out.print("�����Է��Ͻÿ� : "); score=Integer.parseInt(br.readLine());
		if (score<0 || score>100) { System.out.println("�Է¿���!!");
		}
		else {
			
			System.out.print("�ԷµȰ� : "+score); 
		}
	}

}
