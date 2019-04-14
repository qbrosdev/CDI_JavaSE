package javaAnnotations;

/**
 * 1.SOURCE: annotation retained only in the source file and is discarded during compilation.

 2.CLASS: annotation stored in the .class file during compilation, not available in the run time.
 Appear in the decompiled class, but can't be inspected at run-time with reflection with getAnnotations()

 3.RUNTIME: annotation stored in the .class file and available in the run time.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// we need our Annotation to be present at runtime to use it in our Annotation processor
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/*The @ symbol denotes an annotation type definition.

That means it is not really an interface, but rather a new annotation type --
to be used as a function modifier, such as @override. */
public @interface CustomAnnotation {
    public String annotationValue() default "";
}
