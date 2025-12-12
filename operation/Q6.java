import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
        int b=sc.nextInt();

int c = b;
        b=a;
        a=c;
           System.out.println(a);
            System.out.println(b);
    }}