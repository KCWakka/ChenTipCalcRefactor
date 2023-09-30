public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
    public TipCalculator(int people, int tip) {
        numPeople = people;
        tipPercentage = tip;
        totalBillBeforeTip = 0;
    }
    public double getTotalBillBeforeTip {
        return totalBillBeforeTip;
    }
    public int getTipPercentage {
        return tipPercentage;
    }
    public void addmeal(double cost) {
        (totalBillBeforeTip + cost):
    }
    public double tipAmount() {
        return Math.round ( (totalBillBeforeTip * (tipPercentage / 100.0)) * 100 ) / 100.0;
    }

}
