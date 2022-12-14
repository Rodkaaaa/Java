package com.generation.generation1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.generation1.model.License;
import com.generation.generation1.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {
    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }

    public void saverLicense(License license){
        licenseRepository.save(license);
    }

    public void updateLicense(License license){
        licenseRepository.save(license);
    }

    public List<License> findAll(){
        return (List<License>) licenseRepository.findAll();
    }

    public void deleteLicense(Integer id){
        licenseRepository.deleteById(id);
    }

    public List<License> licenciaPorClase(String clase){
        return licenseRepository.FindAllClase(clase);
    }

    public List<License> licenciaPorStado(String estado){
        return licenseRepository.findAllestado(estado);
    }

    public List<License> licenciaUser(){
        return licenseRepository.BuscarLicensiasUsuarios();
    } 

}
