/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem{
    
    private String taskName;
    private Boolean isDone;

    public TodoItem(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    public void MarkTask() {
        this.isDone = true;
    }

    public String getTaskName() {

        String taskName;

        if (this.isDone) {
            taskName = "[X] " + this.taskName;
        } else {
            taskName = "[ ] " + this.taskName;
        }
        return taskName;
    }

    public Boolean getIsDone() {
        return isDone;
    }
}
