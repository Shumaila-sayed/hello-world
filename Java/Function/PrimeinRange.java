import java.util.Scanner;

public class PrimeinRange {
    public static void main(String[] args) {
        prime();

    }
    static void prime(){
        Scanner in = new Scanner(System.in);
        int num1, num2, flag = 0, i, j;
        System.out.println("Enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        for( i = num1; i <= num2; i++)
        {
            for(  j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if( flag == 1)
            {
                System.out.println(i);
            }
        }
        


    }
}
