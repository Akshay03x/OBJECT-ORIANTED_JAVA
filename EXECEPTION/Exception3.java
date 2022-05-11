class MyException extends Exception{
	String str;
	public MyException(String str){
		this.str=str;
	}
	public void display(){
		System.out.println(this.str);
	}
}
public class Exception3{
	public static void main(String[] args) {
			int sum=0,flag=0;
			String str;

			for(int i=0;i<args.length;i++){
				int n=Integer.parseInt(args[i]);
				flag=0;
				str="";
				try{
					if(n<0){
						str=str+"negative";
						flag=1;
					}
					if(flag==1){
						throw new MyException(str);
					}
					else{
						sum=sum+n;
					}
				}catch(MyException e){
						System.out.println("Exception are catched for number "+n);
						e.display();
				}
			}
			System.out.println("sum="+sum);
		
	}
}