import java.util.Scanner;
public class largestno 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] values = new int[n];
    int i = 0;
    while(i < n)
    {
      values[i] = sc.nextInt();
      i++;
    }
    int largest = 0;
    for(int number : values)
    {
        if(number > largest)
        {
            largest = number;
        }
    }
    System.out.println(largest);
  }  
}