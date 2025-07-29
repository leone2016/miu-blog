package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.Patient;

import java.time.LocalDate;

public class PatientRepository {
    private static PatientRepository instance;

    private PatientRepository() {}

    public static PatientRepository getInstance() {
        if (instance == null) {
            instance = new PatientRepository();
        }

        return instance;
    }

    public Patient[] getAllPatients() {
        return new Patient[]{
                new Patient(1, "Daniel", "Agar", "(641) 123-0009", "dagar@m.as", "1 N Street", LocalDate.parse("1987-01-19")),
                new Patient(2, "Ana", "Smith", null, "amsith@te.edu", null, LocalDate.parse("1948-12-05")),
                new Patient(3, "Marcus", "Garvey", "(123) 292-0018", null, "4 East Ave", LocalDate.parse("2001-09-18")),
                new Patient(4, "Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za", null, LocalDate.parse("1995-02-28")),
                new Patient(5, "Mary", "Washington", null, null, "30 W Burlington", LocalDate.parse("1932-05-31"))
        };
    }
}
