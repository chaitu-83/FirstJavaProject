package May12;

public class JavaControlStatement {
    public static void main(String[] args) throws Exception {
        JavaControlStatement obj = new JavaControlStatement();
        obj.rateOfHomeLoanInterest("Chase");
         obj.eligibleForHillTracingTrip(40);
         obj.print_1_to_100();
        obj.learnWhileLoop();
    }

    public void rateOfHomeLoanInterest(String bankName) {
        if (bankName.equalsIgnoreCase("jpmc")) {
            System.out.println("Home Loan Interest is " + 7.8);
        }
        if (bankName.equalsIgnoreCase("WellsFargo")) {
            System.out.println("Home Loan Interest is " + 9.8);
        }
        if (bankName.equalsIgnoreCase("Chase")) {
            System.out.println("Home Loan Interest is " + 6.8);
        }

    }

    public void eligibleForHillTracingTrip(int age) {
        if (age < 18 || age > 60) {
            System.out.println("Sorry, You Are Not Eligible For Trip. Age is " + age);
        } else if (age > 18 && age < 60) {
            System.out.println("Congrats, You Are Eligible For Tracking");
        } else {
            System.out.println("You Are Giving Wrong Input");
        }


    }

    public void print_1_to_100() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("The Current Value of i Is===>" + i);
        }
    }

    public void learnWhileLoop() {
        int i = 0, n = 20;
        while (i <= n) {
            System.out.println(" the value of i is==" + i);
            i++;
        }
    }
}
