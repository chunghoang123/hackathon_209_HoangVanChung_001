package com.ptit.devops.lab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LabController {

    private final LabRepository repository;
    private final LabSeeder seeder;

    @Value("${app.version:unknown}")
    private String appVersion;

    public LabController(LabRepository repository, LabSeeder seeder) {
        this.repository = repository;
        this.seeder = seeder;
    }

    @GetMapping("/api/labs")
    public Map<String, Object> getLabs() {
        List<Lab> labs = seeder.seedIfAbsent();
        return Map.of(
            "appVersion", appVersion,
            "count", labs.size(),
            "labs", labs
        );
    }
}
