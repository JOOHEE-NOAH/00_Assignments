package step00_����;
/*[���� 43] �������̵�(override)�� �̿��Ͽ� ���� ���α׷��� �ۼ��Ͻÿ�
(1)Ŭ������: Circle
   #r:int        
   #size :double        ==> ���� �ᱣ���� �����ϴ� ����
   #PI:double            ==> �ʱⰪ 3.141592, final
   +Circle(r:int)         ==> ������ ����
   +compute():void       
   +output():void 

(2)Ŭ������ :  CircleArea     ==> CircleŬ������ ����Ͻÿ�
   +CircleArea(r:int)
   +compute():void            ==> ���� ����=������ *������*3.141592
   +output():void               ==> ���      
       
(3)Ŭ������ :  CircleRound    ==> CircleŬ������ ����Ͻÿ�
   +CircleRound(r:int)
   +compute():void              ==>���ǵѷ�=������ * 2 * 3.141592
   +output():void                 ==>���

(4)Test43Ŭ���� main()����
   CircleArea   ob1 = new CircleArea(10);
   CircleRound  ob2 = new CircleRound(10);
   ob1.compute();
   ob1.output();
   ob2.compute();
   ob2.output();

[���ȭ��]
���ǳ��� : 314.1592
���ǵѷ� : 62.83184
 * */
public class Test43 {

	public static void main(String[] args) {

	}

}
