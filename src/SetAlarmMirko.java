import java.util.Scanner;

public class SetAlarmMirko {

    static final int HOURS = 24;
    static final int ALARM = 45;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        if (minutes < ALARM){
            hours = hours -1;
            if (hours<0){
                hours = HOURS - (hours*-1);
            }
            minutes = (60%ALARM) + minutes;
        }else{
            minutes = minutes - ALARM;
        }
        System.out.println(hours + " "+ minutes);
    }
}
