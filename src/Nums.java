public class Nums {
    private static int totalRandomNumsGenerated = 0;
    private int randomNumsGenerated;
    private int num1;
    private int num2;
    public Nums (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        randomNumsGenerated = 0;
    }
    public int randBetween() {
        totalRandomNumsGenerated++;
        randomNumsGenerated++;
        return (int) (Math.random()* (num2 - num1 + 1) ) + num1;
    }
    public static int getTotalRandomNumsGenerated() {
        return totalRandomNumsGenerated;
    }
    public int getRandomNumsGenerated() {
        return randomNumsGenerated;
    }
}
