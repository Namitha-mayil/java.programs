import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prices=sc.nextInt();
        int totalpens=sc.nextInt();
        int totalpay=(totalpens/5)*3 + (totalpens%5);
        int a=totalpay*prices;

        System.out.print(a);
    }}
         
             
         