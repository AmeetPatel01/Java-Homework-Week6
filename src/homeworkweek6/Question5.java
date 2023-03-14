package homeworkweek6;

public class Question5 {
    //Write a program for a calculator with addition, subtraction, multiplication
    //and division methods
    int a = 100;
    int b = 200;
    int c = 10;
    int d = 20;
    public static void main(String[] args) {
        myAdds();
        mySubtract();
       Question5 methodThree = new Question5();
        methodThree.myMultiplication();
        Question5 methodFour = new Question5();
        methodFour.myDivision();
    }
    public static void myAdds() {
        Question5 question5 = new Question5();
        String s = (question5.a) + (question5.b) + (question5.c) + (question5.d) + " Addition";
        System.out.println(s);
    }
    public static void mySubtract() {
        Question5 question5 = new Question5();
        String s = (question5.a) - (question5.b) - (question5.c) - (question5.d) + " Subtraction";
        System.out.println(s);
    }
    public void myMultiplication() {
        String s = a * b * c * d + " Multiplication";
        System.out.println(s);
    }
    public void myDivision() {
        String s = a / b / c / d + "  Division";
        System.out.println(s);
    }
}
