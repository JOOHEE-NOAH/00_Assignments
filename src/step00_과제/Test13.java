package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����13]������ �Է¹޾� ����/��� ���ϱ�
(����) �翬���� 4�� ������ �������� �ϰ�
           ������ 100���� ������ �������� �ʾƾ���
��Ǵ� ������ 400���� ������ �������� ��
(����) 4(����), 100(���), 400(����)�� 

--���--
���� �Է� : 2000
����

���� �Է� : 2001
���

���� �Է� : 2004
����*/
public class Test13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int year;
		 
		System.out.print("���� �Է� : ");
		year=Integer.parseInt(br.readLine());
		
		
		if (year%4==0 && year%100!=100 || year%400==0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		
	}

}
