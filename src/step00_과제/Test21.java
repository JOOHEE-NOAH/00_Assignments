package step00_����;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/*[���� 21] �Ʒ� �迭�� �� �� Ȧ������ �հ� ¦������ ���� ���Ͻÿ�(���� for��)
int[] num={1,5,2,7,3,9,10,4,6,8};

--���--
Ȧ������ ��= 33
¦������ ��= 22

*/public class Test21 {

	public static void main(String[] args) {
		int odd=0, even=0;
		int[] num={1,5,2,7,3,9,10,4,6,8};
			
		
		
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
				even+=num[i];
			}else {
				odd+=num[i];
			}
			}
			
			System.out.println("Ȧ������ ��= "+odd);
			System.out.println("¦������ ��= "+even);
				
		
	}

}
