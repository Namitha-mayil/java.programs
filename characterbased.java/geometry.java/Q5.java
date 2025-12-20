import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
          int b=sc.nextInt();
            int c=sc.nextInt();
             
          if(a>0&&b>0&&c>0&&(a+b>c)&&(b+c>a)&&(a+c>b))
          {
            System.out.print("it is valid triangle");
          }
          else{
             System.out.print("it is not valid triangle");
     } }}

  