package interceptor;

import javax.annotation.Priority;
import javax.inject.Qualifier;
import javax.interceptor.Interceptor;
import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Notice the @InterceptorBinding annotation which differentiates this specifies that
 * this qualifier will be used as an Interceptor.
 */
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD, FIELD})
@Qualifier
@Priority(Interceptor.Priority.APPLICATION)
public @interface InterceptorQualifier {
}
