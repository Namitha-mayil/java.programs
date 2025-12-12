import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double n =sc.nextDouble();
     int c= sc.nextInt();
        System.out.println("number of candies:"+ n);
        System.out.println("number of people:"+ c);
        System.out.println("each:"+n/c);
    }}