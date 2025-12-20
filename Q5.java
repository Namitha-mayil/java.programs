import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=100 && a<=999){
            System.out.print("3digit number");
        }
        else{
             System.out.print(" not 3digit number");

        }
    }}