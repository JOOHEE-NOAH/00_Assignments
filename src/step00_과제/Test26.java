package step00_����;

/*[���� 26] �޼��带 ȣ���ؼ� ������ ���� ����Ͻÿ�.
(1)main()�� �ڵ�(�Ʒ� �ڵ�ܿ� �ٸ� �ڵ�� �߰����� ������)
    String result=personView("ȫ�浿", 90,78,88);
    System.out.println(result);

(2) personView()�޼��忡�� ������ ������� ��¹����� ����� 
     return �Ͻÿ�

(3)���ȭ�� 
ȫ�浿�� ������ 256���Դϴ�
*/
public class Test26 {
	public static String personView(String string, int i, int j, int k) {
		int result=i+j+k;
		return "ȫ�浿�� ������ "+result+"���Դϴ�";
		
	}
	public static void main(String[] args) {
	    String result=personView("ȫ�浿", 90,78,88);
	    System.out.println(result);
	}



}
