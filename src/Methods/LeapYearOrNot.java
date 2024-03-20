package Methods;

public class LeapYearOrNot {
    public static void main(String[] args) {
        int year=2023;
        boolean isLeapYear=checkLeapYear(year);
        if(isLeapYear){
            System.out.println("leapyear");
        }else{
            System.out.println("not a leapyear");
        }

    }
    public static boolean checkLeapYear(int year){
        return (year%4==0 && year%100 !=0)||(year%400==0);

    }
}
