package step00_����;

/*[���� 41] ���� ���α׷��� �ϼ��Ͻÿ�
(1)Ŭ������ : Salary
  -name:String (�̸�)
  -salary:int  (����)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary�� ����
  +viewInfomation():void     ==> �޼��忡�� �̸��� ������ ���

(2)Ŭ������ : Test41   ==> Salary�� ��ӹ���
  -department:String(�μ�)
  +Test41()
  +Test41(nameString, salary:int, department:String)
  +viewInfomation():void     ==> �μ� ���

(3)main()�Լ�����
   Test41  ob = new Test41("ȫ�浿",85000000,"���ߺ�"); 
   //�������� �ϼ��Ͻÿ�
           :

[���ȭ��]
�̸� : ȫ�浿
���� : 85000000
�μ� : ���ߺ�
*/
class Salary{
	private String name;
	private int salary;
	
	public Salary() {
	}
	public Salary(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	public void viewInformation() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+salary);
	}
}
public class Test41 extends Salary {
 private String department;
 
 public Test41() {
 }
 public Test41(String name, int salary, String department) {
	  super(name,salary);
	  this.department=department;
	 this.viewInformation();
 }
 public void viewInformation() {
	 super.viewInformation();
	 System.out.println("�μ� : "+department);
 }
	public static void main(String[] args) {
		Test41 ob= new Test41("ȫ�浿",85000000,"���ߺ�");
	}

}
