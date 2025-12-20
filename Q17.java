 import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a%10;
        b=b%10;
        if(a==b){
            System.out.print("the last digit is same");
        }
        else{
            System.out.print("the last digit is not same");
        }
    }}