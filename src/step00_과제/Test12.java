package step00_����;

/*[����12]����ó�����α׷�
�߰����,�⸻���,����Ʈ,�⼮������ Argument�� �Է¹޾Ƽ� ����Ͻÿ�

����1) (�߰�+�⸻)/2       ---> 60%
  ����                   ---> 20%
  �⼮                   ---> 20%

����2)   90�̻� 'A'����     (3)A,B����  ---->"excellent"
   80�̻� 'B'����         C,D����  ---->"good"
   70�̻� 'C'����         F����    ---->"poor"
   60�̻� 'D'����        (switch���̿�) 
   ������ 'F'����
   (if~else if���̿�)

$ java Test12  90 89 99 100  

[���ȭ��]
�߰���� : 90
�⸻��� : 89
�������� : 99
�⼮����: 100

����=93.20      <---�Ҽ����� ��°�ڸ�����
����=A              System.out.printf("���� : %.2f", avg);
��=excellent
*/
public class Test12 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		char grade1;
		String grade2;
		
		double avg1=(double)(a+b)/2;
		double avg=(((a+b)/2)*0.6)+(c*0.2)+(d*0.2);
		
		System.out.println("�߰���� : "+a);
		System.out.println("�⸻��� : "+b);
		System.out.println("�������� : "+c);
		System.out.println("�⼮���� : "+d);
		
		System.out.println();
		
		System.out.printf("����=%.2f\n",avg);
		
		if (avg>=90) {
			grade1='A';
		} else if (avg>=80) {
			grade1='B';;
		} else if (avg>=70) {
			grade1='C';;
		} else if (avg>=60) {
			grade1='D';;
		} else {
			grade1='F';
		}
		System.out.println("����="+grade1);
		
		switch (grade1) {
		case 'A':
		case 'B': grade2="excellent";
			break;
		case 'C':
		case 'D': grade2="good";
		default: grade2="poor";
			break;
		}	
		
		System.out.println("��="+grade2);
		
		
	}

}
