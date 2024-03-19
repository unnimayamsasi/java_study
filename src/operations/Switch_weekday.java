package operations;

public class Switch_weekday {
    public static void main(String[] args) {
        int dayNumber = 3;
        String weekday;
        switch (dayNumber) {

            case 1:
                weekday = "monday";
                break;
            case 2:
                weekday = "tuesday";
                break;
            case 3:
                weekday = "wednesday";
                break;
            case 4:
                weekday = "thursday";
                break;
            case 5:
                weekday = "friday";
                break;
            case 6:
                weekday = "saturday";
                break;
            case 7:
                weekday = "sunday";
                break;
            default:
                weekday = "invalid";
                break;
        }
        System.out.println("day number " + dayNumber + " corresponds to " + weekday);
    }
}
