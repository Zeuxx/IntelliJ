package ChapterTen;

import javax.swing.*;

class DinnerParty extends Party
{
    private int dinnerChoice;
    private final int BEEF_CHOICE = 1;
    private final int CHICKEN_CHOICE = 2;

    void displayDinnerChoice()
    {
        if (dinnerChoice == BEEF_CHOICE)
            JOptionPane.showMessageDialog(null,
                    "Dinner choice is beef");
        else
            JOptionPane.showMessageDialog(null,
                    "Dinner choice is chicken");
    }

    void inputDinnerChoice()
    {
        String choice;
        choice = JOptionPane.showInputDialog(null,
                "Enter dinner choice\n" + BEEF_CHOICE +
        "for beef, " + CHICKEN_CHOICE + " for chicken");
        dinnerChoice = Integer.parseInt(choice);
    }
}
