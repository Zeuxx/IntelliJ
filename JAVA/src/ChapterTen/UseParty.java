package ChapterTen;

import javax.swing.*;

public class UseParty
{
    public static void main(String[] args)
    {
        // Create a Party
        Party aParty = new Party();
        aParty.inputGuests();
        aParty.displayGuests();

        // Create a DinnerParty
        JOptionPane.showMessageDialog(null,
                "Creating a party");

        // Construct a DinnerParty object
        DinnerParty aDinnerParty = new DinnerParty();
        // Display a message so that when the application
        // is run it is understood that a DinnerParty is being
        // created.
        JOptionPane.showMessageDialog(null,
                "Creating a party with dinner");
        // Set the number of guests and dinner choice for the
        // DinnerParty object
        aDinnerParty.inputGuests();
        aDinnerParty.inputDinnerChoice();
        // Display the entered data
        aDinnerParty.displayGuests();
        aDinnerParty.displayDinnerChoice();
    }
}
