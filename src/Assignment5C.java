import java.util.Scanner;
import java.util.*;

public class Assignment5C {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String device;
        double version;
        boolean isNFC;

        System.out.println("What mobile device do you have? ");
        device = myObj.nextLine();

        device = device.toLowerCase();

        switch (device) {
            case "apple":
            case "android":
                System.out.println("What version do you have? ");
                uI = Console.ReadLine();
                version = Convert.ToDouble(uI);

                if (version >= 10)
                {
                    Console.WriteLine("Congratulations, you can run the app! ");
                    break;
                }

                isNFC = true;

                break;
            default:
                Console.WriteLine("I’m sorry.");
                break;
        }

    }
}
