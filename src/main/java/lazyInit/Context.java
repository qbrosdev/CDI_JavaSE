package lazyInit;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;


public class Context {


    /**
     * This is bad practise never do this shit with classes that take time to load
     @Inject
    VeryHeavyObjToCreate veryHeavyObjToCreateNOT_LAZY_LOADED;
     */

    @Inject
    Instance<VeryHeavyObjToCreate> veryHeavyObjToCreate;

    public void useHeavyObj(boolean flag){
        if(flag){
            System.out.println(veryHeavyObjToCreate.get().getValue());
        } else {
            System.out.println("heavy obj is  not loaded");
        }
    }
}
