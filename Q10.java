import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);

        if(c%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }}