import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
   if(b==100){
    System.out.println("full battery");
   }
   else if(b>=50){
     System.out.println("50% battery");

   }
   else if(b<=20){
      System.out.println(" low battery");

   }
   else{
      System.out.println("normal battery");
   }
}}