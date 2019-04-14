package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

/**
 * And now will code the Interceptor definition, which bears the qualifier annotation
 * (@InterceptorQualifier) at the top of it */


@InterceptorQualifier
@Interceptor
public class interceptorImple implements Serializable {

        /* An interceptor class often contains a method annotated @AroundInvoke,
    which specifies the tasks the interceptor will perform when intercepted methods
    are invoked.  It can also contain a method annotated @PostConstruct, @PreDestroy,
    @PrePassivate, or @PostActivate, to specify lifecycle callback interceptors,
    and a method annotated @AroundTimeout, to specify EJB timeout interceptors.
    An interceptor class can contain more than one interceptor method, but it must h
    ave no more than one method of each type.*/


    /* Every @AroundInvoke method takes a javax.interceptor.InvocationContext argument, returns a java.lang.Object,
    and throws an Exception. It can call InvocationContext methods.
    The @AroundInvoke method must call the proceed method, which causes the target class method to be invoked. */
    @AroundInvoke
    public Object logMethodEntry(InvocationContext ctx) throws Exception{
        System.out.println("Before entering method:" + ctx.getMethod().getName());
        return ctx.proceed();
    }

}
