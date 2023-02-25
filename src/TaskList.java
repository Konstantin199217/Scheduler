import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TaskList {

    HashMap<Integer, Task> hashMap =new HashMap<>();

    int count = 1;
    public void addTask(Task task){
        hashMap.put(count, task);
        count++;
    }

    public void remoov(int num){
        hashMap.keySet().remove(num);
        count++;
    }
    public void print() {
        for (Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void printFail(){
        try(FileWriter writer = new FileWriter("File.txt", false))
        {
            for (Map.Entry entry: hashMap.entrySet()){
                writer.append(entry.getKey().toString());
                writer.append(entry.getValue().toString());
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
