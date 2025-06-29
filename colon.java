import java.util.Scanner;
public class colon
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     String[] input = sc.nextLine().split(":");
     int a = Integer.parseInt(input[0].trim());
     int b = Integer.parseInt(input[1].trim());
     System.out.println((a+b)/2);
 }   
}