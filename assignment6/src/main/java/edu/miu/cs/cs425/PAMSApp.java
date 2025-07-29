package edu.miu.cs.cs425;

import edu.miu.cs.cs425.service.PatientService;
import edu.miu.cs.cs425.util.JSONConverterUtil;

public class PAMSApp {


    public static void main(String[] args) {
        System.out.println("SWE 425 - Software Engineering II");
        System.out.println("Patient Management System (PAMS) Application");
        System.out.println("Date: " + java.time.LocalDate.now());

        var patientService = new PatientService();
        var patients = patientService.getPatiendSortedByDateOfBirth();
        var jsonData = JSONConverterUtil.arrayObjectToJson(patients);
        System.out.println(jsonData);
    }
}