class headPhone{
	static int stock=5;

	public void Produce()
	{
		while(true){
		stock++;
		System.out.println("total		"+stock);
		try {
                Thread.sleep(300);
                if (stock > 5) {
                    Thread.sleep(800);
                }
            }catch(Exception e){}
		}	

	}
	public void consume() {
        while (true) {
            stock--;
            System.out.println("stoke = " + stock);
            try {
                Thread.sleep(200);
                if (stock< 1) {
                    Thread.sleep(1600);
                }
            }catch(Exception e){}
        }
    }
	// public void Consume()	
	// {
	// 	while(true){
	// 	stock--;
	// 	System.out.println("total1234		"+stock);
	// 	}
	// }

}

class producer extends Thread{
	// headPhone hp;

	// public headPhone{
	// 	this.stock=stock;
	// }

	public void run(){
		headPhone obj = new headPhone();
		while (true){
			try{
				obj.Produce();
			}
			catch(Exception e){
				/*e.printStackTrace();*/
			}
		}
	}
}

class consumer extends Thread{
	headPhone obj = new headPhone();
	public void run(){
		while (true){
			try{
				obj.consume();
			}
			catch(Exception e){
				// e.printStackTrace();
			}
		}
	}
}
public class produserconsumer{
	public static void main(String[] args) {
		// headPhone hp=new headPhone();
		producer p= new producer();
		consumer c= new consumer();	

		// Thread mt= new Thread();
		// Thread mt1= new Thread();


		// hp.Produce();
		// hp.Consume();
		p.start();
		c.start();
	}
}