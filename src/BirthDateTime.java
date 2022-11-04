import java.util.Scanner;

public class BirthDateTime
{
    public static void birthDateTime()
    {
        Scanner in = new Scanner(System.in);
        int retYear = 0;
        int retMonth = 0;
        int retDay = 0;
        boolean retLeap = false;
        int retEndDay = 0;
        int retHours = 0;
        int retMinutes = 0 ;
        String birthDateTime = "";

        retYear = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2010);
        if (retYear % 4 == 0)
            retLeap = true;
        retMonth = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12);
        switch(retMonth)
        {
            case 2 :
                if (retLeap)
                    retEndDay = 29;
                else retEndDay = 28;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                retEndDay = 30;
                break;
            default :
                retEndDay = 31;
                break;
        }
        retDay = SafeInput.getRangedInt(in, "Enter your birth day ", 1, retEndDay);
        retHours = SafeInput.getRangedInt(in, "Enter your birth hours ", 1, 24);
        retMinutes = SafeInput.getRangedInt(in, "Enter your birth minutes ", 1, 59);

        System.out.println("\nYour birth date time is : " + retYear + "/" + retMonth + "/" + retDay + " " + retHours + " hours: " + retMinutes + " minutes.");
    }
}
