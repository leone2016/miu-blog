package edu.miu.cs.cs425;

import edu.miu.cs.cs425.model.Patient;
import edu.miu.cs.cs425.repository.PatientRepository;
import edu.miu.cs.cs425.util.JSONConverterUtil;

import java.util.Arrays;
import java.util.Comparator;

public class PAMSApp {

    private final PatientRepository patientRepository;

    public PAMSApp() {
        this.patientRepository = PatientRepository.getInstance();
    }
    public static void main(String[] args) {
        System.out.println("SWE 425 - Software Engineering II");
        System.out.println("Patient Management System (PAMS) Application");
        System.out.println("Date: " + java.time.LocalDate.now());

        var app = new PAMSApp();
        var patients = app.patientRepository.getAllPatients();
        Arrays.stream(patients)
                .sorted(Comparator.comparing(Patient::getDateOfBirth))
                .forEach(System.out::println);
        var jsonData = JSONConverterUtil.arrayObjectToJson(patients);
        System.out.println(jsonData);
    }
}