import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n2000= amount/2000;
        amount=amount%2000;
         int n500= amount/500;
        amount=amount%500;
         int n200= amount/200;
        amount=amount%200;
         int n100= amount/100;
        amount=amount%100;

System.out.println("2000 x "+ n2000);
System.out.println("500 x "+ n500);
System.out.println("200 x "+ n200);
System.out.println("100x "+ n100);


    }}
       

