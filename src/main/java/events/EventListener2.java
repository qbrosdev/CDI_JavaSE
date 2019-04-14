package events;

import javax.enterprise.event.Observes;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
public class EventListener2 {

    public void observeEvent(@Observes String message){
        System.out.println("EL2"+ message);
    }
}
