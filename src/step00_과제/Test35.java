package step00_����;

/*[���� 35] ���� �������� �Է¹޾� ���̸� ����ϰ� ����Ͻÿ�
(1)Ŭ������: Circle
        -r:int                          ==> �������� ������ ����������
       -PI:double                   ==> �ʱⰪ=3.141592 , finalŰ����

       +Circle()                      ==> Scanner�̿��ؼ� �Է¹�����
       +process():double        ==> ���ǳ��̸� ����ؼ� ����
       +output():void             ==> ����� ���
(2) main()����
       Circle ob=new Circle();
       ob.output();
       */
import java.util.Scanner;

class Circle{
	private int r;
	private final double PI= 3.141592;
	
	public Circle() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ� : ");
		r=sc.nextInt();
	}
	public double process() {
		return r*r*PI;
	}
	public void output() {
		System.out.printf("���� ���� : %.1f",process());
	}
}
public class Test35 {

	public static void main(String[] args) {
		Circle ob=new Circle();
		ob.output();
}
}
