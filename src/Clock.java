
public class Clock {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println(getSeconds(18, 32, 47));
    }

    public static int getSeconds(int num1, int num2, int num3) {
        int hour = num1 * 60 * 60;
        int minutes = num2 * 60;
        int seconds = num3;

        int time = hour + minutes + seconds;
        return time;
    }

}
