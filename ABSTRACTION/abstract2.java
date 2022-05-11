interface A{
	String astr="AAA";
	public void displayA();
}
interface A1 extends A{
	String a1str="A1str";
	public void displayA1();
}
interface A2 extends A{
	String a2str="A2str";
	public void displayA2();
}
interface A12 extends A1,A2{
	String a12str="A12str";
	public  void displayA12();
}
class B implements A12{
	public void displayA(){
		System.out.println(A.astr);
	}
	public void displayA1(){
		System.out.println(A1.a1str);
	}
	public void displayA2(){
		System.out.println(A2.a2str);
	}
	public void displayA12(){
		System.out.println(A12.a12str);
	}
}
public class abstract2{
	public static void main(String[] args) {
			
		A obj= new B();
		A1 obj1=new B();
		A2 obj2=new B();
		A12 obj12=new B();
		obj.displayA();
		obj1.displayA1();
		obj2.displayA2();
		obj12.displayA12();	

	}
}