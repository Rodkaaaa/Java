package com.generation.generation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.generation.generation1.model.License;
import com.generation.generation1.service.LicenseService;



@Controller
@CrossOrigin("*")                    
public class LicenseController {

    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }

    @PostMapping("/License/save")
    public void saveLicense(@RequestBody License license){
        licenseService.saverLicense(license);
    }

    @PutMapping("/License/update")
    public void updateLicense(@RequestBody License license){
        licenseService.updateLicense(license);
    }

    @DeleteMapping("/License/delete/{id}")
    public void deleteLicense(@PathVariable("id") Integer id){
        licenseService.deleteLicense(id);
    }

    @GetMapping("/License/findAll/")
    public List<License> todasLasLicencias(){
        return licenseService.findAll();
    }

    @GetMapping("/License/clase/{clase}")
    public List<License> licensiaPorClase(@PathVariable("clase") String clase){
        return licenseService.licensiaPorClase(clase);
    }

    @GetMapping("/License/clase/{estado}")
    public List<License> findEstado(@PathVariable("estado") String estado){
        return licenseService.licensiaPorStado(estado);
    }

    @GetMapping("/License/claseUsuario/")
    public List<License> licensiaUser(){
        return licenseService.licensiaUser();
    } 
}
