import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n=sc.next().charAt(0);
         if(Character.isDigit(n)){
            System.out.print("it is number");
        }

        else{
            System.out.print("not digit");
        }

    }}