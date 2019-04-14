package qualifier.imples.persons;

import qualifier.intfs.iPerson;

import javax.inject.Named;

/**
 * Using cdi with qualifier:
 * https://dzone.com/articles/java-ee6-cdi-named-components
 * https://www.baeldung.com/java-ee-cdi
 */


@Named("MrJACK")
public class NamedPerson implements iPerson {
    public void sayName() {
        System.out.println("MrJACK");
    }

    public void sayGender() {
        System.out.println("MrJACK");
    }

    public void sayOccupation() {
        System.out.println("MrJACK");
    }
}
