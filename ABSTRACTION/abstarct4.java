interface eventListener{
	public void performEvent();
}
interface mouseListener extends eventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseRealese();
	public void mouseMoved();
	public void mousedragged();
}
interface keylistener extends eventListener{
	public void keyRealeased();	
	public void keyPressed();	
} 

class eventDemo implements mouseListener,keylistener{
	public void performEvent(){
		System.out.println("performEvent");
	}	
	public void mouseClicked(){
		System.out.println("mouseClicked");
	}
	public void mousePressed(){
		System.out.println("mousePressed");
	}
	public void mouseRealese(){
		System.out.println("mouseRealese");
	}
	public void mouseMoved(){
		System.out.println("mouseRealese");
	}
	public void mousedragged(){
		System.out.println("mouseRealese");
	}
	public void keyRealeased(){
		System.out.println("keyRealeased");
	}
	public void keyPressed(){
		System.out.println("keyPressed");
	}
}
public class abstarct4{
	public static void main(String[] args) {
		eventDemo de=new eventDemo();
		de.mousedragged();
		de.performEvent();
		de.mouseClicked();
		de.mousePressed();
		de.mouseRealese();
		de.mouseMoved();
		de.keyPressed();
		de.keyRealeased();
	}
}