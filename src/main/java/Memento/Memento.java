package Memento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private LocalDateTime date;

    public Memento(int[] options, boolean isSelected, LocalDateTime date) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.date = date;
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public void saveTimeStamp() {
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String dateTimeString = date.format(formatter);
        return "Boxes: " + options[0] + options[1] + options[2] + " isSelected: " + String.valueOf(isSelected) + " TimeStamp: " + dateTimeString; // or any useful representation
    }
}