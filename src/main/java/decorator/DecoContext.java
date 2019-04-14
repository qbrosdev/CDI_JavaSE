package decorator;

import javax.inject.Inject;

/**
 * Created by V.Ghasemi
 * on 1/19/2019.
 */
public class DecoContext {

    @Inject
    iService iService;

    public void callService(){
        iService.provideService();
    }
}
