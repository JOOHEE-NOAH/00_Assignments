package step00_����;
/*[����5] ������ ���� ������ �����ؼ� ����Ͻÿ�

--����--
name���� : �ε鷡
kor���� : 90 
eng���� : 70 
mat���� : 75

--���--
�̸� : �ε鷡
�հ����� : 235��
������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�

*/
public class Test5 {

	public static void main(String[] args) {
		String name="�ε鷡";
		int kor=90, eng=70, mat=75;
		int tot= kor+eng+mat;
		double avg=tot/3.0;
		
		System.out.println("�̸� : "+name);
		System.out.println("�հ����� : "+tot+"��");
		System.out.printf("������� :  %.1f",avg);
	}

}
