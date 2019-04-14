package decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

/**
 * Our simple service is unaware of financial and tax stuff (VAT)
 * we need to integrate it in our service
 */

@Decorator
public class ServiceVATDecorator implements iService {

    @Inject
    @Delegate
    private SimpleService simpleService;
    @Inject
    private VAtService vAtService;

    public void provideService() {
        simpleService.provideService();
        vAtService.computeVAT();
    }
}
