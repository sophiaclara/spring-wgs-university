package com.example.wgsuniversity.service;

import com.example.wgsuniversity.model.Major;
import com.example.wgsuniversity.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {
    private final MajorRepository majorRepository;

    @Autowired
    public MajorService(MajorRepository majorRepository) {
        this.majorRepository = majorRepository;
    }

    public List<Major> getAllMajors() {
        return majorRepository.findAll();
    }

    public Major getMajorById(Long id) {
        return majorRepository.findById(id).orElse(null);
    }

    public Major createMajor(Major major) {
        return majorRepository.save(major);
    }

    public Major updateMajor(Long id, Major updatedMajor) {
        Major existingMajor = majorRepository.findById(id).orElse(null);
        if (existingMajor != null) {
            existingMajor.setName(updatedMajor.getName());
            return majorRepository.save(existingMajor);
        }
        return null;
    }

    public void deleteMajor(Long id) {
        majorRepository.deleteById(id);
    }
}
