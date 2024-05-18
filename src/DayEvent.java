public class DayEvent {
    private int day;
    private String description;
    private String visual;

    public DayEvent(int day, String description, String visual) {
        this.day = day;
        this.description = description;
        this.visual = visual;
    }

    public int getDay() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public String getVisual() {
        return visual;
    }

    @Override
    public String toString() {
        return "Day " + day + ": " + description + " " + visual;
    }
}