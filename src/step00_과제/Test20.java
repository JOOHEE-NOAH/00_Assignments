package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[���� 20] for���� �̿��ؼ� �������� ���Ͻÿ�
x���� �Է��Ͻÿ�: 2
y���� �Է��Ͻÿ�: 3

2�� 3���� 8�Դϴ�
*/
public class Test20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		
		System.out.print("x���� �Է��Ͻÿ�: ");
		x=Integer.parseInt(br.readLine());
		System.out.print("y���� �Է��Ͻÿ�: ");
		y=Integer.parseInt(br.readLine());
		
		int cal=x;
		
		for(int i=0;i<y-1;i++) {	
		 cal*=x;
		
			}
		System.out.println(x+"�� "+y+"���� "+cal+"�Դϴ�");
		}
		
	}


