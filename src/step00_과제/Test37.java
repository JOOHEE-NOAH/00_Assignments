package step00_����;

import java.util.Scanner;

/*[����37] �������α׷��� �ϼ��Ͻÿ�  
(1) Ŭ������: Shape
        +area:double         ==> ����(�ﰢ��, ��ٸ���, ��)�� ���ϴ� �Ǽ�������
        +PI:double             ==> �ʱ갪=3.141592 , final (�� ���� �ȵ�)
      
        +Shape()
        +menu():int   
                          ȭ�� (***��������*** 1.�ﰢ�� 2.�� .....)�� �ۼ��Ѵ�. 
                          ���� �Է¹ް�, �Է� ���� ������ main()���� �ٽ�
                          circle/triangle/trapezoid�Լ��� ȣ���Ұ�(switch���̿� )

         +circle():void            ==>�������� �Է¹ް�, ���ǳ��� �������  ����Լ�(output)ȣ��
         +triangle():void        ==>�غ�,���̸� �Է¹޾�,�ﰢ���ǳ��̸� �������  ����Լ�(output)ȣ��
         +trapezoid():void   ==>�Ʒ���,����,�����Է¹ް�,��ٸ����� ���� �������  ����Լ�(output)ȣ��
         +output():void 
(2) Test37Ŭ������ main()����
      Shape ob=new Shape();
      int n=0;
      while(true){
            n=ob.menu();
            switch(n){
                   case 1:  ob.circle();           break;
                   case 2:  ob.triangle();        break;
	     case 3:  ob.trapezoid();     break;
	     case 4: System.exit(0);
             }	
      }

**** �������� *****
1. �ﰢ��
2. ��
3. ��ٸ���
4. ����
���� : 3

**** ��ٸ��ó��� ****     <== ��ٸ���=(�Ʒ���+����)*����/2
�Ʒ���: 2
��  ��: 3
��  ��: 4
���� : ?   <---�Ҽ����� 2°�ڸ�����


**** �������� *****
1. �ﰢ��
2. ��
3. ��ٸ���
4. ����
���� : 3

**** �ﰢ���� ���� ****
�غ� : 3
���� : 5
���� : 7.5


**** �������� *****
1. �ﰢ��
2. ��
3. ��ٸ���
4. ����
���� : 4

�����մϴ�^.^
  */
class Shape{ 
	public double area;
	public final double  PI=3.141592;
	//���� ��� �޼ҵ忡�� scanner�� �ߺ����� �����->���� ��ĳ�ʸ� ������ �������ش�.
	Scanner sc=new Scanner(System.in);
	public Shape() {

		
	}
	
	public int menu() {
		System.out.print("\n**** �������� *****\n1. ��\n2. �ﰢ��\n3. ��ٸ���\n4. ����\n���� : ");
	return sc.nextInt();
	}
	public void circle() {
		System.out.print("**** ������ ****\n ������:");
		double r=sc.nextDouble();
		area=r*r*PI;
		
		output();
	}         
	public void triangle() {		
		System.out.println("**** �ﰢ���� ���� ****");
		System.out.print("�غ� : ");
		double base=sc.nextDouble();
		System.out.print("���� : ");
		double height=sc.nextDouble();
		area=base*height/2;
		
		output();
	}         
	public void trapezoid() {
		System.out.println("**** ��ٸ����� ���� ****");
		System.out.print("�Ʒ��� : ");
		double base=sc.nextDouble();
		System.out.print("��  �� : ");
		double top=sc.nextDouble();
		System.out.print("���� : ");
		double height=sc.nextDouble();
		area=(base+top)*height/2;
		
		output();
	}
	public void output() {
		System.out.printf("���� : %.2f\n",area);
		
	}        
}



public class Test37 {

	public static void main(String[] args) {
		Shape ob=new Shape();
	      int n=0;
	      while(true){
	            n=ob.menu();
	            switch(n){
	                   case 1:  ob.circle();           break;
	                   case 2:  ob.triangle();        break;
	                   case 3:  ob.trapezoid();     break;
	                   case 4: 	System.out.println("\n�����մϴ�^.^");
	                	   		System.exit(0);
	             }	
	      }
	}

}
