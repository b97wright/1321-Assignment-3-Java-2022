import java.util.Scanner;
import java.util.*;

public class Assignment5C {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String device, choice;
        double version;
        boolean isNFC = false;

        System.out.print("What mobile device do you have? ");
        device = myObj.nextLine();

        device = device.toLowerCase();

        switch (device) {
            case "apple":
            case "android":
                System.out.print("What version do you have? ");
                version = myObj.nextDouble();

                if (version >= 10)
                {
                    System.out.print("Congratulations, you can run the app! ");
                    break;
                }

                isNFC = true;

                break;
            default:
                System.out.print("I'm sorry.");
                break;
        }

        if (isNFC == true)
            {
                System.out.print("Does your device support NFC? ");
                choice = myObj.next();

                choice = choice.toLowerCase();

                switch (choice)
                {
                    case "yes":
                        System.out.print("Congratulations, you can run the app!  ");
                        break;
                    case "no":
                        System.out.print("I'm sorry, our app does not support your device.  ");
                        break;
                    default:
                        System.out.print("Invalid Input! ");
                        break;
                }
            }

    }
}
