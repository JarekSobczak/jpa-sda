package io.mbab.sda.sdajpa.controller;

import io.mbab.sda.sdajpa.entity.Skill;
import io.mbab.sda.sdajpa.repository.SkillRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("skill")
@AllArgsConstructor
public class SkillController {

    private SkillRepository repo;

    @GetMapping("{id}")
    Skill findById(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    Skill create(@RequestBody Skill obj) {
        return repo.create(obj);
    }
}
