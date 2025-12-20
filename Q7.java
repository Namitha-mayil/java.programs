import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
           int b=sc.nextInt(); 
             int c=sc.nextInt();
        if((a<b) && (a<c)){
            System.out.print("small a");

        }
        else if((b<a)&&(b<c)){
            System.out.print("small b");
        }
         else 
            System.out.print("small c");
    }}