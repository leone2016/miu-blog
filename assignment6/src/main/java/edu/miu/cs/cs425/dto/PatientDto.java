package edu.miu.cs.cs425.dto;

import org.json.JSONObject;

import java.time.LocalDate;

public record PatientDto(String patientId,
                         String firstName,
                         String lastName,
                         String contactPhoneNumber,
                         String email,
                         LocalDate dateOfBirth,
                         String mailingAddress) {

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("patientId", patientId);
        jsonObject.put("firstName", firstName);
        jsonObject.put("lastName", lastName);
        jsonObject.put("contactPhoneNumber", (contactPhoneNumber != null) ? contactPhoneNumber : "null");
        jsonObject.put("email", (email != null) ? email : "null");
        jsonObject.put("dateOfBirth", dateOfBirth);
        jsonObject.put("mailingAddress", (mailingAddress != null) ? mailingAddress : "null");
        return jsonObject;

    }

}
