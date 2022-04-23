package lazyInit;


public class VeryHeavyObjToCreate {

    private String value;

    public VeryHeavyObjToCreate() {
        try {
            Thread.sleep(20000L);
            setValue("value");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
