package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����30] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

(1) main()���� �迭������ �ڵ带 �ϼ��Ͻÿ�
      int []month={31,28,31,30,31,30,31,31,30,31,30,31};
 (2)�ֿܼ��� ��(month)�� �Է¹޾� �ش��ϴ� ��(day)�� ����Ͻÿ�

[������]
���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.
*/
public class Test30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m;
		int []month={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("���ϴ� month�� �Է��Ͻÿ� : ");
		m=Integer.parseInt(br.readLine());
		System.out.println(m+"���� "+month[m-1]+"���Դϴ�.");
		
	}

}
