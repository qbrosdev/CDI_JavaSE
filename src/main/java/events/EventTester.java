package events;

import javax.inject.Inject;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
public class EventTester {

    @Inject
    EventListener eventListener;
    @Inject
    EventListener2 eventListener2;
    @Inject
    EventSource eventSource;

    public void doTest() {
        eventSource.fireEvent();
    }
}
