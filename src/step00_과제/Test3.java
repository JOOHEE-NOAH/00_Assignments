package step00_����;
/*[����3] �޿������� �ۼ��Ͻÿ�
����1) �⺻���� 1,500,000��,�ð������� 55,000��,������ �⺻���� 10%
����2) �Ǽ��ɾ� = �⺻�� + �ð����� - ����

--���--     
�Ǽ��ɾ� : 1405000��
*/
public class Test3 {

	public static void main(String[] args) {
		int a=1500000, b=55000; 
		double t=0.1;
		int r=a+b-(int)(a*t);
		
		System.out.println("�Ǽ��ɾ� : "+r+"��");
	}

}
