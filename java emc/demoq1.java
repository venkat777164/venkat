import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>35)
        {
            System.out.println("am pass");
        }
        else
        {
            System.out.print("am not pass");
        }
    }
}