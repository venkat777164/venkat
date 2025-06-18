import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        for(int i=0;i<=9;i=i+1)
        {
            num[i]=scan.nextInt();
        }
        for(int i=0;i<=9;i=i+1)
        {
            System.out.println(num[i]);
        }
    }
}