package statements;

public class Investment {

    // interest rate is given as an int (e.g. interestRate = 8 means 8%)
    // cost = 0.3% i.e. 0.003


    private final double COST = 0.003;
    private int fund;
    private int interestRate;
    private boolean active;

    //Befektetés létrehozásakor (példányosításkor) az active attribútum értéke mindig igaz.

    public Investment(int fund, int interestRate) {
        active = true;
        this.fund = fund;
        this.interestRate = interestRate;

    }



    //A getYield() metódusa megkapja, hogy hány napra kérik le a hozamot, és visszaadja az adott időszakra kiszámított hozam összegét.


    public double getYield(int days){
        //max number of days with interest/yield = 365 (even for leap years)
        // (Egy befektetéskezelő cég legfeljebb egy év időtartamra vesz át összeget befektetésre az ügyfeleitől.)
        if (days > 365){ days = 365;}

        double convertedInterestRate = (double) interestRate / 100;
        double effectiveInterestRateForThePeriod = (double) days / 365.0 * convertedInterestRate;
        double yieldEarned = (double) fund * effectiveInterestRateForThePeriod;

        return yieldEarned;

    }

    //A close() metódusa lezárja a befektetést, és ezzel egyidejűleg visszaadja a teljes kifizetett összeget.
        // A lezárást az active attribútum hamisra állításával éri el.
        // A kifizetett összeg tartalmazza a tőkét és a kamatokat csökkentve a kezelési költséggel.
        // Amennyiben már lezárt befektetésre hívják meg a close() metódust, a kifizetett összeg 0 legyen!
        //(Ötlet: használd a három operandusú operátort a kifizetett összeg kiszámításához!)


    double close(int days){
        active = false;
        //max number of days with interest/yield = 365 (even for leap years)
        // (Egy befektetéskezelő cég legfeljebb egy év időtartamra vesz át összeget befektetésre az ügyfeleitől.)

        if (days > 365){ days = 365;}

        double convertedInterestRate = (double) interestRate / 100;
        double effectiveInterestRateForThePeriod = (double) days / 365.0 * convertedInterestRate;
        double yieldEarned = (double) fund * effectiveInterestRateForThePeriod;
        double fundsAtClose = fund + yieldEarned;
        double feeFundManagementCost = COST * fundsAtClose;
        double payOut = fundsAtClose - feeFundManagementCost;
        fund = 0;

        return payOut;


    }


    public double getCost() {
        return COST;
    }

    public int getFund(){
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
