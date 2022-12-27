import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupees : ");
        float val =input.nextFloat();
        double con = val/74.12;
        System.out.println(con);


    }
}
