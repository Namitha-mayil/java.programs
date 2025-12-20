import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
      String s=sc.next();
       if(s.equals("green")){
        System.out.println("go");

       }
       else if(s.equals("orange")||s.equals("yellow")){
        System.out.println("ready");
    }
    else{
        System.out.println("stop");

    }}}