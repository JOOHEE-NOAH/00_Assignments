package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����10] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ�
����) ���� : M �̸� "����", ������ "����" 
     (���׿����� �̿�)

Input name: �鱹ȭ
Input gender: F
Input age:  25
Input tall: 173.3 

--���--
�̸� : �鱹ȭ
���� : ���� 
���� : 25��
���� : 173.3cm */
public class Test10_ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;
		double tall;
		char g='M';
		
		System.out.print("Input name: ");
		name=br.readLine();
		System.out.print("Input gender: ");
		gender=br.readLine().charAt(0);
		System.out.print("Input age: ");
		age=Integer.parseInt(br.readLine());
		System.out.print("Input tall: ");
		tall=Double.parseDouble(br.readLine());
		
		gender=(g=='M'||g=='m')?'��':'��';
		
		System.out.print("�̸� : "+name);
		System.out.print("\n���� : "+gender+"��");
		System.out.print("\n���� : "+age+"��");
		System.out.printf("\n���� : %.1fcm",tall);
	}

}
