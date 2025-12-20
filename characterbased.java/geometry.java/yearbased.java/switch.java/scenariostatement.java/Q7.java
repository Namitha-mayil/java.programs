import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
double bill =0;
        if(b<=100){
            bill=0;
     
 }
else if( b<=300){
  bill = (b-100)*5;

}
else {
    bill= (200*5)+(b-300)*10;

}
if(b>500){
    bill=bill+(0.2*bill);
}
System.out.println(bill);
}}