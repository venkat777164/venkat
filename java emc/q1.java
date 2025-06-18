import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String Dept = scan.nextLine();
        System.out.println("my name is"+Name);
        System.out.println("my score is "+score/10 +"/10");
        System.out.println("my dept is "+Dept);
    }
}
