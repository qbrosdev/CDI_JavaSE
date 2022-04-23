package qualifier.imples.paymentMods;

import qualifier.imples.paymentMods.qualifiers.VisaPaymentQualifier;
import qualifier.intfs.iPayment;

import java.math.BigDecimal;

@VisaPaymentQualifier
public class VisaPayment implements iPayment {

    public void pay(BigDecimal amount) {
        System.out.println("paied by visa: " + amount);
    }
}
