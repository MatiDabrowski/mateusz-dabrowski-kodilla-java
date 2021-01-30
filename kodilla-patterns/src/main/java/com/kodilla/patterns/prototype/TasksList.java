package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class TasksList {

    private final String name;
    private  final List<Task> tasks = new ArrayList<>();

    public TasksList(final String name){
        this.name = name;
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasksList tasksList = (TasksList) o;

        if (name != null ? !name.equals(tasksList.name) : tasksList.name != null) return false;
        return tasks != null ? tasks.equals(tasksList.tasks) : tasksList.tasks == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
        return result;
    }
}
