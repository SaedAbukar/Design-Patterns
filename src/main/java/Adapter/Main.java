package Adapter;

public class Main {

    public static void main(String[] args) {
        NewDateInterface newDateInterface = new CalendarToNewDateAdapter();
        newDateInterface.setDay(21);
        newDateInterface.setMonth(4);
        newDateInterface.setYear(2025);
        System.out.printf("The date is %d/%d/%d%n", newDateInterface.getDay(), newDateInterface.getMonth(), newDateInterface.getYear());
        newDateInterface.advanceDays(6);
        System.out.println("The date was advanced by 6 days");
        System.out.printf("The date is %d/%d/%d%n", newDateInterface.getDay(), newDateInterface.getMonth(), newDateInterface.getYear());
    }
}
