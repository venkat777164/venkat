
import java.util.Scanner;

 class demo3 {
    public static void main(String[] args) {
        //check whether the number1 and number2 are equal 0r not
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2)
        {
            System.err.println("both the numbers are equal");
        }
        else
        {
            System.err.println(" Not equal");
        }
    }
    
}
