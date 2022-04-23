package qualifier;

import qualifier.imples.WorkPalace;
import qualifier.imples.paymentMods.qualifiers.VisaPaymentQualifier;
import qualifier.intfs.iPayment;

import javax.inject.Inject;
import java.math.BigDecimal;

public class Main {

    @Inject
    private WorkPalace workPlace;

    @Inject
    @VisaPaymentQualifier
    private iPayment payment;

    public void run() {
        workPlace.getMsJill().sayName();
        workPlace.getMrJack().sayName();
        payment.pay(new BigDecimal("123"));
    }

}
