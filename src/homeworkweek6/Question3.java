package homeworkweek6;
public class Question3 {
    //Write a Java programme using the following steps.
    int xyz = 123;
    static int zxy = 321;
    public static void main(String[] args) {
        myLuckyNumber();
        Question3 obj = new Question3();
        obj.myFavoriteNumber();
    }
    public static void myLuckyNumber() {
        System.out.println(zxy);
        Question3 Question = new Question3();
        System.out.println(Question.xyz);
    }
    void myFavoriteNumber() {
        System.out.println(xyz);
        System.out.println(Question3.zxy);
    }
}
