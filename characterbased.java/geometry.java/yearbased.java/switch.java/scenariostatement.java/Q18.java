import java.util.Scanner;
public class Q18{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int liters=sc.nextInt();
        int bill =0;
           
     if(liters<=1000)
           bill=0;
        else if(liters<=3000){
        bill=5;

        }
        else {
          int extraliter=liters -3000;
          bill=5+(extraliter/1000)*10;
        }
        System.out.println(bill);

    }}