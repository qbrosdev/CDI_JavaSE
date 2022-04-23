import alternative.AlternativeContext;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import qualifier.Main;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Created by V.Ghasemi
 * on 1/12/2019.
 */
public class Test {

    public static void main(String[] args) {
        //initWeld();
        initCDI();
    }

    private static void initWeld() {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        Main main = container.select(Main.class).get();
        main.run();
    }

    private static void initCDI() {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        SeContainer container = initializer.initialize();

//        TEST QUALIFIER
//       Main main = container.select(Main.class).get();
//		main.run();

        //TEST EVENTS
//        EventTester eventTester = container.select(EventTester.class).get();
//        eventTester.doTest();

        //Test lazy
//        Context context = container.select(Context.class).get();
//        context.useHeavyObj(false);

        //TEST Intercept
//        ContextInt context = container.select(ContextInt.class).get();
//        context.testInterception();

        //TEST Decorate
//        DecoContext context = container.select(DecoContext.class).get();
//        context.callService();

        //TEST Alternative
        AlternativeContext context = container.select(AlternativeContext.class).get();
        context.callService();

    }

}
