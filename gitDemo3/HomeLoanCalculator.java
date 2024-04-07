public class HomeLoanCalculator {
    public static void homeLoanCalculator(int totalAmount,int downPayment,double rate,int tenure) {
            int principal = totalAmount - downPayment;
            double monthlyRate = rate / 100/ 12;
            int totalPayment = tenure * 12;

            double emi = (principal*monthlyRate*Math.pow(1+monthlyRate,totalPayment))/(Math.pow(1 + monthlyRate, totalPayment) - 1);
            double totalAmountPaid = emi*totalPayment;
            double totalInterest = totalAmountPaid -principal;

        System.out.println("EMI amount : "+ String.format("%.2f",emi));
        System.out.println("Total amount paid back : "+ String.format("%.2f",totalAmountPaid));
        System.out.println("Total interest charged : "+ String.format("%.2f",totalInterest));
    }
}
