package edu.miu.cs.cs425.repository;

import edu.miu.cs.cs425.model.Patient;

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
                new Patient( "John", "Doe", "123-456-7890", "johndoe@gmail.com", "123 Main St, Anytown, USA", "1990-01-01"),
                new Patient( "Jane", "Smith", "987-654-3210", "janesmith@hotmail.com", "456 Elm St, Othertown, USA", "1985-05-15"),
        };
    }
}
