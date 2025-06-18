import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        for(int i=1;i<=5;i=i+1)
        {
            System.out.print(i);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("number 1:");
        int a = scan.nextInt();
        System.out.println("number 2:");
        int b = scan.nextInt();

        for(int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}
