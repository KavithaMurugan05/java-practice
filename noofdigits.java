import java.util.Scanner;
public class noofdigits 
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] letters = input.toCharArray();
    int count = 0;
    for(char ch : letters)
    {
        if(Character.isDigit(ch))
        {
            count++;
            System.out.println(ch);
        }
    }
    System.out.println("No.of digits: "+count);

 }   
}