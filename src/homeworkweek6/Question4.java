package homeworkweek6;

public class Question4 {
    //Write a Java programme using the following steps
    int a = 10;
    int b = 20;
    static String name = "Dollar";
    static String currency = "Pound";
    public static void main(String[] args) {
        spendMoney();
        Question4 obj = new Question4();
        obj.callMe();
    }
    public void callMe() {
        System.out.println(a);
        System.out.println(b);
        Question4 question4 = new Question4();
        System.out.println(question4.name);
        System.out.println(question4.currency);
    }
    public static void spendMoney() {
        System.out.println(name);
        System.out.println(currency);
        Question4 question4 = new Question4();
        System.out.println(question4.a);
        System.out.println(question4.b);
    }
}
