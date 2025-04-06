package src;

public class SwitchCaseNewUpdate {
    public static void main(String[] args) {
        String day = "Monday";
        String result = switch (day) {
            case "Saturday", "Sunday" -> "6am";
            default -> "8am";
        };
        System.out.println(result);
    }
}
