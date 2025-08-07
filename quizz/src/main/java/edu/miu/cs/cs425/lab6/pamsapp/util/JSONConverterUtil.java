package edu.miu.cs.cs425.lab6.pamsapp.util;

import edu.miu.cs.cs425.lab6.pamsapp.dto.PatientDTO;
import edu.miu.cs.cs425.patientsappointmentsbookingapp.model.Patient;
import org.json.JSONArray;

import java.util.Arrays;
import java.util.List;

public class JSONConverterUtil {

    public static String convertPatientArrayToJSON(List<Patient> patients) {
        JSONArray jsonArray = new JSONArray();
        patients.stream().forEach(patient -> {
            jsonArray.put(patient.toJSON());
        });
        return jsonArray.toString(2);
    }

}
