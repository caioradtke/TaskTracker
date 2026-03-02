import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskList {
    private ArrayList<Task> tasks = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        TaskList tasklist = new TaskList();
        while (true) {
            String input = s.next();
            tasklist.handler(input);
        }
    }

    public void handler(String input) {

        input = s.nextLine();
        String[] parts = input.split(" ", 3);
        int count = 0;
        String command = parts[0];
        
        switch (command) {

            case "add":
                addTask(parts[1]);
                System.out.println("Task added successfully (ID:" + tasks.get(count) + ")");
                ++count;
                break;

            case "delete":
                int deleteId = Integer.parseInt(parts[1]);
                deleteTask(deleteId);
                break;

            case "update":
                int updateId = Integer.parseInt(parts[1]);
                updateTask(updateId, command);
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
                switch (parts[1]) {

                    case "done":

                        break;

                    default:
                        listTasks();
                        break;
                }

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
        tasks.remove(tasks.get(id));
    }

    public void updateStatus(String status, int id) {
        tasks.get(id).setStatus(status);
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("ID: " + i + " - " + tasks.get(i));
        }
    }

    public void listTasks(String status){
        if(status.equals("done")){
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getStatus().equals("done")){}
                System.out.println("ID: " + i + " - " + tasks.get(i));
            }
        }
        else if (status.equals("todo")) {
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getStatus().equals("todo")){}
                System.out.println("ID: " + i + " - " + tasks.get(i));
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