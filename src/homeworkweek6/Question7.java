package homeworkweek6;

public class Question7 {
    //Write a program to insert any temperature value in degree Fahrenheit and
    //convert to degree Celsius
    public static void main(String[] args) {
        float F, Celsius;
        F = 105;
        Celsius = ((F - 32) * 5 / 9);
        System.out.println("Celsius is: " + Celsius);
    }
}
