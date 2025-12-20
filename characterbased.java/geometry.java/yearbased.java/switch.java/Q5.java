import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       int m=sc.nextInt();
        
          System.out.println("---ATM Menu");
             System.out.println("1.check balance");
                System.out.println("2.deposit");
                   System.out.println("3.withdraw");
                      System.out.println("4.exit");
                         System.out.print("enter your choice:");
                           int choice=sc.nextInt();
switch(choice){
    case 1:
        System.out.println("your balance:rs"+m);
        break;
    case 2:
           System.out.println("enter deposit:");
           int deposit = sc.nextInt();
           switch(deposit>0?1:0){
            case 1:
               m += deposit;
               System.out.println(deposit);
               break;
               case 0:
                 System.out.println("invalid");
                 break;
                
           }
    case 3:
         System.out.println("enter withdraw:");
         int withdraw=sc.nextInt();
          switch(withdraw <= m && withdraw>0?1:1){
            case 1:
                m-=withdraw;
                 System.out.println(withdraw);
                 break;
            case 0:
                 System.out.println("invalid"); break;
}
case 4:
     System.out.println("thank you for using our atm");
     break;
     default:
        System.out.println("invalid choice:Try again...");

  }}}

  