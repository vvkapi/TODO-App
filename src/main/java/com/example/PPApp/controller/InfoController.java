package com.example.PPApp.controller;

import com.example.PPApp.TaskConfigurationProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
class InfoController {
    InfoController(final DataSourceProperties dataSource, final TaskConfigurationProperties prop) {
        this.dataSource = dataSource;
        this.prop = prop;
    }

    private final DataSourceProperties dataSource;
    private final TaskConfigurationProperties prop;

    @GetMapping("/url")
    String url() {
        return dataSource.getUrl();
    }

    @GetMapping("/prop")
    boolean myProp() {
        return prop.getTemplate().isAllowMultipleTasks();
    }
}
