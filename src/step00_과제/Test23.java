package step00_����;

/*[���� 23] ����for���� if���� �̿��ؼ� 
1-10������ ���� ����ϴ� ���α׷��� �ϼ��Ͻÿ�

--���ȭ��--
1+2+3+4+5+6+7+8+9+10=55
*/

public class Test23 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum=sum+i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			} else
			System.out.print("=");
			} 
		System.out.println(sum);
		
	}

}
