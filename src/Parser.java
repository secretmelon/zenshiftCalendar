import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private ArrayList<String> details = new ArrayList<String>;

    public void readFile(File csv) {
        try {
            BufferedReader buf = new BufferedReader(new FileReader(csv));
            String[] currentLine;
            String lineJustFetched = null;

            // initialise each component of node object
            String subject;
            String startDate;
            String startTime;
            String endDate;
            String endTime;
            String allDay;
            String description;
            String location;
            String UID;

            for (lineJustFetched = buf.readLine(); lineJustFetched != null; lineJustFetched = buf.readLine()) {
                currentLine = lineJustFetched.split(","); //put the read line into array

                subject     = currentLine[0];
                details.add(subject);
                startDate   = currentLine[1];
                details.add(startDate);
                startTime   = currentLine[2];
                details.add(startTime);
                endDate     = currentLine[3];
                details.add(endDate);
                endTime     = currentLine[4];
                details.add(endTime);
                allDay      = currentLine[5];
                details.add(allDay);
                description = currentLine[6];
                details.add(description);
                location    = currentLine[7];
                details.add(location);
                UID         = currentLine[8];
                details.add(UID);

                //convertStrings(details);




            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void convertStrings(ArrayList<String> components){

    }
}
