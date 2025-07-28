package edu.miu.cs.cs425.util;

public class JSONConvertUtil {
    public static<T extends Object> String arrayObjectToJson(T[] objects) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("[");

        for (int i = 0; i < objects.length; i++) {
            jsonBuilder.append(objects[i].toString());
            if (i < objects.length - 1) {
                jsonBuilder.append(", ");
            }
        }

        jsonBuilder.append("]");
        return jsonBuilder.toString();
    }
}
