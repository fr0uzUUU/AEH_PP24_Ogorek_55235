package pl.pp;
import java.util.ArrayList;
import java.util.Scanner;
public class mojaPietnastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("|--------------------------|");
            System.out.println("|  To-Do List Application  |");
            System.out.println("|--------------------------|");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(title, description);
                    break;
                case 2:
                    System.out.print("Enter task title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    toDoList.removeTask(titleToRemove);
                    break;
                case 3:
                    System.out.print("Enter task title to mark as completed: ");
                    String titleToComplete = scanner.nextLine();
                    toDoList.markTaskAsCompleted(titleToComplete);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}