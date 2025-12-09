/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hpro2
 */
import java.io.*; 		// Import goes at the top   

public class Trader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        readFile("receipts.txt");
    }

    public static void readFile(String fileName) {
        String fileContents = "";       	// Used later to hold all chars in the file
        try {
            File filePath = new File(Trader.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            fileName = filePath.getParent() + File.separator + fileName;  // File.separator = "/"   
            FileReader fileReader = new FileReader(fileName);  // FileReader reads text files
            int character; // Holds numeric value of char one at a time
            while ((character = fileReader.read()) != -1) {   // char values start at 0, -1 means done
                // Do whatever you need to do with each char here
                // Cast the int value of character to actual char if you need a char like example below
                fileContents += (char) character;
            }
            fileReader.close(); // Always close!!
            System.out.println("\nFile Contents:\n" + fileContents);    // If you want to print...
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to find file '" + fileName + "'");    // Format as required
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        } catch (Exception ex) {
            System.err.println(ex);
        }   // Make sure to use the above catch statements!
// If you are having trouble, make copies of the txt file and put in multiple folders
// You can also add the following code into the beginning of the try statement above

    }
}
