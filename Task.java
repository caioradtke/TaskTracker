import java.time.LocalDateTime;

public class Task {
    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public  Task (String description) {
        this.description = description;
    }
    
}
