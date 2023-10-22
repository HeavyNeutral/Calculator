// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        int miles;
        double km;

        Scanner in = new Scanner(System.in);

        System.out.print("How many miles ");
        miles = in.nextInt();

        km = miles * 1.60934;
        System.out.print(miles + " miles = ");

        System.out.println(km + " km");
    }
}