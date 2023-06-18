package Pack1;

public class Month {
    public static void showMonthDays(int monthNumber) {
        int days;

        switch (monthNumber) {
            case 1: // January
                days = 31;
                break;
            case 2: // February
                days = 28;
                break;
            case 3: // March
                days = 31;
                break;
            case 4: // April
                days = 30;
                break;
            case 5: // May
                days = 31;
                break;
            case 6: // June
                days = 30;
                break;
            case 7: // July
                days = 31;
                break;
            case 8: // August
                days = 31;
                break;
            case 9: // September
                days = 30;
                break;
            case 10: // October
                days = 31;
                break;
            case 11: // November
                days = 30;
                break;
            case 12: // December
                days = 31;
                break;
            default:
                System.out.println("Invalid month number: " + monthNumber);
                return;
        }

        System.out.println("Month number " + monthNumber + " of " + "2023" + " has " + days + " days.");
    }

    public static void main(String[] args) {
        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            showMonthDays(monthNumber);
        }
    }
}