import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.print("it is upper");
        }
         else if(Character.isLowerCase(ch)){
            System.out.print("it is Lower");
        }
        
         else if(Character.isDigit(ch)){
            System.out.print("it is number");
        }
        else{
            System.out.print("special symbol");
        }
    }}
