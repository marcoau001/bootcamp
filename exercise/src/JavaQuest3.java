import java.util.Scanner;

public class JavaQuest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = scanner.nextInt();

        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        int numDays = getDaysInMonth(month, year);

        if (numDays == 0) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            String monthName = getMonthName(month);
            System.out.println(monthName + " " + year + " has " + numDays + " days");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        int days;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }
}