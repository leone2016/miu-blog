package edu.miu.cs.cs425.util;

import edu.miu.cs.cs425.dto.PatientDto;
import edu.miu.cs.cs425.model.Patient;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {
    public static String arrayObjectToJson(PatientDto[] patients) {
        JSONArray patientJsonArray = new JSONArray();
        Arrays.stream(patients).forEach(
                patient -> {
                    patientJsonArray.put(patient.toJSON());
                }
        );
        return patientJsonArray.toString(2);
    }
}
