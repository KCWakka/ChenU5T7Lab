public class Money {
    private int dollars;
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennys;
    private static double totalcash = 0;
    public Money(int dollars, int quarters, int dimes, int nickels, int pennys) {
        this.dollars = dollars;
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennys = pennys;
        totalcash += conversion();
    }
    public double conversion() {
        double total = 0;
        total += dollars * 1;
        total += quarters * 0.25;
        total += dimes * 0.10;
        total += nickels * 0.05;
        total += pennys * 0.01;
        return total;
    }
    public static double getTotalcash() {
        return totalcash;
    }
}
