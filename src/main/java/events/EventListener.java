package events;

import javax.enterprise.event.Observes;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
public class EventListener {

    public void observeEvent(@Observes String message){
        System.out.println(message);
    }
}
