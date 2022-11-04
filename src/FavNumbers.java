import java.util.Scanner;

public class FavNumbers
{
    public static void favNumbers()
    {
        Scanner in = new Scanner(System.in);
        int retInt = 0;
        double retDouble = 0;

        retInt = SafeInput.getInt(in, "Enter your favorite integer : ");
        System.out.println("\nYour favorite integer is " + retInt + ".");

        retDouble = SafeInput.getDouble(in, "Enter your favorite double : ");
        System.out.println("\nYour favorite double is " + retDouble + ".");
    }
}
