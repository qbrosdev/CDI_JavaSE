package alternative;

import javax.inject.Inject;

/**
 * Created by V.Ghasemi
 * on 1/19/2019.
 */
public class AlternativeContext {

    @Inject
    iService service;

    public void callService(){
        service.performService();
    }
}
