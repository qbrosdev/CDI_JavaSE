package lazyInit;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;


public class Context {

    /**
     * Don't do this.
     *
     * @Inject VeryHeavyObjToCreate veryHeavyObjToCreateNOT_LAZY_LOADED;
     */

    @Inject
    Instance<VeryHeavyObjToCreate> veryHeavyObjToCreate;

    public void useHeavyObj(boolean flag) {
        if (flag) {
            System.out.println(veryHeavyObjToCreate.get().getValue());
        } else {
            System.out.println("heavy obj is  not loaded");
        }
    }
}
