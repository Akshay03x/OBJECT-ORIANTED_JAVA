import java.util.Scanner;
class XY{
	public void multi(int x, int y){
		try{
		System.out.println("ans  "+x/y);
		}
	catch(Exception e){
		// e.printStackTrace();
	System.out.println("HEELLO JADU");
		}
	}
}
public class Exception11{
	public static void main(String[] args) {

		XY a=new XY();
		a.multi(1,0);
		
	}
}