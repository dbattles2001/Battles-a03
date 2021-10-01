package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {
    public void calculateMonthsUntilPaidOff(double i, double b, double p){
        i /= 100.0;

        System.out.println(i);

        double n = -(1.0/30.0) * log(1.0 + b/p * (1.0 - Math.pow(1.0 + i, 30.0))) / log(1.0 + i);

        System.out.printf("It will take you %.0f months to pay this card off.", n);
    }
}
