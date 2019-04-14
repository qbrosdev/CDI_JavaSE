package decorator;

/**
 * Created by V.Ghasemi
 * on 1/19/2019.
 */
public class SimpleService implements iService {

    public void provideService() {
        System.out.println("providing a simple service");
    }
}
