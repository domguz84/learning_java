package package1.service;

import package1.model.InputData;
import package1.model.Rate;
import package1.model.TimePoint;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimePointCalculationServiceImpl implements TimePointCalculationService {

    // private static final BigDecimal YEAR = BigDecimal.valueOf(12);

    public TimePoint calculate(BigDecimal rateNumber, final InputData inputData) {
        BigDecimal year = calculateYear(rateNumber);
        BigDecimal month = calculateMonth(rateNumber);
        LocalDate date = inputData.getRepaymentStartDate();
        return new TimePoint(year, month, date);
    }

    public TimePoint calculate(BigDecimal rateNumber, Rate previousRate) {
        BigDecimal year = calculateYear(rateNumber);
        BigDecimal month = calculateMonth(rateNumber);
        LocalDate date = previousRate.getTimePoint().getDate().plus(1, ChronoUnit.MONTHS);
        return new TimePoint(year, month, date);
    }


    private BigDecimal calculateYear(final BigDecimal rateNumber) {
        return rateNumber.divide(AmountsCalculationService.YEAR, RoundingMode.UP).max(BigDecimal.ONE);
    }

    private BigDecimal calculateMonth(final BigDecimal rateNumber) {
        return BigDecimal.ZERO.equals(rateNumber.remainder(AmountsCalculationService.YEAR))
                ? AmountsCalculationService.YEAR
                : rateNumber.remainder(AmountsCalculationService.YEAR);
    }
}
