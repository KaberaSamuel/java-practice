public class Checker {
    public boolean isDayOfWeek(String string) {
        String regex = "mon|tue|wed|thu|fri|sat|sun";

        return string.matches(regex);
    }
}