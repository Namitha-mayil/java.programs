import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         double l=sc.nextInt();
              double w=sc.nextInt();
     double h=sc.nextInt();
         System.out.println("Surface area:"+(2*(l*w+l*h+w*h)));
           System.out.println("Volume:"+(l*w*h));
    }}
   