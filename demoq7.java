import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score>35 && score<60)
        {
            System.out.print("video game");
        }
        else if(score>60 && score<90)
        {
            System.out.print("iphone");
        }
        else if(score>90)
        {
            System.out.print("macbook pro");
        }
    }
}