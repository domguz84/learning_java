package package1.service;

import package1.model.InputData;
import package1.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {
    Overpayment calculate(final BigDecimal rateNumber, final InputData inputData);
}
