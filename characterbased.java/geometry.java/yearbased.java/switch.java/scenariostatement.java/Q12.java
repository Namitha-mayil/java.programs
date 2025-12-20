import java.util.Scanner;
public class Q12{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        if(b<20){
        System.out.println(" cold");
 }
 else if(b>21 && b<30){
        System.out.println(" pleasant");
 }
 else if(b>31 && b<40){
        System.out.println(" hot");
 }
else{
    System.out.println("heatwave ");

}}}