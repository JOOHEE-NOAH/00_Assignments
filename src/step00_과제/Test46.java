package step00_����;
/*[����46] �������ε�(Dynamic Binding)�� �̿��Ͽ� ���� ���α׷��� �ϼ��Ͻÿ�
(1)Ŭ������ : Shape
   -nData1:int
   -nData2:int
   +Shape(int data1, int data2)
    +getter    
    +getArea():double            ==> abstract 
(2)Ŭ������ : Triangle              ==> Shape�� ��ӹ���
   +Triangle(data1:int, data2:int)
   +getArea():double 
(4)Ŭ������ : Rectangle           ==> Shape�� ��ӹ���
   +Rectangle(data1:int, data2:int)
   +getArea():double

(5)Test46Ŭ������ main()�޼��忡�� �Ʒ��ڵ�ܿ� �������� �ϼ��Ͻÿ�
   Shape ob=null;
   Scanner sc=new Scanner(System.in);
   while(true){
             System.out.print("1.�ﰢ�� 2. �簢��  3. ��  ��\n����(1-3)");
             int n=sc.nextInt();
	                 :
   }

[���ȭ��]
1. �ﰢ��  2. �簢��  3. ��  ��
����(1-3) : 1
�غ� : 2
���� : 3
���� : 6.00


1. �ﰢ��  2. �簢��  3. ��  ��
����(1-3) : 2
���� : 4
���� : 5
���� : 20
 * */
public class Test46 {

	public static void main(String[] args) {

	}

}
