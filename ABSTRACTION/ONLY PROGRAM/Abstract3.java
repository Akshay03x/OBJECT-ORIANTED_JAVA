import java.util.Scanner;
interface tarnsport{
	void deliver();
}
abstract class animal{
	public abstract void anim();
}
class Tiger extends animal{
	public void anim(){
		System.out.println("Tiger");
	}
}
class camel extends animal implements tarnsport{
	public void anim(){
		System.out.println("camel");
	}
	public void deliver(){
		System.out.println("camel deliver");
	}
		
}
class deer extends animal {
public void anim(){
		System.out.println("deer");
	}
}
class donkey extends animal implements tarnsport{
	public void anim(){
		System.out.println("donkey");
	}
	public void deliver(){
		System.out.println("donkeydeliver");
	}
	
}
class Abstract3{
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.anim();

		deer d= new deer();
		d.anim();

		camel c= new camel();
		c.anim();
		c.deliver();

		donkey dc= new donkey();
		dc.anim();
		dc.deliver();

		


	}
}