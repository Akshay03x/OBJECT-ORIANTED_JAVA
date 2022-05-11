class Thread{
	public synchronized void table(int a){
		for(int i=1;i<=10;i++){
			System.out.println(a+"*"+i+"= "+a*i);
		}
	}
}
class thread1 extends Thread{
	
	public void myThread(myThread mt){
		myThread mt;
	}
}
public class Syncronizetion{
	public static void main(String[] args) {

		thread mt=new thread();
			mt.table(2);
			mt.start();
	}
}