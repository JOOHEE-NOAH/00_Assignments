package step00_����;

/*[����36]������ �Լ��� overloading�Ͽ� �μ��� ū���� ����ϴ� 
���α׷��� �ϼ��Ͻÿ�.(��, ���� ����� �����ڿ��� �Ұ�)
(1) main()����
new Test36(10,20);
new Test36(12.4, 9.45);
new Test36('Z', 'p');

(2) main()�Լ��� ���� �������� �ϼ��Ͻÿ�

[���ȭ��]
max = 20
max = 12.4
max = p
*/
public class Test36 {
	public Test36() {
		
	}
	public Test36(int a, int b) {
	int c=(a>b)? a:b;
	System.out.println("max = "+c);
	}
	public Test36(double a, double b) {
		double c=(a>b)? a:b;
		System.out.println("max = "+c);
}
	public Test36(char a, char b) {
		char c=(a>b)? a:b;
		System.out.println("max = "+c);
}
	
	public static void main(String[] args) {
		new Test36(10,20);
		new Test36(12.4,9.45);
		new Test36('Z','p');
		
	}

}
