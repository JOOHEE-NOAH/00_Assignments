package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����11]2���� ���ڿ� �����ڸ� �Է��Ͽ� ����Ͻÿ�
����1) �Ǽ��ΰ��� �Ҽ����� 2°�ڸ����� ����Ͻÿ�
����2) �����ڰ� +,-,*,/ �̿��� ���ڰ� ������ 
       "������error"����Ͻÿ�

[������]
$ java  Test11   25  36    <-- args�Է�
�����ڸ� �Է�(+,-,*,/) : +  <-- �ܼ��Է�(BufferedReader�� �̿�)
25 + 36 = 71

$ java  Test11   25  36
�����ڸ� �Է�(+,-,*,/) : /
25 / 36 = xx.xxxxx      

java  SwitchExam   25  36
�����ڸ� �Է�(+,-,*,/) : #
������ error*/
public class Test11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		double y=(double)a/(double)b;
		char x;
		System.out.print("�����ڸ� �Է�(+,-,*,/) : " );
		x=br.readLine().charAt(0);
		
		if (x=='+') {
			System.out.print(a+" "+"+"+" "+b+" = "+(a+b));
		} else if (x=='-') { 
			System.out.print(a+" "+"-"+" "+b+" = "+(a-b));
		} else if (x=='*') {
			System.out.print(a+" "+"*"+" "+b+" = "+(a*b));
		}else if (x=='/') {
			System.out.printf(a+" / "+b+" = %.5f",y);
			
		} else {System.out.println("������ error");}
		

	}
		}
