import java.util.Scanner;

abstract class vegetable{
	String clolor;
	abstract void tostring();
}
class Potato extends vegetable{
	void tostring(){
		System.out.println("yellow");
	}
}
class Tomato extends vegetable{
		void tostring(){
		System.out.println("red");
	}	
}
class Brinjal extends vegetable{
	void tostring(){	
		System.out.println("purpal");
	}
}
public class Abstract1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		vegetable v=null;

		String str=sc.next();
		switch(str)
		{
		case "potato":
			 v=new Potato();
			break;
		
		case "tomato":
			 v=new Tomato();
			break;
			
		case "brinjal":
			v=new Brinjal();
			break;
				
		}
		v.tostring();		
	}
}