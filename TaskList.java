import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskList
{
    private ArrayList<Task> tasks = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        TaskList tasklist = new TaskList();
        while (true) {
        String input = s.next();
        tasklist.handler(input);
        }       
    }

    private void handler(String input){

        input = s.nextLine();
        int count = 0;

         if (input.startsWith("add")) {
                addTask(input);
                System.out.println("Task added successfully (ID:" +tasks.get(count)+ ")" );
                ++count;
        }

        if (input.startsWith("delete")) {
            deleteTask();
        }


    }
    
    public void addTask(String description){
        Task task = new Task(description);
        tasks.add(task);
        
    }

    public void updateTask(int id,String description){
        tasks.get(id).setDescription(description);
    }

    public void deleteTask(int id) {
        tasks.remove(tasks.get(id));
    }

    public void updateStatus(String status, int id)
    {

    }
}