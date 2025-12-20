import java.util.Scanner;
public class Q13{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
   if(b==100){
    System.out.println("full battery");
   }
   else if(b>=30){
     System.out.println("moderate");

   }
  
   else{
      System.out.println("low");
   }
}}