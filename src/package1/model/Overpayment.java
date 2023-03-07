package package1.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Overpayment {
    public static final String REDUCE_RATE = "REDUCE_RATE";
    public static final String REDUCE_PERIOD = "REDUCE_PERIOD";
    private final BigDecimal amount;
    private final BigDecimal provisionAmount;

    public Overpayment(final BigDecimal amount, final BigDecimal provisionAmount) {
        this.amount = amount;
        this.provisionAmount = provisionAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getProvisionAmount() {
        return provisionAmount;
    }
}
