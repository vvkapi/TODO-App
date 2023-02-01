package com.example.PPApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tasks_groups")
public class TaskGroup{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Tasks group's description can't be empty!")
    private String description;
    private boolean done;
    @Embedded
    private Audit audit = new Audit();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Task> tasks;


    TaskGroup(){
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) { this.done = done; }

    public Set<Task> getTasks() { return tasks; }

    void setTasks(final Set<Task> tasks) { this.tasks = tasks; }
}
