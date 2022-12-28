import java.util.Scanner;

//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

public class August {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many days does august have?");
        int days = in.nextInt();
        int ans = 0;
        for (int i = 1; i <= days;  i++) {
            if (i % 2 == 0){
                ans++ ;
            }
        }
        System.out.println("Kunal can go out for " + ans+ " days.");
    }
}
