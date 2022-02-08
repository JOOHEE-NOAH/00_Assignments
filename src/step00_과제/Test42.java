package step00_����;

import java.util.Scanner;

/*[���� 42] ���� ���α׷��� �ϼ��Ͻÿ�  ==> ��������
(1)Ŭ������ : Health
      +gender:char        (����)
      +tall:double          (����)
      +weight:double     (ü��)
      +Health()
      +input():void          - ����, ����, ü���� �Է¹޴´�
      +output():String     - ����, ����, ü���� ���ڿ��� ����� �����Ѵ�

(2)Ŭ����(Test42) ���� Health�� ��ӹ���
        -fat:double            (�񸸵�)
        -result:String         (�����)
        +Test42()
        +calculate():void      - �񸸵��� ����Ͽ� ���(��ü��,�浵��....)�� ���Ѵ�
        +output():String      - ����� ���ڿ��� ����� �����Ѵ�

(3) ǥ��ü�߰���
    ���� : ǥ��ü�� = (����-100)*0.9
    ���� : ǥ��ü�� = (����-100)*0.85

    �񸸵� = ����ü��(Kg)/ǥ��ü��(Kg)*100
    ---------------------------------------------------------
    90%����  : ��ü��               121-130% : �浵��
    91 -110% : ����(ǥ��ü��)   131-150% : �ߵ���
    111-120% : ��ü��              150%     : ����
(4) Test42Ŭ���� main()���� �Ʒ��ڵ带 �ۼ��Ѵ�(�� �̻� �ڵ�� �߰����� �ʴ´�)
     Test42 ob=new Test42();
     System.out.println(ob.output());

[���ȭ��]
   ����(M/F)�� �Է��Ͻÿ�: M               <---��(M) / ��(F)
   ����(Cm)�� �Է��Ͻÿ�: 175.3
   ü��(Kg)�� �Է��Ͻÿ�: 95.45

   **�񸸵� ���� ���**
   ����: M 
   ����: 175.3Cm
   ü��: 95.45Kg
   ���: ����� �񸸵� 140.84�̰�  �ߵ��� �Դϴ�.*/
class Health{
	public char gender;
	public double tall,weight;
	
	public Health() {
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����(M/F)�� �Է��Ͻÿ�: ");
		gender=sc.nextLine().charAt(0);
		System.out.print("����(Cm)�� �Է��Ͻÿ�: ");
		tall=sc.nextDouble();
		System.out.print("ü��(Kg)�� �Է��Ͻÿ�: ");
		weight=sc.nextDouble();
	}
	public String output() {
		return "**�񸸵� ���� ���**\n����: "+gender+"\n����: "+tall+"Cm\nü��: "+String.format("%.2f", weight)+"Kg";
	}
}

public class Test42 extends Health {
	private double fat;
	private String result;
	
	public Test42() {
		
	}
	public void calculate() {
		super.input();
		double st=0;
		switch(gender) {
		case 'm':
		case 'M': st=(tall-100)*0.9; 
		case 'f':
		case 'F':st=(tall-100)*0.85;
		}
	
		fat=(double)weight/st*100;

		if(fat<=90) {
			result="��ü��";
		} else if(fat>90 &&fat<=110){
			result="����(ǥ��ü��)";
		}else if(fat>110 &&fat<=120){
			result="��ü��";
		}else if(fat>120 && fat<=130){
			result="�浵��";
		}else if(fat>130 &&fat<=150){
			result="�ߵ���";
		} else result="����";
		
	   
	}
	public String output() {
		this.calculate();
		return super.output()+"\n���: ����� �񸸵� "+String.format("%.2f",fat)+"�̰�  "+result+" �Դϴ�.";
	}

	public static void main(String[] args) {
		Test42 ob=new Test42();
	    System.out.println(ob.output());
	}

}
