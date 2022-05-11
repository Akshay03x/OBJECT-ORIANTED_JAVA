public class THREADING1{
    public static void main(String[] args){
        String temp="arjun bala";
        for(int i=0;i<temp.length();i++){
            System.out.print(temp.charAt(i));
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.err.print("hello");
                e.printStackTrace();
            }
        }

    }
}