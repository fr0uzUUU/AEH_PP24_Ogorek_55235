package pl.pp;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void removeTask(String title) {
        boolean removed = tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void markTaskAsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                if(task.isCompleted() == false) {
                    task.setCompleted(true);
                    System.out.println("Task marked as completed.");
                }
                else{
                    task.setCompleted(false);
                    System.out.println("Task marked as not completed.");
                }
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
