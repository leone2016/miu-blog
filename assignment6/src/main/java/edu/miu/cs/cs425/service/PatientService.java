package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.dto.PatientDto;
import edu.miu.cs.cs425.repository.PatientRepository;

import java.util.Arrays;
import java.util.Comparator;

public class PatientService {

    private final PatientRepository patientRepository;
    public PatientService() {
        this.patientRepository = PatientRepository.getInstance();
    }

    public PatientDto[] getPatiendSortedByDateOfBirth() {
        return Arrays.stream(patientRepository.getAllPatients())
                .map(p -> new PatientDto(
                        String.valueOf(p.getId()),
                        p.getFirstName(),
                        p.getLastName(),
                        p.getContactPhoneNumber(),
                        p.getEmail(),
                        p.getDateOfBirth(),
                        p.getMailingAddress()
                )).sorted(Comparator.comparing(PatientDto::dateOfBirth,Comparator.reverseOrder()))
                .toArray(PatientDto[]::new);
    }
}
