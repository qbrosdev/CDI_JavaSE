package qualifier.imples.paymentMods.qualifiers;

import java.lang.annotation.RetentionPolicy;

/**
 * The @Qualifier annotation that is added to the annotation, makes this annotation discoverable by the container.
 * We can now simply add these qualifiers to our implementations.
 */

@java.lang.annotation.Documented
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@javax.inject.Qualifier
public @interface VisaPaymentQualifier {}
