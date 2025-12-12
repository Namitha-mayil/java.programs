import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         double r=sc.nextDouble();
              double h=sc.nextDouble();
    
         System.out.println("Surface area:"+((2*Math.PI*r*h)+2*Math.PI*r*r));
           System.out.println("Volume:"+(Math.PI*r*r*h));
    }}
 