import java.io.*;
public class Demo{
	public static void main(String[] args) {
		File f=new File("text.txt");
		// System.out.println(f.isAbsolute());
		// System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		// System.out.println(f.lastModified());
		System.out.println(f.delete());

		File fe=new File("DBMS");
		System.out.println(fe.isDirectory());

		String[] allFileNames=f.list();
		try{
		for(int i=0;i<allFileNames.length;i++){
			System.out.println();
		}
			}catch(Exception e){}
	}
}