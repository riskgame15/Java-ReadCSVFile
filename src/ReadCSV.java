
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "countries.csv";
        readFile(filePath);
    }

    public static void readFile(String filePath) {
        try (
                FileReader fileReader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(convertToFullInfor(line));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error content");
        }
    }

    private static String convertToFullInfor(String line) {
        String[] properties = line.split(",");
        return "ID: " + properties[0]
                + "; Code: " + properties[1]
                + "; Name: " + properties[2];
    }
}
