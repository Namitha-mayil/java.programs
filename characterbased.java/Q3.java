import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
       
        if(ch>='A' && ch<='Z'||ch>='a' && ch<='z'){
            System.out.print("ALPHABET");
        }
        else{
            System.out.print("not alphabet");
        }
    }}