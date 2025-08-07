package edu.miu.cs.cs425.patientsappointmentsbookingapp.service;

import edu.miu.cs.cs425.patientsappointmentsbookingapp.model.Patient;
import edu.miu.cs.cs425.patientsappointmentsbookingapp.repository.PatientRepository;
import edu.miu.cs.cs425.patientsappointmentsbookingapp.util.JSONConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void printAllPatients() {
        List<Patient> patientList = patientRepository.getAllPatients().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()))
                .toList();
        System.out.println(JSONConverterUtil.convertPatientArrayToJSON(patientList));
    }


}