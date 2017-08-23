package ChapterFive;
import java.util.Scanner;

/*
Declare the variables and constants this application will use. You will ask the user
to enter an integer eventType. The values of the event types and the names of the
managers for private and corporate events are stored as symbolic constants; the chosen
manager will be assigned to the chosenManager string
 */
public class ChooseManager
    {
        public static void main(String[] args)
            {
                // Declare variables and constants
                int eventType;
                String chosenManager;
                final int PRIVATE_CODE = 1;
                final int CORPORATE_CODE = 2;
                final String PRIV_MANAGER = "Dustin Britt";
                final String CORP_MANAGER = "Carmen Lindsey";

                // Define the input device, then add the code that prompts the user
                // to enter a 1 or 2 depending on the event type being schedules, and accept the response
                Scanner input = new Scanner(System.in);
                System.out.println("That type of event are you scheduling?");;
                System.out.print("Enter " + PRIVATE_CODE + "  for private, " + CORPORATE_CODE + " for corporate... ");
                eventType = input.nextInt();

                // Use an if-else statement to choose the name of the manager to be assigned to the
                // chosenManager string
                if (eventType == PRIVATE_CODE || eventType == CORPORATE_CODE)
                    {
                        if (eventType == PRIVATE_CODE)
                            chosenManager = PRIV_MANAGER;
                        else
                            chosenManager = CORP_MANAGER;
                    } else {
                    System.out.println("Did not enter a valid value.");
                    chosenManager = "";
                }

                // Display the chosen code and corresponding manager's name
                System.out.println("You entered " + eventType);
                System.out.println("Manager for this event will be " + chosenManager);
            }
    }
