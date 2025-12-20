import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        

        switch(m/10){
            case 10:
                case 9:
                System.out.println("grade A");break;
            case 8:System.out.println("grade b");break;
            case 7:
                case 6:
                    System.out.println("grade c");break;
           default:
           System.out.println("fail");

        }}}
    