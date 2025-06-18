import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int Score = scan.nextInt();
        if(Score<50)
        {
            System.out.println("you need to improve");
        }
        else if(Score>=50 && Score<=70)
        {
            System.out.println("good job");
        }
        else
        {
            System.out.println("excellent performance");
        }
    }
}