package edu.miu.cs.cs425.util;

import edu.miu.cs.cs425.model.Patient;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {
    public static String arrayObjectToJson(Patient[] patients) {
        JSONArray patientJsonArray = new JSONArray();
        Arrays.stream(patients).forEach(
                patient -> {
                    patientJsonArray.put(patient.toJson());
                }
        );
        return patientJsonArray.toString();
    }
}
