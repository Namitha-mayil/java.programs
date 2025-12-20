import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    if(a==b && b==c&& a==c){
        System.out.print("tringle is equilateral");

    }
    else if(a==b || b==c||a==c)
    {
        System.out.print("triangle is isosceles");
    }
    else{
        System.out.print("scalen");
    }


    }
}