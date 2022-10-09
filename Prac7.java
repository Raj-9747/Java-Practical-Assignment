/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : Write a method public static int readInFile(String line, File file) that returns the 
            position number of a line in the file filename or −1 if there is no such line or file. 
            Assume that this file contains names of people with a name per line. Names (and 
            hence lines) are listed in ascending alphabetical order in the file. We can not find the 
            same line twice.
 */
import java.io.*;
import java.util.Scanner;

public class Prac7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line to search: ");
        String SearchLine = sc.nextLine();
        sc.close();
        int count = 1;
        try {
            String path = "C:\\Users\\Aryan\\OneDrive\\Desktop\\#PracticaL_Assignment\\List.txt";
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line;
            // Reading file line by line
            while ((line = br.readLine()) != null) {
                if (SearchLine.equals(line.toString()))
                    System.out.println("Line number = " + count);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}