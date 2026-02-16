import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class List
{
    private ArrayList<Task> tasks = new ArrayList<>();
    
    public void addTask(String description){
        Task task = new Task(description);
        tasks.add(task);
    }





}

