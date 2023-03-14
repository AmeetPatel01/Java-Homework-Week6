package homeworkweek6;
//Write a Java program to convert a given string into lowercase
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println("Output string:   " + line);
    }
}
