package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����15] 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷�
�����߻�) 
          1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����
          2. �� import java.util.Random;
             �� Random ����1 = new Random();
             �� int ����2 = ����1.nextInt(�ִ밪); 
                      ==>  0 ~ (�ִ밪 - 1)������ ������ ��

[������]

*** ������ �߻��Ͽ����ϴ�.���߾� ������.*** 
���� �Է� : 50
��ǻ���� ���ڰ� �� Ů�ϴ�.

���� �Է� : 90
��ǻ���� ���ڰ� �� �۽��ϴ�.
 :
 :

���� �Է� : 83
��ī��ī...xx������ ���߼̽��ϴ�. 
�ٽ� �ұ��(Y/y): n

**���� �ϼ̽��ϴ� **
*/
public class Test15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		char ck;
		
		
		
	do {System.out.println("*** ������ �߻��Ͽ����ϴ�.���߾� ������.***");
	 	int a=(int)(Math.random()*100);// 0 - 99 ������ ����
	 	System.out.println(a);
		do {
			System.out.print("���� �Է� : ");
		num=Integer.parseInt(br.readLine());
		if (num>a) {
			System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�.");
		}else if(num<a) {
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�.");
		} else {
			System.out.println("��ī��ī...xx������ ���߼̽��ϴ�.");
			break;
			
		}
		
		} while(num<a||num>a); {
					
		}
				System.out.print("�ٽ� �ұ��?(y/Y) ");
				ck=br.readLine().charAt(0);				
		}while(ck=='y' || ck=='Y');
			System.out.println("***** �����ϼ̽��ϴ� *****");
			System.exit(0);
}
}
