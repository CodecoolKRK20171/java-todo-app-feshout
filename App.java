import java.util.Scanner;

public class App{
    public static void main(String[] args) {

        TodoList toDoCollection;
        String choice, taskName;
        int index;
        Boolean play = true;
        

        toDoCollection = new TodoList();
        
        while (play) {

            
            choice = getInput();

            if (choice.equals("list")) {
                toDoCollection.printTasks();
            } 
            else if (choice.equals("add")) {
                taskName = getTaskName();
                toDoCollection.addTask(new TodoItem(taskName));
            } 
            else if (choice.equals("mark")) {
                toDoCollection.printTasks();
                index = getIndex();
                toDoCollection.markTaskByIndex(index - 1);
            } 
            else if (choice.equals("archive")) {
                toDoCollection.archiveTasks();
            } 
            else if (choice.equals("q")) {
              System.exit(0);
            }
        }
    }

    public static String getInput() {

        Scanner reader;
        String input;

        reader = new Scanner(System.in);
        System.out.println("Please specify a command [list, add, mark, archive]:");
        input = reader.next();


        return input;
    }

    public static String getTaskName() {

        Scanner reader;
        String input;

        reader = new Scanner(System.in);
        System.out.println("Enter task name:");
        input = reader.next();


        return input;
    }

    public static int getIndex() {
        Scanner reader;
        int input;

        reader = new Scanner(System.in);
        System.out.println("Enter task number to mark:");
        input = reader.nextInt();


        return input;
    }
}

