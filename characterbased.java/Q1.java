import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
            System.out.print("it is a vowel");
        }
        else if(Character.isLetter(ch)){
            System.out.print("consonant");
        }
        else{
            System.out.print("not alphabet");
        }
    }}
