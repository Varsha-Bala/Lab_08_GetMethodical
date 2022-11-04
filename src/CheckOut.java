import java.util.Scanner;

public class CheckOut
{
    public static void checkOut()
    {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean moreItems = false;

        do
        {
            totalPrice += SafeInput.getRangedDouble(in, "Enter your item price $ : ", 0.50, 9.99);
            moreItems = SafeInput.getYNConfirm(in, "More items? ");
        } while (moreItems);
        System.out.printf("Total price of items : " + "$%5.2f%n", totalPrice);
    }
}
