package qualifier.imples;

import qualifier.intfs.iPerson;

import javax.inject.Inject;
import javax.inject.Named;

public class WorkPalace {

    /**
     * Field vs constructor/setter injection, in the first case you are limited to a container or a service to provide
     * injection for you but when you are using constructor/setter injection you can easily use regular methods and constructors
     * when you dont have access to CDI
     */

    @Inject
    private @Named("Ms.JILL")
    iPerson msJill;

    @Inject
    private @Named("MrJACK")
    iPerson mrJack;

    public iPerson getMsJill() {
        return msJill;
    }

    public iPerson getMrJack() {
        return mrJack;
    }
}
