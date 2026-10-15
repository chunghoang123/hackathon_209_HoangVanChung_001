package com.ptit.devops.lab;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LabSeeder {

    private final LabRepository repository;

    public LabSeeder(LabRepository repository) {
        this.repository = repository;
    }

    public List<Lab> seedIfAbsent() {
        if (repository.count() == 0) {
            repository.saveAll(List.of(
                new Lab(null, "Lab-01", "Tầng 1", 30, "ACTIVE"),
                new Lab(null, "Lab-02", "Tầng 2", 25, "ACTIVE"),
                new Lab(null, "Lab-03", "Tầng 3", 40, "INACTIVE"),
                new Lab(null, "Lab-04", "Tầng 4", 20, "ACTIVE"),
                new Lab(null, "Lab-05", "Tầng 5", 35, "ACTIVE"),
                new Lab(null, "Lab-06", "Tầng 6", 28, "MAINTENANCE"),
                new Lab(null, "Lab-07", "Tầng 7", 50, "ACTIVE"),
                new Lab(null, "Lab-08", "Tầng 8", 15, "ACTIVE")
            ));
        }
        return repository.findAll();
    }
}
