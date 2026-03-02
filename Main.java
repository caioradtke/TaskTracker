import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Main {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        TaskList tasklist = new TaskList();
        while (true) {
            String input = s.nextLine();
            tasklist.handler(input);
        }
    }
}