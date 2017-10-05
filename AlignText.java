import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CS5001 Practice 1 - Align Text.
 * 
 * @author Bin Lin 170008965
 * @version 1
 */
public class AlignText {
    /**
     * Main method for text align.
     * 
     * @param args
     *            Input arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // Get text from file
            String[] parags = GetText.readFile(args[0]);
            // Get expected column from user input
            int column = Integer.valueOf(args[1]);
            ArrayList<String> tofile = new ArrayList<String>();
            ArrayList<String> temp = new ArrayList<String>();
            final int basicArgsLength = 2;
            final int wFileName = 3;
            final int extraArgsLength = 4;
            String wfname = "";
            char mode;
            // Get expected align mode
            if (args.length == basicArgsLength) {
                mode = 'R';
            } else {
                mode = args[2].charAt(0);
            }
            // Get expected file to be written in
            if (args.length == extraArgsLength) {
                wfname = args[wFileName];
            } else {
                // Set "new.txt" as default new file if user didn't input any specific name
                wfname = "new.txt";
            }
            // Initiate file writer
            FileWriter fw = new FileWriter(wfname);
            BufferedWriter bw = new BufferedWriter(fw);
            // Process the text
            for (int i = 0; i < parags.length; i++) {
                // Invoke split function to split words of text
                String[] words = SpiltText.splitText(parags[i]);
                /*
                 * Invoke align and print function to align text and print
                 * according to the input column (for extra function)Stored the
                 * processed text into an array list of string
                 */
                String[] alignedTx = PrintText.printText(words, column, mode);
                for (int j = 0; j < alignedTx.length; j++) {
                    tofile.add(alignedTx[j]);
                }
            }
            // Get rid of all null node in the array list
            for (int m = 0; m < tofile.size(); m++) {
                if (tofile.get(m) != null) {
                    temp.add(tofile.get(m));
                }
            }
            tofile = temp;
            // Write into file
            for (int n = 0; n < tofile.size(); n++) {
                bw.write(tofile.get(n).toString());
                bw.flush();
            }
            bw.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("usage: java AlignText file_name line_length <align_mode>");
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("usage: java AlignText file_name line_length <align_mode>");
            System.exit(0);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("usage: java AlignText file_name line_length <align_mode>");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("I/O Ooops: " + e.getMessage());
            System.exit(0);
        }

    }

}
