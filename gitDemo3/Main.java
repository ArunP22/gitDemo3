public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Addition " + Calculator.add(10,15));

        System.out.println("Compound Interest "+ CompoundInterestCalculator.calculate(100000,8,5));
        System.out.println("SIP return : " + SIPCalculator.calculate(10000,12,12,20));
        HomeLoanCalculator.homeLoanCalculator(
                3600000,
                600000,
                9,
                30
        );
    }
}
