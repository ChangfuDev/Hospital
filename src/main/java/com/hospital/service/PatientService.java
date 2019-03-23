package com.hospital.service;

import com.hospital.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    String delPatient(Integer id);
    Patient getPatient(Integer id);
}
