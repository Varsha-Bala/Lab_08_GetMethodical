import java.util.Scanner;

public class GetUserName
{
    public static void getUserName()
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLengthString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLengthString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
