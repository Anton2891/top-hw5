package com.example.tophw5.controller;

import com.example.tophw5.entity.Institution;
import com.example.tophw5.service.impl.InstitutionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class InstitutionController {
    private final InstitutionServiceImpl service = new InstitutionServiceImpl();

    @GetMapping("getall")
    public List<Institution> getAllInstitutions() {
        return service.getAll();
    }

    @GetMapping("desk/{id}")
    public Institution getDescriptionInstitutionById(@PathVariable("id") Integer id) {
        return service.getDescriptionInstitutionById(id);
    }

    @PostMapping("add/inst")
    @ResponseStatus(HttpStatus.CREATED)
    public void addInstitution(@RequestParam(value = "name") String name,
                               @RequestParam(value = "address") String address,
                               @RequestParam(value = "description") String description) {
        service.addInstitution(name, address, description);
    }

    @PostMapping("ref/inst/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void refactorInstitutionById(@RequestParam (value = "description") String description,
                                        @PathVariable Integer id) {
        service.refactorInstitutionById(id, description);

    }


}
