package lazyInit;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
public class VeryHeavyObjToCreate {

    public VeryHeavyObjToCreate() {
        try {
            Thread.sleep(14000L);
            setValue("value");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
