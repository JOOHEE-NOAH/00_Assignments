package step00_����;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [����18] �ַܼ� �Է¹޾� �������� ���Ͻÿ� (���� for��)
�̶�, 5���� �Է��ϸ� 5��,6�� ����Ͻÿ�
        4���� �Է��ϸ� 4��,5�� ����Ͻÿ�
���� �Է��Ͻÿ�: 5
5 * 1= 5                6 * 1= 6
5 * 2= 10              6 * 2= 12 
5 * 3= 15              6 * 3= 18
5 * 4= 20              6 * 4= 24
5 * 5= 25              6 * 5= 30 
5 * 6= 30              6 * 6= 36
5 * 7= 35              6 * 7= 42
5 * 8= 40              6 * 8= 48
5 * 9= 45              6 * 9= 54
*/
public class Test18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.print("���� �Է��Ͻÿ�: ");
		num=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+"= "+(num*i));
		}
		
	}

}
