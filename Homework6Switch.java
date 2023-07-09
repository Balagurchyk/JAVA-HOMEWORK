package Homework;

public class Homework6Switch {
    public static void main(String[] args) {
        MonthInYear mesyats = MonthInYear.MARCH;
        int x = Chislo(mesyats);
        System.out.println("В " + mesyats + " " + x + " день/дней");
    }
    public static int Chislo(MonthInYear mon) {
        switch (mon) {
            case JANUARY :
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            case FEBRUARY:
            default:
                return 28;
        }
    }
    public enum MonthInYear {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
}
