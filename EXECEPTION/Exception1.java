import java.util.Scanner;

public class Exception1{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a= sc.nextInt();
        System.out.println("enter number");
        int b=sc.nextInt();

        System.out.println("enter operation");
        Scanner sx=new Scanner(System.in);
        int c= sx.nextInt();

        if(c==1){
            System.out.println(a+b);
        }
        if(c==2){
            System.out.println(a-b);
        }
        if(c==3){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println("ERROR OCCURED");
            }
        }
        else{
            System.out.println("enter required operation");
        }

    }
}
