package interceptor;

import javax.inject.Inject;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
public class ContextInt {

    @Inject
    Intercepted intercepted;

    public void testInterception() {
        intercepted.thisMethodWillBeIntercepted();
    }
}
