package com.example.PPApp.controller;

import com.example.PPApp.TaskConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InfoController {
    InfoController(final DataSourceProperties dataSource, final TaskConfigurationProperties prop) {
        this.dataSource = dataSource;
        this.prop = prop;
    }

    private DataSourceProperties dataSource;
    private TaskConfigurationProperties prop;

    @GetMapping("/info/url")
    String url(){
        return dataSource.getUrl();
    }

    @GetMapping("/info/prop")
    boolean myProp() {
        return prop.getTemplate().isAllowMultipleTasks();
    }
}
