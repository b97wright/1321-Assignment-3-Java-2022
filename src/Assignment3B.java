import java.util.Scanner;
import java.util.*;

public class Assignment3B {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int choice;

        System.out.print("What belt grade are you? ");
        choice = myObj.nextInt();

        switch (choice) {
            case 0:
            {    
                System.out.println("You have a black belt, \nwith 0 stripe!");
                break;
            }
            case 1:
            case 2:
            {  
                System.out.println("You have a brown belt,");  
                if(choice == 1)
                {
                    System.out.println("with 2 stripes!");  
                }
                else if (choice == 2)
                {
                    System.out.println("with 1 stripe!");  
                }
                break;
            }
            case 3:
            case 4:
            { 
                System.out.println("You have a green belt,");  
                if(choice == 3)
                {
                    System.out.println("with 2 stripes!");  
                }
                else if (choice == 4)
                {
                    System.out.println("with 1 stripe!");  
                }  
                break;
            }
            case 5:
            case 6:
            {    
                System.out.println("You have a blue belt,");  
                if(choice == 5)
                {
                    System.out.println("with 2 stripes!");  
                }
                else if (choice == 6)
                {
                    System.out.println("with 1 stripe!");  
                }
                break;
            }
            case 7:
            case 8:
            {    
                System.out.println("You have a yellow belt,");  
                if(choice == 7)
                {
                    System.out.println("with 2 stripe!");  
                }
                else if (choice == 8)
                {
                    System.out.println("with 1 stripe!");  
                }
                break;
            }
            case 9:
            case 10:
            {    
                System.out.println("You have a brown belt,");  
                if(choice == 9)
                {
                    System.out.println("with 1 stripe!");  
                }
                else if (choice == 10)
                {
                    System.out.println("with 0 stripe!");  
                }
                break;
            }
            default:
            {
                System.out.println("You have no belt...");
                break;
            }
        }

    }
}
