# AlignText
Practice 1 of module CS5001 in University of St Andrews. A small program that reads in a number of paragraphs of text from a file and aligns the text with a line wrapping at a specified line length.

# Usage
The standard input at command line after compile should be "java AlignText file_name line_length <align_mode>" where all of the three arguments should be valid.

Invalid file name or line length will result in print out a error message.

The text will be aligned to right in default if no specific align mode is input. The align modes are L for left, C for centre and J for fully justify. R for right is also valid.

# Implementation
All functions including basic and enhancements were attempted and succeed.

1. GetText.java: Get context from file.(codes are provide by lecturer)

Using FileReader() method to read the contents and store them into a BufferReader. Declare an ArrayList of String, use it to store the whole context. Decalre an array of string to store each paragraphs from the ArrayList.

2. SplitText.java: Spilt context into words and store them in an Array of string.

Declare an ArrayList of string, using String.split() method to split each single word and store them into the ArrayList. Declare an array of string and put each word from the ArrayList into it trailling with a space.

3. PrintText.java: Align text according to the input and print them out.

This class runs two functions, it first process the text and then align and print it.

  3.1. Process Text: put words that get from the split class into an array of string, each node of the array is one line of the text within required length. Use a string to pass the processed line into the array. Load one word each time and calculate the length afterwards, if the remain length is not enought for the next word or the line is full, load next word into next line. Since each word is trailling with a space, at the end of processing, String.substring() is used to get rid of the last space of each line and trailling with a line feed '\n'.
  3.2. Align Text: Use a swith() method to deal with the input align mode. The default align mode is right align which means if no align mode is input, it will align text to the right and print it. This function process one line each time.
  
  Right align: each processed line have their certain length, use the input length minus the line length to get how many spaces are needed, then set an empty StringBuffer, input spaces to the string buffer. Finally, print the StringBuffer and the line.
  
  Left align: the default print in command line is left align, therefore, just directly print each processed line out would be sufficient.
  
  Centre align: seperate three different condition, when the needed number of spaces is an even number, divide the number by two, and put them at the front of the line as how right align do and print it; when the needed number is one, just put it at the front of the line and print it; when the needed number of spaces is odd and bigger than one, divide number by two and plus one, then put them at the front of the line as right align do and print it.
