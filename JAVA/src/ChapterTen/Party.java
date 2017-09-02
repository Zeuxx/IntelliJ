package ChapterTen;
import javax.swing.*;

class Party
{
    // Variable Declaration
    private int guests;

    // Diplay Method
    void displayGuests()
    {
        JOptionPane.showMessageDialog(null, "Guests: " + guests);
    }

    // Prompt User
    void inputGuests()
    {
        String guestsString;
        guestsString = JOptionPane.showInputDialog(null,
                "Enter the number of guests at your party ");
        guests = Integer.parseInt(guestsString);
    }
}
