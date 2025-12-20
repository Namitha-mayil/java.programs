import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int y=sc.nextInt();
         int m=sc.nextInt();
         if(m<=1||m>=12){
            System.out.println("invalid month");
         }
         else{
            int days=0;
            switch(m){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    days =31;
                    break;
                    case 4: case 6:case 9:case 11:
                        days=30;
                        break;
                        case 2:
                            if((y%400 ==0)||(y%4==0)&&(y%100!=0))
                                days=29;
                            else
                                days=28;
                            break;
}
System.out.print(days);

            }
         }

    }
