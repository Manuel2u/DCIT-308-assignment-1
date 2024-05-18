import java.util.ArrayList;
import java.util.List;
public class CreationDay implements ListADT<DayEvent> {
    private List<DayEvent> events;

    public CreationDay() {
        events = new ArrayList<>();
    }

    @Override
    public void add(DayEvent element) {
        events.add(element);
    }

    @Override
    public DayEvent remove(int index) {
        return events.remove(index);
    }

    @Override
    public DayEvent get(int index) {
        return events.get(index);
    }

    @Override
    public int size() {
        return events.size();
    }

    @Override
    public boolean isEmpty() {
        return events.isEmpty();
    }

    public void displayEvents() {
        for (DayEvent event : events) {
            System.out.println(event);
        }
    }
}