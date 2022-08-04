package com.example.tophw5.service;

import com.example.tophw5.AppContextTest;
import com.example.tophw5.entity.Institution;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InstitutionServiceTest extends AppContextTest {
    @Autowired
    private InstitutionService institutionService;

    @Test
    void getAll(){
        List<Institution> all = institutionService.getAll();
        assertFalse(all.isEmpty());
        System.out.println(all);
    }

    @Test
    void addInstitution(){
        List<Institution> oldAll = institutionService.getAll();
        String name = "test";
        String address = "address_test";
        String description = "description_test";
        institutionService.addInstitution(name, address, description);
        List<Institution> newAll = institutionService.getAll();
        assertTrue(oldAll.size() < newAll.size());
    }

    @Test
    void getDescriptionInstitutionById(){
        int id = 1;
        Institution institution = institutionService.getDescriptionInstitutionById(id);
        assertEquals(institution.getId(), id);
        System.out.println(institution.getDescription());
    }

    @Test
    void refactorInstitutionById(){
        int id = 5;
        String description = "description_test";
        String oldDescription = institutionService.getDescriptionInstitutionById(id).getDescription();
        institutionService.refactorInstitutionById(id, description);
        String newDescription = institutionService.getDescriptionInstitutionById(id).getDescription();
        assertNotEquals(oldDescription, newDescription);
    }
}
