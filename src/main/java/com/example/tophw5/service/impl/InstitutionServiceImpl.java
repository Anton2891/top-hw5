package com.example.tophw5.service.impl;

import com.example.tophw5.dao.DaoImpl;
import com.example.tophw5.entity.Institution;
import com.example.tophw5.service.InstitutionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {
    private final DaoImpl dao = new DaoImpl();

    public List<Institution> getAll() {
        return dao.getAll();
    }

    @Override
    public Institution getDescriptionInstitutionById(Integer id) {
        return dao.getDescriptionInstitutionById(id);
    }

    @Override
    public void addInstitution(String name, String address, String description) {
        dao.addInstitution(name, address, description);
    }

    @Override
    public void refactorInstitutionById(Integer id, String description) {
        dao.refactorInstitutionById(id, description);
    }
}
