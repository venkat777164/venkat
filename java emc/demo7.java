import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String meghana = scan.nextLine();
        if(meghana.equals("dead"))
        {
            System.out.println("suriya meets ramya");
        }
        else
        {
            System.out.print("suriya weds meghana");
        }
    }
}