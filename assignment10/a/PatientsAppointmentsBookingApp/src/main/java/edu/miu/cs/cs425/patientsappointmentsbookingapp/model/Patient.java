package edu.miu.cs.cs425.patientsappointmentsbookingapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.PriorityQueue;
import java.util.StringJoiner;

@Data
@NoArgsConstructor
public class Patient {
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;

    public Patient(String firstName, String lastName, String contactPhoneNumber,
                   String email, String mailingAddress, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }



    public int getAge() {
        if (this.dateOfBirth == null) {
            return 0;
        }
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"firstName\": \"").append(firstName).append("\",");
        sb.append("\"lastName\": \"").append(lastName).append("\",");
        sb.append("\"contactPhoneNumber\": \"").append(contactPhoneNumber).append("\",");
        sb.append("\"email\": \"").append(email).append("\",");
        sb.append("\"mailingAddress\": \"").append(mailingAddress).append("\",");
        sb.append("\"dateOfBirth\": \"").append(dateOfBirth).append("\",");
        sb.append("\"age\": \"").append(getAge()).append("\"");
        sb.append("}");

        return   sb.toString();
    }

}