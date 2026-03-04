import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskList {
    private ArrayList<Task> tasks = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public void handler(String input) {

        String[] parts = input.split(" ", 3);
        int count = 0;
        String command = parts[0];
        
        switch (command) {

            case "add":
                addTask(parts[1]);
                System.out.println("Task added successfully (ID:" + count + ")");
                ++count;
                break;

            case "delete":
                int deleteId = Integer.parseInt(parts[1]);
                deleteTask(deleteId);
                break;

            case "update":
                int updateId = Integer.parseInt(parts[1]);
                updateTask(updateId, parts[2]);
                break;

            case "mark-in-progress":
                int mpId = Integer.parseInt(parts[1]);
                updateStatus(command, mpId);
                break;

            case "mark-done":
                int mkId = Integer.parseInt(parts[1]);
                updateStatus(command, mkId);
                break;

            case "list":
                listTasks();

            default:
                break;
        }
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);

    }

    public void updateTask(int id, String description) {
        tasks.get(id).setDescription(description);
    }

    public void deleteTask(int id) {
        tasks.remove(id);
    }

    public void updateStatus(String status, int id) {
        tasks.get(id).setStatus(status);
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("ID: " + i + " - " + tasks.get(i).getDescription());
        }
    }

    public void listTasks(String status){
        if(status.equals("done")){
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getStatus().equals("done")){}
                System.out.println("ID: " + i + " - " + tasks.get(i).getDescription());
            }
        }
        else if (status.equals("todo")) {
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getStatus().equals("todo")){}
                System.out.println("ID: " + i + " - " + tasks.get(i).getDescription());
            }
        }


        else if (status.equals("in-progress")){
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getStatus().equals("in-progress")){}
                System.out.println("ID: " + i + " - " + tasks.get(i));
            }
        }
    }
}