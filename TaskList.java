import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskList
{
    private ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TaskList tasklist = new TaskList();
        while (true) {
        String input = s.next();
        tasklist.handler(input);
        }       
    }

    private void handler(String input){
        String [] parts = input.split(" ", 2);

        switch (parts[0]) {
            case "add":
                addTask(input);
                break;
        
            default:
                break;
        }

    }
    
    public void addTask(String description){
        Task task = new Task(description);
        tasks.add(task);
    }

    public void updateTask(int id,String description){
        tasks.get(id).setDescription(description);
    }
}