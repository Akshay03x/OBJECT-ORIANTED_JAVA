class Run1 implements Runnable{
	public void run(){
		for(;;){
			System.out.println("good morning");
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
class Run2 implements Runnable{
	public void run(){
		for(;;){
			System.out.println("good night");
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
}
public class Multi{
	public static void main(String[] args) {
		Run1 r1=new Run1();
		Run2 r2=new Run2();
		Thread t1= new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}
}