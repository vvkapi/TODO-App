package com.example.PPApp.adapter;

import com.example.PPApp.model.Task;
import com.example.PPApp.model.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {
    @Override
    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);
}
