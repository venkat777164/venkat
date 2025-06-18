import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the salary:");
        int salary = scan.nextInt();
        System.out.println("enter your age:");
        int age = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.println("you are 4000eligible for loan");
            System.out.println("how much amt do you want?(loan)");
        }
            int loan = scan.nextInt();
            if(loan<50000)
            {
               System.out.println(" loan available");
            }
            
        else
        {
            System.out.println(" no loan available");
        }
    }   
}    