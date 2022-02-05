package step00_����;

/*
 * [����33]����Ŭ������ ����� setter & getter�� �̿��Ͽ� ������ �ϼ��Ͻÿ�
(1)Ŭ������:  BookShop
    -bname:String   (å�̸�)
    -author:String   (����) 
    -price:int          (����) 
    +setBook(bname:String,  auth  or:String, price:int):void
    +viewBook():void
    +setter & getter

(2)����
    1) Test33Ŭ������ main()�޼��忡�� BookShop Ŭ������ ��ü ob�� �����
    2) setBook("�ڹٿϼ�","Ȳ�ϼ�",25000)�� ���� �������� viewBook()�޼���� ����Ѵ�
    3) setBname("JSP���"),  setAuthor("��JP"), setPrice(3500)�� ���� ��������
         getBname(), getAuthor(), getPrice()�� ����Ѵ�

[���ȭ��]
å�̸� : �ڹٿϼ�
��  �� : Ȳ�ϼ�
��  �� : 25000��

å�̸� : JSP���
��  �� : ��JP
��  �� : 35000��
*/
class BookShop{
	private String bname;
	private String  author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	public void viewBook() {
		System.out.println("å�̸� : "+bname);
		System.out.println("��  �� : "+author);
		System.out.println("��  �� : "+price+"��");
		
	}
	public String getBname() {
		return bname;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

//3) setBname("JSP���"),  setAuthor("��JP"), setPrice(3500)�� ���� ��������
  //   getBname(), getAuthor(), getPrice()�� ����Ѵ�

public class Test33 {

	public static void main(String[] args) {
		BookShop ob=new BookShop();
		ob.setBook("�ڹٿϼ�","Ȳ�ϼ�",25000);
		ob.viewBook();
		ob.setBname("JSP���");
		ob.setAuthor("��JP");
		ob.setPrice(3500);
		System.out.println();
		System.out.println("å�̸� : "+ob.getBname());
		System.out.println("��  �� : "+ob.getAuthor());
		System.out.println("��  �� : "+ob.getPrice()+"��");
	}

}
