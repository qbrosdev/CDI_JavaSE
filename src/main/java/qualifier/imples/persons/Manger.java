package qualifier.imples.persons;

import qualifier.intfs.iPerson;

import javax.enterprise.inject.Alternative;


/**
 * the @default is set for all the implementations to remove ambiguity we should add @alternative
 * for the other implementations
 */
@Alternative
public class Manger implements iPerson {

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
