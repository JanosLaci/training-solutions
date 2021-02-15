package exam03;

public enum CruiseClass {
    LUXURY(3.0), FIRST(1.8) , SECOND(1.0);

    double surchargeMultiplicator;

    CruiseClass(double surchargeMultiplicator) {
        this.surchargeMultiplicator = surchargeMultiplicator;
    }

    public double getSurchargeMultiplicator() {
        return surchargeMultiplicator;
    }
}


