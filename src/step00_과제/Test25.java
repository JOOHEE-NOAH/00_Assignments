package step00_����;

/*[���� 25] argument���� �����͸� �޾� ���α׷��� �����Ͻÿ�
(1) main() �޼���
              :
     System.out.println("���ϱ�: "+sum(x,y));
     System.out.println("����: "+sub(x,y));
     System.out.println("���ϱ�: "+multi(x,y));
     System.out.printf("������: %.2f\n", divi(x,y));

(2)��.��� ȭ��
$ java Test25  5 3 

���ϱ� : 8
��  �� : 2
���ϱ� : 15  
������ : 1.67*/
public class Test25 {
	public static int sum(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int multi(int x, int y) {
		return x*y;
	}
	
	private static double divi(int x, int y) {
		return (double)x/y;
	}
	
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		System.out.println("���ϱ�: "+sum(x,y));
	     System.out.println("����: "+sub(x,y));
	     System.out.println("���ϱ�: "+multi(x,y));
	     System.out.printf("������: %.2f\n", divi(x,y));
	}


}
