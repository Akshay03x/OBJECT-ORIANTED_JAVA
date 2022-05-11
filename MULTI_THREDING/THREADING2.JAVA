import java.util.*;
public class THREADING2{
    public static void main(String[] args){
        long ans=0;
        Date dstart=new Date();
        
        for(long i=0;i<100000;i++){
             ans+=i;
            //   try{
            //     Thread.sleep(500);
            // }
            // catch(Exception e){
            //     System.err.print("hello");
            //     e.printStackTrace();
            // }

             for(long j=0;j<100000;j++){}
        }
        
        Date dend=new Date();
        long diff=dend.getTime()-dstart.getTime();
        System.out.println(diff);
        System.out.println(ans);
    }
}