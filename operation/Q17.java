import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int a= sc.nextInt();
         
        System.out.println((a>0 &&(a&(a-1))==0)?a+" is a power of 2":a+"is not a power of 2");

         
    }};

         
