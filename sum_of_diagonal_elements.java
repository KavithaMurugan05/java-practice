public class multi_array
{
 public static void main(String args[])
 {
   int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
    int primary = 0, secondary=0;
    for(int i=0; i<arr1.length; i++)
    {
        primary += arr1[i][i];
        secondary += arr1[i][arr1.length-i-1];
    }
    System.out.println("Sum of Primary Diagonal Elements : "+primary);
    System.out.println("Sum of Primary Diagonal Elements : "+secondary);
 }   
}
