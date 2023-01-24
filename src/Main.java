import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        Days days = Days.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        switch (days){
            case MONDAY:
                System.out.println(Days.MONDAY+days.getDays());
                break;
            case TUESDAY:
                System.out.println(Days.TUESDAY+days.getDays());
                break;
            case WEDNESDAY:
                System.out.println(Days.WEDNESDAY+days.getDays());
                break;
            case THURSDAY:
                System.out.println(Days.THURSDAY+days.getDays());
                break;
            case FRIDAY:
                System.out.println(Days.FRIDAY+days.getDays());
                break;
            case SATURDAY:
                System.out.println(Days.SATURDAY+days.getDays());
                break;
            case SUNDAY:
                System.out.println(Days.SUNDAY+days.getDays());
            default:
                System.out.println("sdfghj");

                break;

        }

    }


}
