import java.util.Scanner;

public class Reggie
{
    public static void reggie()
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN ###-##-#### : ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + ssn + ".");

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number : ", "(M|m)\\d{8}");
        System.out.println("Your UC Student M number is " + mNumber + ".");

        String menu = SafeInput.getRegExString(in, "Enter your menu choice : ", "[OoSsVvQq]");
        if (menu.equalsIgnoreCase("O"))
            System.out.println("Your nenu choice is Open.");
        else if (menu.equalsIgnoreCase("S"))
            System.out.println("Your nenu choice is Save.");
        else if (menu.equalsIgnoreCase("V"))
            System.out.println("Your nenu choice is View.");
        else if (menu.equalsIgnoreCase("Q"))
            System.out.println("Your nenu choice is Quit.");
    }
}
