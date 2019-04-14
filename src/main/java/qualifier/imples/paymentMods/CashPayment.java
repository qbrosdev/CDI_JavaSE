package qualifier.imples.paymentMods;

import qualifier.imples.paymentMods.qualifiers.CashPaymentQualifier;
import qualifier.intfs.iPayment;

import java.math.BigDecimal;



@CashPaymentQualifier
public class CashPayment implements iPayment {
    public void pay(BigDecimal amount) {
        System.out.println("paied cach: "+amount);
    }
}
