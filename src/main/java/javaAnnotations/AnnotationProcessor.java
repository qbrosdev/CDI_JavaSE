package javaAnnotations;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Annotation processors use reflection to find annotations in a class and process them
 */
public class AnnotationProcessor {

    public String processAnnotatedClass(Object object) {
        try {
            Class<?> objectClass = (object).getClass();
            Map<String, String> jsonElements = new HashMap<>();
            for (Field field : objectClass.getDeclaredFields()) {
                //If the field is private, first we need to make it accessible
                field.setAccessible(true);
                if (field.isAnnotationPresent(CustomAnnotation.class)) {
                    jsonElements.put(getSerializedKey(field), (String) field.get(object));
                }
            }
//            return toJsonString(jsonElements);

        } catch (IllegalAccessException e) {
            System.out.println("access exception");
        }
        return "";
    }

    private static String getSerializedKey(Field field) {
        String annotationValue = field.getAnnotation(CustomAnnotation.class).annotationValue();
        if (annotationValue.isEmpty()) {
            return field.getName();
        }
        else {
            return annotationValue;
        }
    }
}
