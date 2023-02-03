package com.example.PPApp.logic;

import com.example.PPApp.TaskConfigurationProperties;
import com.example.PPApp.model.ProjectRepository;
import com.example.PPApp.model.TaskGroupRepository;
import com.example.PPApp.model.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogicConfiguration {
    @Bean
    ProjectService service(final ProjectRepository repository,
                           final TaskGroupRepository taskGroupRepository,
                           final TaskGroupService taskGroupService,
                           final TaskConfigurationProperties config) {
        return new ProjectService(repository, taskGroupRepository, taskGroupService, config);
    }

    @Bean
    TaskGroupService taskGroupService(final TaskGroupRepository taskGroupRepository,
                                      final TaskRepository taskRepository){
        return new TaskGroupService(taskGroupRepository, taskRepository);
    }
}
