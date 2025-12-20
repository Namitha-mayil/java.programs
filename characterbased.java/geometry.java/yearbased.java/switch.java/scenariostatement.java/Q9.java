import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int balance = sc.nextInt();
       int withdraw=sc.nextInt();
          if(withdraw <= balance){
            if((withdraw%100)==0){
                    System.out.println("successfully withdraw");
                 }
                 else{
                    System.out.println("cant withdraw");
                 }
}
else{
   System.out.println("cant withdraw");
                 }

        }}
      