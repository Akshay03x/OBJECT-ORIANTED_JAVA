class Run1 implements Runnable{
	public void run(){
		for(int i=0;i<=20;i++){
			if(i%2==0){
				System.out.println(i);
			}
				try{
					Thread.sleep(500);
				}catch(Exception e){}
			}
		
	}
}
class Run2 implements Runnable{
	public void run(){
		for(int j=0;j<=20;j++){
			if(j%2!=0){
				System.out.println(j);
			}
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
			
		}
	}
}
public class multi2{
	public static void main(String[] args) {
		Run1 r1=new Run1();
		Run2 r2=new Run2();
		Thread t1= new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}
}