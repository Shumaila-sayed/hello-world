import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide Principle amount, time and rate: ");
        float P = input.nextFloat();
        float T = input.nextFloat();
        float R = input.nextFloat();
        float SI = 1 + ((R*100/100)*(T/365))*P;
        System.out.println(SI);


    }
}
