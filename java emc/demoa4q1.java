import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        int[] marks= new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<=4;i=i+1)
        {
            marks[i]=scan.nextInt();
        }
        //marks[0]=scan.nextInt();
        //marks[1]=scan.nextInt();
        //marks[2]=scan.nextInt();
        //marks[3]=scan.nextInt();
        //marks[4]=scan.nextInt();
           for(int i=0;i<=4;i=i+1)
        System.out.println(marks[i]);

    }
}