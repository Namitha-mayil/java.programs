import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int c=a%10;
        
         int b=a/100;
         int sum=c+b;
         System.out.print(sum);
    }}