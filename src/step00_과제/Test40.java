package step00_����;

/*[���� 40 ���� ���α׷��� �ϼ��Ͻÿ�
(1)Ŭ������: Entry
   -word:String 
   +Entry()                               ==>  ***������***  ���
   +Entry(word:String)        ==>  Entry()ȣ�� 
   +writeView():void              ==>  ������

(2)Ŭ������: SubEntry   ==> Entry�� ��ӹ���
   -definition:String  
   -year:int
   +SubEntry()
   +SubEntry(word:String)                                                   ==> Entry(String word)   ȣ�� 
   +SubEntry(word:String, definition:String, year:int)   ==> SubEntry(String word)ȣ��
   +printView():void                                                                 ==> ����, �ñ����

(3)Test40Ŭ������  main()�Լ�����
    SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);
    ob.writeView();
    ob.printView();

[���ȭ��]
*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��*/
public class Test40 {

	public static void main(String[] args) {

	}

}
