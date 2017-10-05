# AlignText
Practice 1 of module CS5001 in University of St Andrews. A small program that reads in a number of paragraphs of text from a file and aligns the text with a line wrapping at a specified line length.

# Basic and Enhancements Usage
The standard input at command line after compile should be "java AlignText file_name line_length <align_mode>" where all of the three arguments should be valid.

Invalid file name or line length will result in print out an error message.

The text will be aligned to right in default if no specific align mode is input. The align modes are L for left, C for centre and J for fully justify. R for right is also valid.

# Extra Implementation
An extra function of write the aligned text into a new file is implemented. The program will print the aligned text in the command line and create a new file and write the aligned text into it as well. The running and compiling is same as basic and enhancements.

# Usage for Extra
The standard input after compile is "java AlignText file_name line_length <align_mode> <new_file_name>". If user didn't input a file name for program to create and write, it will generate a file named "new.txt" as default and write into it. If user input a specific file name to write, the program will create a new file using the input name and write into it.

# Implementation Detail
For this extra implementation, FileWriter and BufferedWriter method is used. There were three class of method being implemented for the basic and enhancements. They are readFile(), splitText() and printText(). For the extra function, printText() was changed to a static String[] function, it will return the processed text into an array of String. Then an ArrayList of String was used to get the returned string array. Finally, get rid of all the null node in the ArrayList and write it in to the new file.
