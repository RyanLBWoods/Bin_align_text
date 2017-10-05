/**
 * Methods of align and print text according to the input request.
 * 
 * @author bl41
 * @version 1
 */
public class PrintText {
    /**
     * Method for aligning text and print.
     * 
     * @param words
     *            Words of the context
     * @param column
     *            Required line length get from input argument
     * @param mode
     *            Required align mode get from input argument
     * @return lines Return an array of string that contains the align text
     */
    public static String[] printText(String[] words, int column, char mode) {

        int pLength = 0; // printed length
        int remain = column; // remain length in line
        int j = 0; // counter for printed lines

        String line = new String(); // line to store the executed words
        // String array to store executed line
        String[] lines = new String[words.length];

        // Combine words into line
        // Store line in a String array called lines
        for (int i = 0; i < words.length; i++) {
            if ((words[i].length() - 1) <= remain && remain != 0) {
                line = line + words[i];
                pLength = pLength + words[i].length();
                remain = column - pLength;
            } else if (words[i].length() > remain || remain == 0) {
                lines[j] = line.substring(0, line.length() - 1) + "\n";
                j = j + 1;
                line = words[i];
                pLength = words[i].length();
                remain = column - pLength;
            }
        }

        // Deal with the last line
        lines[j] = line.substring(0, line.length() - 1) + "\n";

        // Print context
        int k = 0;
        // A string buffer for spaces that are needed to insert
        StringBuffer spaces = new StringBuffer();
        // Print output
        switch (mode) {
        // Invalid mode input
        default:
            System.out.println("usage: java AlignText file_name line_length <align_mode>");
            break;
        // Right align text
        // Insert spaces before lines
        case 'R':
            while (lines[k] != null) {
                int b = column - lines[k].length(); // counter for needed spaces
                for (int a = 0; a <= b; a++) {
                    spaces.append(" ");
                }
                // tolines.add(spaces.toString() + lines[k]);
                lines[k] = spaces.toString() + lines[k];
                System.out.print(lines[k]);
                spaces = new StringBuffer();
                k++;
            }
            return lines;
        // Left align
        // Directly print lines
        case 'L':
            while (lines[k] != null) {
                // tolines.add(lines[k]);
                System.out.print(lines[k]);
                k++;
            }
            return lines;
        // Centre align text
        // Insert half of needed spaces in front of lines
        // Insert n/2 + 1 if odd number needed spaces
        case 'C':
            int cspace;
            while (lines[k] != null) {
                // counter for needed spaces
                cspace = (column - (lines[k].length() - 1));

                if (cspace % 2 == 0) {
                    // Even number
                    cspace = cspace / 2;
                    for (int a = 0; a < cspace; a++) {
                        spaces.append(" ");
                    }
                } else if (cspace % 2 == 1) {
                    // Odd number
                    cspace = cspace / 2 + 1;
                    for (int a = 0; a < cspace; a++) {
                        spaces.append(" ");
                    }
                }
                // tolines.add(spaces.toString() + lines[k]);
                lines[k] = spaces.toString() + lines[k];
                System.out.print(lines[k]);
                spaces = new StringBuffer();
                k++;
            }
            return lines;
        // Justify align
        // Insert spaces back words per existed spaces
        case 'J':
            StringBuilder jstr;
            int jspace;

            while (lines[k] != null) {
                // If it is the last line, print it directly
                if (lines[k + 1] == null) {
                    // tolines.add(lines[k]);
                    System.out.print(lines[k]);
                    break;
                }

                jspace = column - (lines[k].length() - 1); // counter for
                                                           // required spaces
                int inspace = 0; // counter for inserted spaces

                while (inspace < jspace) {
                    /*
                     * Insert one space at the end of line if no spaces existed
                     * in a line to avoid loop run infinitely
                     */
                    if (!lines[k].contains(" ")) {
                        jstr = new StringBuilder(lines[k]);
                        jstr.insert(lines[k].length() - 1, " ");
                        lines[k] = jstr.toString();
                    }

                    int m = lines[k].length() - 1; // counter for line length
                    // Search the line from back words
                    while (m > 0) {
                        if (lines[k].charAt(m) == ' ') {
                            // Find the very in front space of each blank
                            while (lines[k].charAt(m - 1) == ' ') {
                                m--;
                            }
                            jstr = new StringBuilder(lines[k]);
                            jstr.insert(m, " ");
                            lines[k] = jstr.toString();
                            inspace++;
                        }
                        // Jump out of the loop if it has inserted enough spaces
                        if (inspace == jspace) {
                            break;
                        }
                        m--;
                    }
                }
                // tolines.add(lines[k]);
                System.out.print(lines[k]);
                k++;
            }
            return lines;
        }
        System.out.println();
        return null;

    }
}
