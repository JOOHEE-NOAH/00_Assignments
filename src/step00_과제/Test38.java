package step00_����;

/*[���� 38] ������ ���� ����� �������� �����Ͻÿ�
(��, main()���� ��������� ���ο� Method�߰��������ÿ�)

[���ȭ��]
###��������###
�̸� : �ε鷡
���� : 23
���� : 165.3 
------------------------
class Parent
{
String name;
public Parent(){	
System.out.println("###��������###");
}
public Parent(String name){	

}
public void printView(){
System.out.println("�̸� : " + name);
}
}
class Child extends Parent
{
int age;
float tall;

public Child(String name, int age, float tall){

}
public void printView(){
System.out.println("���� : " + age);
System.out.println("���� : " + tall);
}
}
*/
class Parent{
	String name;
	public Parent(){	
	System.out.println("###��������###");
	}
	public Parent(String name){	
	this.name=name;
	}
	public void printView(){
	
	System.out.println("�̸� : " + name);
	}
	}
	class Child extends Parent
	{
	int age;
	float tall;

	public Child(String name, int age, float tall){
		this.name=name;
		this.age=age;
		this.tall=tall;
	}
	public void printView(){
	Parent ob=new Parent(name);
	ob.printView();
	
	System.out.println("���� : " + age);
	System.out.println("���� : " + tall);
	
	}
	}
public class Test38 {
	
	public static void main(String[] args) {
		new Child("�ε鷡", 23, 165.3f).printView();
	}

}

