package step00_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[���� 27]�ֿܼ��� ���� �Է¹ް� �޼��带 ȣ���ؼ� ���α׷��� �����Ͻÿ�.
(BufferedReader�� �̿�)
(1)�����
�ݾ� = ���� * �ܰ�
(2)ó������
��main�޼��� ���� ǰ��� ����, �ܰ��� �Է� �����ÿ�
��compute() �޼���� ���� �����Ͽ� ���� ����Ͻÿ�
��޼��� ���� : +compute(item, qty, price):void 
             (+ �� public�̶�� �ǹ���)
(3) ��.���ȭ��
ǰ���� �Է��Ͻÿ� : apple         <----main()���� ó��
������ �Է��Ͻÿ� : 10
�ܰ��� �Է��Ͻÿ� : 1200

ǰ�� : apple                            <---compute()���� ó��
�ݾ� : 12000��*/
public class Test27 {
	
	public static void compute(String item, int qty, int price) { 
		System.out.println("ǰ�� : "+item);
		System.out.println("�ݾ� : "+(qty*price)+"��");
		
	}
		
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String item;
		int qty;
		int price;
		
		System.out.print("ǰ���� �Է��Ͻÿ� : ");
		item=br.readLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		qty=Integer.parseInt(br.readLine());
		System.out.print("�ܰ��� �Է��Ͻÿ� : ");
		price=Integer.parseInt(br.readLine());
		
		System.out.println();
		
		compute(item,qty,price);
		
		
		
	}

}
