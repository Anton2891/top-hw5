package com.example.tophw5.service;

import com.example.tophw5.entity.Institution;

import java.util.List;

public interface InstitutionService {
    List<Institution> getAll();
    Institution getDescriptionInstitutionById(Integer id);
    void addInstitution(String name, String address, String description);
    void refactorInstitutionById(Integer id, String description);

}
