package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����9] �Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ����ϰ�
�ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ����Ͻÿ�
�׿��� �����̸� "�Էµ���Ÿ����"��� ǥ���Ͻÿ�
(if-else�� �̿�)   

Input Character: A     
result : a

Input Character: a
result : A

Input Character: *
�Էµ����� ����*/
public class Test09_ {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char x;
		System.out.print("Input Character: ");
		x=br.readLine().charAt(0);
		if (x=='A') {
			System.out.println("result : a");	
		} else if (x=='a') {
			System.out.println("result : A");
		}else {
			System.out.println("�Էµ����� ����");}
	}

}
