package io.mbab.sda.sdajpa.controller;

import io.mbab.sda.sdajpa.entity.Position;
import io.mbab.sda.sdajpa.repository.PositionRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project")
@AllArgsConstructor
public class ProjectController {

    private PositionRepository repo;

    @GetMapping("{id}")
    Position findById(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    Position create(@RequestBody Position obj) {
        return repo.create(obj);
    }
}
