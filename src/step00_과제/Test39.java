package step00_����;

/*[���� 39]������ ���� ����� �������� �����Ͻÿ�
(��, main()���� ��������� ���ο� Method�߰��������ÿ�)

[���ȭ��]
**** x,y,z�� ��ä���***
10�� �Ѱܹ��� ������
10   20   �� �Ѱܹ��� ������
10   20   30  �� �Ѱܹ��� ������
10   20   30
�� : 60
------------------------------------
*/
class SuperEx
{
	int x,y,z;
	
	public SuperEx(){
		System.out.println("**** x,y,z�� ��ä���***");//6
	}
	public SuperEx(int k){
		this();
		System.out.println(k + "�� �Ѱܹ��� ������");//5
	}
	public SuperEx(int a, int b){
		this(a);
		System.out.println(a + "   " +b+"   �� �Ѱܹ��� ������");//4
	}
	public SuperEx(int x,int y,int z){
    this(x,y);
    	this.x=x;
		this.y=y;
		this.z=z;
	System.out.println(x+ "   " +y+"   " +z+"   �� �Ѱܹ��� ������");//3
	}
	public void display(){
		
		System.out.println(this.x+"   "+this.y+"   "+this.z);//2
	}
}
class SubEx extends SuperEx
{
	public SubEx(int a,int b,int c){
		super(a,b,c);
	    this.sumData();
	    
	}	
	public void sumData(){
		super.display();
		System.out.println("�� : " + (x+y+z));//1
	}
}

public class Test39 {

	public static void main(String[] args) {
		new SubEx(10,20,30);//1. SubEx�� ���� 3���� ������ ȣ��
	}

}
