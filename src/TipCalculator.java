public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
    public TipCalculator(int people, int tip) {
        numPeople = people;
        tipPercentage = tip;
        totalBillBeforeTip = 0;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public int getTipPercentage() {
        return tipPercentage;
    }
    public void addMeal(double cost) {
        totalBillBeforeTip += cost ;
    }
    public double tipAmount() {
        return Math.round ( (getTotalBillBeforeTip() * (getTipPercentage() / 100.0)) * 100 ) / 100.0;
    }
    public double totalBill() {
        return tipAmount() + getTotalBillBeforeTip();
    }
    public double perPersonCostBeforeTip() {
        return (Math.round (getTotalBillBeforeTip() / numPeople * 100) / 100.0);
    }
    public double perPersonTotalCost() {
        return (Math.round ( totalBill() / numPeople * 100) / 100.0);
    }
    public double perPersonTipAmount() {
        return (Math.round ( tipAmount() / numPeople * 100) / 100.0);
    }
}
