package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double i, double b, double p){
        i /= 100.0;
        i /= 365.0;

        double n = -(1.0/30.0) * Math.log(1.0 + b/p * (1.0 - Math.pow(1.0 + i, 30.0))) / Math.log(1.0 + i);

        if(n > Math.round(n)){
            n = Math.round(n)+1;
        }

        return n;
    }
}
