package com.example.PPApp.model.projection;

import com.example.PPApp.model.Task;
import com.example.PPApp.model.TaskGroup;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class GroupTaskWriteModel {
    @NotBlank(message="Tasks group's description can't be empty!")
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime deadline;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(final LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Task toTask(final TaskGroup group) {

        return new Task(description, deadline, group);
    }
}
