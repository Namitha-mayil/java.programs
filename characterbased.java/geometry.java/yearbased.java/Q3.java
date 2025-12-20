import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int y=sc.nextInt();
        int lasttwo=y%100;
        int firsttwo=y/100;
        if(lasttwo==firsttwo){
            System.out.println("same number");
        }
        else
              System.out.println(" not same number");
    }}
     
       


       