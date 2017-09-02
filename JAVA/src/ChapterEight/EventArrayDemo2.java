package ChapterEight;

import javax.swing.*;

public class EventArrayDemo2
{
    public static void main(String[] args)
    {
        String[] eventTypes = {"", "Private", "Corporate", "Non-profit"};

        StringBuilder choicesString = new StringBuilder();
        String strSelectedEvent;
        int selectedEvent;
        Event[] someEvents = new Event[5];
        int x;

        for (x = 1; x < eventTypes.length; ++x)
            choicesString.append("\n").append(x).append(" ").append(eventTypes[x]);

        for (x = 0; x < someEvents.length; ++x)
        {
            strSelectedEvent = JOptionPane.showInputDialog(null,
                    "Event #" + (x + 1) + " Event the number for the type of event want"
            + choicesString);

            selectedEvent = Integer.parseInt(strSelectedEvent);

            if (selectedEvent < 1 || selectedEvent > 3)
                selectedEvent = 0;

            someEvents[x] = new Event(selectedEvent);
        }

        for (x = 0; x < someEvents.length; ++x)
            System.out.println(someEvents[x].getTypeOfEvent() +
            " " + eventTypes[someEvents[x].getTypeOfEvent()] +
            " " + someEvents[x].getRate() +
            " " + someEvents[x].getManager());
    }
}
