package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����29] ���� ���α׷��� �ۼ��Ͻÿ�   
(1) BufferedReader�� �̿��Ͽ� �ֿܼ��� �Է¹޴´�
(2) �̸�, ����....�� ���� �迭�� 3���� ���� �Է� �޴´�
      


[������]
�̸��� �Է��Ͻÿ� : ȫ�浿     <---name[0]�濡 �Է¹޴´�
���̸� �Է��Ͻÿ� : 20          <---age[0]�濡 �Է¹޴´�

�̸��� �Է��Ͻÿ� : �ε鷡
���̸� �Է��Ͻÿ� : 21

�̸��� �Է��Ͻÿ� : ������
���̸� �Է��Ͻÿ� : 52

ȫ�浿     20��
�ε鷡   21��
������   52��*/
public class Test29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] name=new String[3];
		int[] age=new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			name[i]=br.readLine();
			System.out.print("���̸� �Է��Ͻÿ� : ");
			age[i]=Integer.parseInt(br.readLine());
			
		}
	
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"\t"+age[i]+"��");
		}
	}

}
