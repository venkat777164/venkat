import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String traffic = scan.nextLine();
        if(traffic.equals("red"))
        {
            System.out.println("stop");
            if(traffic.equals("yellow"))
            {
                System.out.println("ready");
                if(traffic.equals("green"))
                {
                    System.out.println("go");
                }
            }
        }

    }
}