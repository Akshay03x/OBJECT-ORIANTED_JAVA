import java.util.Scanner;
public class Exception2{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=5000;
            System.out.println("enter amount");
            int b=sc.nextInt();

            int total=a-b; 
            try{
                if(total<1000){
                    throw new Exception("asdfasdf");
                }
            }
            catch(Exception e){
                total=total+b;   
            }
            System.out.println(total);

    }
}