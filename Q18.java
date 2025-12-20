 import java.util.Scanner;
public class Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=0 && a<10)
        {
            System.out.print("single digit");
        }
        else if(a>=10 && a<100)
        {
            System.out.print("double digit");
        }
        else if(a>=100 && a<1000)
        {
            System.out.print("three digit");
        }
        else{
            System.out.print("more than 3digit");
        }
    }}
