package step00_����;

/*[����17]1~100�����Ǽ� �߿���  3�� ����̸鼭 7�� ��� ���ϱ�(���� for��)
����) for���� && �����ڸ� �ݵ�� �̿�

--���--
21 42 63 84  
*/
public class Test17 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%7==0) {
				System.out.print(i+" ");
			}
		}
	}

}
