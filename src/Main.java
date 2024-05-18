
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreationDay creationDay = new CreationDay();

        creationDay.add(new DayEvent(1, "God created light", "🌅"));
        creationDay.add(new DayEvent(2, "God separated the sky from the waters", "🌌"));
        creationDay.add(new DayEvent(3, "God created dry land, seas, and vegetation", "🌍 🌳"));
        creationDay.add(new DayEvent(4, "God created the sun, moon, and stars", "🌞 🌜 ⭐"));
        creationDay.add(new DayEvent(5, "God created birds and sea creatures", "🐦 🐠"));
        creationDay.add(new DayEvent(6, "God created land animals and humans", "🦁 👫"));
        creationDay.add(new DayEvent(7, "God rested", "😴"));

        creationDay.displayEvents();
    }
}