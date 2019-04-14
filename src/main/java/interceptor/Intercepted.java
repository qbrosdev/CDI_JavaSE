package interceptor;

import javax.enterprise.inject.Model;
import javax.inject.Named;

/**
 Now we can apply this annotation either at class level
 (and will intercept all method calls) or at method level, so it will intercept just that method call.  */


public class Intercepted {

    @InterceptorQualifier
    public void thisMethodWillBeIntercepted(){
        System.out.println("method contents");
    }
}
