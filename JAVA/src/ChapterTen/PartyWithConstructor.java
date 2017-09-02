package ChapterTen;

import javax.swing.*;

public class PartyWithConstructor
{
    // Variable Declaration
    private int guests;

    // Constructor
    PartyWithConstructor()
    {
        System.out.println("Creating a Party");
    }

    // Constructor with parameter
    public PartyWithConstructor(int numGuests)
    {
        this.guests = numGuests;
        System.out.println("This also worked");
    }

    // Diplay Method
    public void displayGuests()
    {
        JOptionPane.showMessageDialog(null, "Guests: " + guests);
    }

    // Prompt User
    public void inputGuests()
    {
        String guestsString;
        guestsString = JOptionPane.showInputDialog(null,
                "Enter the number of guests at your party ");
        guests = Integer.parseInt(guestsString);
    }
}
