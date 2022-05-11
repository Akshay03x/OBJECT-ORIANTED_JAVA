import java.util.Scanner;
class MyException extends Exception{
	String str;
	public MyException(String str){
		this.str=str;
	}
	public void display(){
		System.out.println(this.str);
	}
}
public class Exception4{
	public static void main(String[] args) {
			int blac=6000;
			Scanner sc=new Scanner(System.in);
			int with=sc.nextInt();

			try{
				if(with>blac){
					throw new MyException("not valid");
				}
				else {
					System.out.println("Blance"+(blac-with));	
				}
			}catch(Exception e){
				// System.out.println("Blance"+(blac-with));
				 String str="";
				// e.display("not valid");
				System.out.println("not valid");			
			}

		}	
}