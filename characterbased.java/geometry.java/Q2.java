import java.util.Scanner;
 public class Q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();
        if(a*a==(b*b)+(c*c)){
            System.out.print("it is right angle triangle");
        }
         else if(b*b==(a*a)+(c*c)){
            System.out.print("it is right angle triangle");
        }
          else if(c*c==(a*a)+(b*b)){
            System.out.print("it is right angle triangle");
        }
        else{
            System.out.print("not a right angle triangle");
        }

    }
}