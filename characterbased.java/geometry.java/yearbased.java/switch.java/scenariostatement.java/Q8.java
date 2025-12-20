import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int o=7777;
        int n=sc.nextInt();
        int balance =10000;
        if(o==n){
          System.out.println("YOUR PIN IS CORRECT ALLOWED TO WITHDRAW");
         System.out.println("enter withdraw:");
         int withdraw=sc.nextInt();
          if(withdraw <= balance){
           balance-=withdraw;
                 System.out.println(withdraw);
          }
          else
            System.out.println("not sufficent balance");
  }
else{
    System.out.println("incorrect password");
}}}