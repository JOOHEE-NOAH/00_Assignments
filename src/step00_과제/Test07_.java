package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����7] BufferedReader�� �̿��Ͽ� �Է¹޾� �μ��� ū���� ����Ͻÿ�
(��, �񱳿����� ���׿����ڸ� �̿��Ͻÿ�)
a�� �Է��Ͻÿ� : 5
b�� �Է��Ͻÿ� : 13

ū�� : 13*/
public class Test07_ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,x;
		
		System.out.print("a�� �Է��Ͻÿ� : "); a=Integer.parseInt(br.readLine());
		System.out.print("b�� �Է��Ͻÿ� : "); b=Integer.parseInt(br.readLine());
		
		x=(a>b)? a:b;
		
		System.out.println("ū�� : "+x);
	}

}
