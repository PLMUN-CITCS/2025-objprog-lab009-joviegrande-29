public class SwitchStatementDemo {
    public static void main(String[] args) {

        int dayOfWeek = 4;

        switch (dayOfWeek) {
    case 1 -> System.out.println("Monday: Start of the work week.");
    case 2 -> System.out.println("Tuesday: Keep going!");
    case 3 -> System.out.println("Wednesday: Midweek.");
    case 4 -> System.out.println("Thursday: Almost there.");
    case 5 -> System.out.println("Friday: Weekend is near.");
    case 6 -> System.out.println("Saturday: Enjoy your day off!");
    case 7 -> System.out.println("Sunday: Rest and recharge.");
    default -> System.out.println("Invalid day.");
}

    char studentGrade = 'B';

    switch (studentGrade) {
    case 'A' -> System.out.println("Excellent!");
    case 'B' -> System.out.println("Good job!");
    case 'C' -> System.out.println("Well done!");
    case 'D' -> System.out.println("You passed.");
    case 'F' -> System.out.println("Better luck next time.");
    default -> System.out.println("Invalid grade.");
}


    }
}