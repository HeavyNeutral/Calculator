import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        int miles;
        double km;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of miles to be converted ");
        miles = in.nextInt();

        km = miles * 1.60934;
        System.out.print(miles + " miles = ");

        System.out.println(km + " km");
    }
}