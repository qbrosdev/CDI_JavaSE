package events;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
public class EventSource {

    @Inject
    private Event<String> simpleMessageEvent;

    public void fireEvent(){
        simpleMessageEvent.fire("Hello");
    }
}
