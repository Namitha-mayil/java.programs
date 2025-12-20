
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<0 && y<0){
            System.out.print("3rd quadrant");
        }
        else if(x<0 && y>0)
        {
            System.out.print("2rd quadrant"); 
        }
          else if(x>0 && y>0)
        {
            System.out.print("1st quadrant"); 
        }
else{
     System.out.print("4st quadrant"); 

}
    }
    }
