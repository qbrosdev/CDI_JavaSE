package qualifier.imples.persons;

import qualifier.intfs.iPerson;

import javax.inject.Named;

/**
 * Created by V.Ghasemi
 * on 1/15/2019.
 */

@Named("Ms.JILL")
public class Employee implements iPerson {

    public void sayName() {
        System.out.println("boss");
    }

    public void sayGender() {
        System.out.println("boss");
    }

    public void sayOccupation() {
        System.out.println("boss");
    }
}
