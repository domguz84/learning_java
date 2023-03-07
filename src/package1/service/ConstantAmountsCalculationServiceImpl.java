
package package1.service;

import package1.model.InputData;
import package1.model.Overpayment;
import package1.model.Rate;
import package1.model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConstantAmountsCalculationServiceImpl implements ConstantAmountsCalculationService {

    //   private static final BigDecimal YEAR = BigDecimal.valueOf(12);

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment) {
        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal q = AmountsCalculationService.calculateQ(interestPercent);

        BigDecimal residualAmount = inputData.getAmount();

        BigDecimal interestAmount = AmountsCalculationService.calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal rateAmount = calculateConstantRateAmount(q, interestAmount, residualAmount, inputData.getAmount(), inputData.getMonthsDuration());
        BigDecimal capitalAmount = AmountsCalculationService.compareCapitalWithResidual(rateAmount.subtract(interestAmount), residualAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

//        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
//        BigDecimal rateAmount = calculateConstantRateAmount(
//                q, referenceAmount, referenceDuration, interestAmount, residualAmount);
//        BigDecimal capitalAmount = calculateCapitalAmount(rateAmount, interestAmount, residualAmount);
//
//        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
//    }

    @Override
    public RateAmounts calculate(final InputData inputData, Overpayment overpayment, final Rate previousRate) {
        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal q = AmountsCalculationService.calculateQ(interestPercent);

        BigDecimal residualAmount = previousRate.getMortgageResidual().getResidualAmount();
        BigDecimal referenceAmount = previousRate.getMortgageReference().getReferenceAmount();
        BigDecimal referenceDuration = previousRate.getMortgageReference().getReferenceDuration();

        BigDecimal interestAmount = AmountsCalculationService.calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal rateAmount = calculateConstantRateAmount(q, interestAmount, residualAmount, referenceAmount, referenceDuration);
        BigDecimal capitalAmount = AmountsCalculationService.compareCapitalWithResidual(rateAmount.subtract(interestAmount), residualAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

//    private BigDecimal calculateQ(BigDecimal interestPercent) {
//        return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
//    }
//
//    private BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
//        return residualAmount.multiply(interestPercent).divide(YEAR, 50, RoundingMode.HALF_UP);
//    }

    private BigDecimal calculateConstantRateAmount(
            final BigDecimal q,
            //  final BigDecimal amount,
            //  final BigDecimal monthsDuration,
            final BigDecimal interestAmount,
            final BigDecimal residualAmount,
            final BigDecimal referenceAmount,
            final BigDecimal referenceDuration
    ) {
        BigDecimal rateAmount = referenceAmount
                .multiply(q.pow(referenceDuration.intValue()))
                .multiply(q.subtract(BigDecimal.ONE))
                .divide(q.pow(referenceDuration.intValue()).subtract(BigDecimal.ONE), 2, RoundingMode.HALF_UP);

        return compareRateWithResidual(rateAmount, interestAmount, residualAmount);
    }

    private BigDecimal compareRateWithResidual(
            final BigDecimal rateAmout,
            final BigDecimal interestAmout,
            final BigDecimal residualAmount
    ) {
        if (rateAmout.subtract(interestAmout).compareTo(residualAmount) >= 0) {
            return residualAmount.add(interestAmout);
        }
        return rateAmout;
    }
}
//    private BigDecimal calculateCapitalAmount(
//            BigDecimal rateAmount,
//            BigDecimal interestAmount,
//            BigDecimal residualAmount
//    ) {
//        BigDecimal capitalAmount = rateAmount.subtract(interestAmount);
//
//        if (capitalAmount.compareTo(residualAmount) >= 0) {
//            return residualAmount;
//        }
//        return capitalAmount;
//    }
//}

