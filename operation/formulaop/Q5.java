import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
     double x1 =sc.nextInt();
       double y1=sc.nextInt();
       double x2 =sc.nextInt();
        double y2=sc.nextInt();
       double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.print(d);
    }}