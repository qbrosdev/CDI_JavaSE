package alternative;

import javax.enterprise.inject.Alternative;

/**
 * Created by V.Ghasemi
 * on 1/19/2019.
 */

@Alternative
public class AlternativeImplementation implements iService {

    public void performService() {
        System.out.println("This is Alternative (for example Mock) implementation");
    }
}
