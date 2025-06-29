public class oddeven {
    public static void main(String args[])
{
    int num = 5;
    String str = ((num & 1) == 1) ? "odd" : "even";
    System.out.println(" "+str);
    for(int i = 0; i<=10;i++)
    {
        System.out.print(i++ +" ");
    }
    System.out.println();
    for(int i = 0; i<=10;++i)
    {
        System.out.print(++i +" ");
    }
}
}
