import java.util.*;

public class Task {
    String priority;
    int deadline;
    String description;
    String taskDay;
    Calendary calendary = new Calendary();

    public Task(String priority, int deadline, String description) {
        this.priority = priority;
        this.deadline = deadline;
        this.description = description;
        this.taskDay = calendary.setDate(deadline);
    }

    @Override
    public String toString() {
        return "Приоритет " + priority + "; Задача - " + description+ "; Дней осталось " + deadline + "; Дата сдачи " + taskDay;
    }
}
