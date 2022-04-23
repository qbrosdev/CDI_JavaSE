# JAVA SE_CDI

To benefit from services that CDI provides we don't need to run our application in an IOC framework to benefit from the
features. The only-thing that we need a CDI implementation in our classpath. For this we can
use [WELD](http://weld.cdi-spec.org/)
which is the **CDI reference implementation in Java SE**.

In the following we have different use case of CDI in Java SE.

## Decorator

A  **decorator**  is a Java class that is annotated javax.decorator.Decorator and that has a corresponding  
decorators' element in the beans.xml file.

A decorator bean class must also have a delegate injection point, which is annotated javax.decorator.Delegate. This
injection point can be a field, a constructor parameter, or an initializer method parameter of the decorator class.

## Alternative

Decorators and Alternatives are similar because they can be used to provide different implementations for  
your use cases. However, Alternative beans can be used to provide a whole different bean implementation,   
while decorators can be used to further specialize a single method/attribute, and they allow as interacting with the
method/attribute we are going to specialize.

## Interceptor

Decorators and Interceptors are similar because they can be both used to "enrich" or "decorate" one method call   
with additional tasks. However, Interceptors are used for general tasks, which are not related with your class in
particular (e.g. auditing).

## Lazy Init

It is not a good practice to inject classed that take time to instantiate, when we don't need them, and it will lead to
longer load time for the application

## Event

To observe an event you’ll have to add an "observer method" in an enabled bean (bean should be alive)
of your application. An observer method is a method whose "first parameter" has the **@Observes** annotation.  
Off course qualifier may be added to the observer to restrict event triggering.  
The observer method may have other beans as parameters.

Unlike java, CDI understands parameter "type erasure". For instance take these 2 observer methods:

    public void processNumberList(@Observes List<Number> event) {...}  
      
    public void processIntegerList(@Observes List<Integer> event) {...}  

The container will make the distinction between both when resolving observer depending on the parameterized type of the
event.