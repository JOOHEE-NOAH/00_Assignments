package step00_����;

/*
 * [���� 22] �Ʒ� ���ڿ� �迭�� �������� ���̸� ���Ͻÿ�(���� for��)
String[] color={"red","green","blue","yellow","pink"};
��Ʈ) color[0].length

--���--
red��(��) 3���� �Դϴ�
green��(��) 5���� �Դϴ�
blue��(��) 4���� �Դϴ�
yellow��(��) 6���� �Դϴ�
pink��(��) 4���� �Դϴ�
*/
public class Test22 {

	public static void main(String[] args) {
		String[] color={"red","green","blue","yellow","pink"};
		
		for(int i=0;i<color.length;i++) {
			System.out.println(color[i]+"��(��) "+color[i].length()+"���� �Դϴ�");		
		}
	}

}
