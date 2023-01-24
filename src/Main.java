import java.util.*;
public  class Main {

    public static void main(String[] args) {


        /**Days days = Days.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
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

        }*/
                List<Integer> run = new ArrayList<>();
                LinkedHashSet<Integer> abv = new LinkedHashSet<>();
                Random rn = new Random();
                int sum = 0;
                for (int i = 0; i < 50; i++){
                    run.add(rn.nextInt(1,100));

                }
                for (int a :run) {
                    abv.add(a);

                }
                for ( int d :abv) {
                    sum+=d;
                }
                System.out.println(abv);
                System.out.println(sum);
            }
        }

