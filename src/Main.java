import java.io.StringReader;
import java.time.format.SignStyle;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        taskAdd();

    }

    static void taskAdd() {
        boolean x = true;
        TaskList taskList = new TaskList();
        while (x) {
            System.out.println("1. - Добавить задачу\n" +
                    "2. - Удалить задачу \n" +
                    "3. - Посмотреть список задач \n" +
                    "4. - Запись в файл \n" +
                    "5. - Выход ");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            if (num.equals("1")){
                System.out.println("Приоритет задачи ");
                String prior = scanner.nextLine();
                System.out.println("Напишите вашу задачу ");
                String dis = scanner.nextLine();
                System.out.println("Дней на выполнение ");
                int deadL = scanner.nextInt();
                Task task = new Task(prior, deadL,dis);
                taskList.addTask(task);
            }
            if (num.equals("2")) {
                System.out.println("Какую задачу удалить? ");
                int n = scanner.nextInt();
                taskList.remoov(n);

            }
            if (num.equals("4")) {
                taskList.printFail();
            }
            if (num.equals("3")) {
                taskList.print();
            }
            if (num.equals("5")) {
                x = false;
            }
        }


    }
}