package com.example.wgsuniversity.controller;

import com.example.wgsuniversity.model.Major;
import com.example.wgsuniversity.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/majors")
public class MajorController {
    private final MajorService majorService;

    @Autowired
    public MajorController(MajorService majorService) {
        this.majorService = majorService;
    }

    @GetMapping
    public List<Major> getAllMajors() {
        return majorService.getAllMajors();
    }

    @GetMapping("/{id}")
    public Major getMajorById(@PathVariable Long id) {
        return majorService.getMajorById(id);
    }

    @PostMapping
    public Major createMajor(@RequestBody Major major) {
        return majorService.createMajor(major);
    }

    @PutMapping("/{id}")
    public Major updateMajor(@PathVariable Long id, @RequestBody Major updatedMajor) {
        return majorService.updateMajor(id, updatedMajor);
    }

    @DeleteMapping("/{id}")
    public void deleteMajor(@PathVariable Long id) {
        majorService.deleteMajor(id);
    }
}
