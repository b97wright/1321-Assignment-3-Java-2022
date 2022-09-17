import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import java.util.*;

public class Assignment3A {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int choice;

        System.out.println("Hello stranger! Do you have time to hear my tale?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        choice = myObj.nextInt();
        if(choice == 1)
        {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!");
            System.out.println("1) That's awful!");
            System.out.println("2) What can I do?");
            choice = myObj.nextInt();
            if(choice == 1)
            {
                System.out.println("Alas, it is truly terrible...");
            }
            System.out.println("Please, you must journey to Pax Bisonica and free our country!");
            System.out.println("1) Yes");
            System.out.println("2) No");
            choice = myObj.nextInt();
            if(choice == 1)
            {
                System.out.println("Hooray!");
            }
            else if(choice == 2)
            {
                System.out.println("Then all is lost...");
            }
        }
        else if (choice == 2)
        {
            System.out.println("Ah, then goodbye...");
            
        }

    }
}
