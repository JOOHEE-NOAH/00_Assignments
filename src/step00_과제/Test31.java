package step00_����;

/*[����31]������ ����/�ϼ��Ͻÿ�
(1)Ŭ������:Test31
     �ʵ�� : -base:double  (�ʱⰪ:5.0)
                 -height:double (�ʱⰪ:3.5)
     �޼����: +getArea():double
                   +getHypotenuse():double 
                   +getPerimeter():double
(2)����
   1)��  �� : �ﰢ���� ���� = (�غ� * ����) /2
                 �������� = Math.sqrt(�غ�*�غ�+����*����)  
                 �ѷ����� = �غ� + ���� + �������� 
   2) getArea()�� �ﰢ���� ���̸� �����Ѵ�
       getHypotenuse() ������ ���̸� �����Ѵ�
       getPerimeter()�� �ѷ����̸� �����Ѵ�
   3) main���� Test31���� ��ü ob�� �����Ѵ� 
           Sytem.out.println("�ﰢ���� ���� :" + ob.getArea());

[���ȭ��]
�ﰢ���ǳ��� : 8.75
�������� : 6.10
�ѷ����� : 14.60
*/
public class Test31 {
	private double base=5.0;
	private double height=3.5;
	
	public double getArea() {
		return (base*height)/2;
	}
	public double getHypotenuse() {
		return Math.sqrt(base*base+height*height);
	}
	public double getPerimeter() {
		return base+height+getHypotenuse();
	}
	public static void main(String[] args) {
		Test31 ob=new Test31();
		System.out.println("�ﰢ���� ���� : "+ob.getArea());
		System.out.printf("�������� : %.2f\n", ob.getHypotenuse());
		System.out.printf("�ѷ����� : %.2f\n", ob.getPerimeter());
	}

}
